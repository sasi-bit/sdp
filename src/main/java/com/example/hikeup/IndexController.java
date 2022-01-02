package com.example.hikeup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	@RequestMapping(value="/about", method = RequestMethod.GET)
	public String about() {
		return "about";
	}	
	@RequestMapping(value="/contact", method = RequestMethod.GET)
	public String contact() {
		return "contact";
	}	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	@RequestMapping(value="/job", method = RequestMethod.GET)
	public String job() {
		return "jobdetails";
	}
	
	
	

}
