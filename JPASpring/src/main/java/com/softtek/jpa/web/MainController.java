package com.softtek.jpa.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/")
@Controller
public class MainController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String root() {
		return "home";
	}
}
