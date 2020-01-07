package com.junengguoji.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")
public class IndexController {

	@RequestMapping("/")
	public String index() {
		System.out.println("test");
		return "index.html";
	}
	
	
}
