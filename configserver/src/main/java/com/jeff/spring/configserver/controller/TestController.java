package com.jeff.spring.configserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@Value("${spring.profiles.active}")
	private String activeProfile;
	
	@GetMapping("/ok")
	public String getOk(){
		return "ok";
	}
	
	@GetMapping("/profile")
	public String getTest(){
		return activeProfile;
	}
}
