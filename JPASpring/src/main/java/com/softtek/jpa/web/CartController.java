package com.softtek.jpa.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softtek.jpa.domain.Cart;
import com.softtek.jpa.services.CartService;

@RequestMapping(value = "/")
@Controller
public class CartController {

	@Autowired
	CartService cartService;


	// Returns the cart list views.
	@RequestMapping(value = "/carts/list")
	public String List() {
		return "listcarts";
	}

	// Returns the list of carts with its foreign keys.
	@RequestMapping(value = "/getcartlist", method = RequestMethod.GET)
	public ResponseEntity<List<Cart>> cartList() {
		List<Cart> cartList = cartService.getCartList();
		System.out.println(cartList);
		if (cartList.isEmpty()) {
			return new ResponseEntity<List<Cart>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Cart>>(cartList, HttpStatus.OK);
	}

//	@RequestMapping(value = "/editcart", method = RequestMethod.GET)
//	public String editCart(@RequestParam Long cartId, @RequestParam String status, HttpServletRequest request) {
//		Cart cart = cartService.cart(cartId);
//		List<Status> cartStatus = statusService.statusList("CART");
//		//List<ShipTo> shipTos = shipToService.shipToList();
//		request.setAttribute("cart", cart);
//		request.setAttribute("cartStatus", cartStatus);
//		//request.setAttribute("shipTos", shipTos);
//		request.setAttribute("status", status);
//		return "editcart";
//	}
}
