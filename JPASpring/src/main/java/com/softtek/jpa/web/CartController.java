package com.softtek.jpa.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.softtek.jpa.domain.Cart;
import com.softtek.jpa.domain.ShipTo;
import com.softtek.jpa.domain.Status;
import com.softtek.jpa.services.CartService;
import com.softtek.jpa.services.ShipToService;
import com.softtek.jpa.services.StatusService;

@RequestMapping(value = "/cart")
@Controller
public class CartController {
	private static final Logger logger = LoggerFactory.getLogger(CartController.class);

	@Autowired
	CartService cartService;

	@Autowired
	StatusService statusService;;

	@Autowired
	ShipToService shipToService;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String root() {
		return "home";
	}

	@RequestMapping(value = "/list")
	public String List() {
		return "listcarts";
	}

	@RequestMapping(value = "/getcartlist", method = RequestMethod.GET)
	public ResponseEntity<?> cartList() {
		List<Cart> cartList = cartService.cartList();
		if (cartList.isEmpty()) {
			return new ResponseEntity<List<Cart>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Cart>>(cartList, HttpStatus.OK);

	}

	@RequestMapping(value = "/editcart", method = RequestMethod.GET)
	public String editCart(@RequestParam Long cartId, @RequestParam String status, HttpServletRequest request) {
		Cart cart = cartService.cart(cartId);
		List<Status> cartStatus = statusService.statusList("CART");
		List<ShipTo> shipTos = shipToService.shipToList();
		request.setAttribute("cart", cart);
		request.setAttribute("cartStatus", cartStatus);
		request.setAttribute("shipTos", shipTos);
		request.setAttribute("status", status);
		return "editcart";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateCart(HttpServletRequest request) {
		return null;
	}
}
