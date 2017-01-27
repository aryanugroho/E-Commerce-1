package com.softtek.jpa.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.softtek.jpa.domain.User;
import com.softtek.jpa.services.UserService;

@RequestMapping(value = "/user")
@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@RequestMapping(value = "/list")
	public String List() {
		return "listusers";
	}

	@RequestMapping(value = "/getuserlist", method = RequestMethod.GET)
	public ResponseEntity<List<User>> userList() {
		List<User> users = userService.userList();
		if (users.isEmpty()) {
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

	@RequestMapping(value = "/find", method = RequestMethod.POST)
	public ResponseEntity<?> searchUser(@RequestBody String name) {
		System.out.println(name);
		List<User> userList = userService.duplicateUser(name);
		System.out.println(userList);
		if (userList.size() > 1) {
			return new ResponseEntity<List<User>>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<List<User>>(userList, HttpStatus.OK);

	}

	@RequestMapping(value = "/edituser", method = RequestMethod.GET)
	public String editUser(@RequestParam String username, @RequestParam String status, HttpServletRequest request) {
		User user = userService.findUser(username);
//		List<UserRole> userRoleList = userRoleService.userRoleList();
//		List<String> listStatus = userRoleService.statusList();
		request.setAttribute("users", user);
//		request.setAttribute("userRole", userRoleList);
//		request.setAttribute("listStatus", listStatus);
		request.setAttribute("status", status);
		return "edituser";
	}

	@RequestMapping(value = "/create")
	public ModelAndView create(@RequestParam String status) {
		return null;
	}

	/*@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute User user, HttpServletRequest request) {

		final String user_role_id = new String(request.getParameter("userRole"));
		if (userService.update(user, user_role_id)) {
			return "redirect:/User/List";
		}
		return "redirect:/User/edit?username=" + user.getUsername() + "&status=Not valid";
	}*/

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute User user, @RequestParam String userRoleId,
			@RequestParam String description) {
		 return null;
	}
}
