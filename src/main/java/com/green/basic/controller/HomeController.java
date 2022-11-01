package com.green.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	// /(root) : http://localhost:8080 
	@RequestMapping("/")
	public  String   home() {
		return  "home";     // /WEB-INF/views/home.jsp
	}
	
	// /List
	@RequestMapping("/List")
	public String list() {
		return "list";
	}
	
}






