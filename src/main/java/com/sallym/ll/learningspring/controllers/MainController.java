package com.sallym.ll.learningspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/tts")
	public String tts() {
		return "index";
	}
	@RequestMapping("/tpage")
	public String glob() {
		return "index2";
	}

}
