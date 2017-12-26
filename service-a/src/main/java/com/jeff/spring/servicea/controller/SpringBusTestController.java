package com.jeff.spring.servicea.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //this is need for message bus refresh
public class SpringBusTestController {

	
	@Value("${test.config}")
	private String testConfig;
	

	@GetMapping("/test_config")
	public String eurekaClint() {
		return testConfig;
	}

}
