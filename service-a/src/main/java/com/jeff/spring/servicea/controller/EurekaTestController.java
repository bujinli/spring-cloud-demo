package com.jeff.spring.servicea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaTestController {

	@Autowired
	private DiscoveryClient client;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/eurekaclient")
	public String eurekaClint() {
		ServiceInstance instance = client.getLocalServiceInstance();
		return "Hello eureka! Host: " + instance.getHost() + " service" + instance.getServiceId();
	}

	@GetMapping("/call_b")
	public String callB() {
		return "call b";
	}

}
