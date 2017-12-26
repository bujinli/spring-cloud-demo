package com.jeff.spring.consumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CallProvicerController {

	private final static Logger log = LoggerFactory.getLogger(CallProvicerController.class);
	private static final String provider_url = "http://PROVIDER/from_consumer";

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(path = "/call_provider", method = RequestMethod.GET)
	public String callProvider() {

		log.info("/call_provider is called");
		return restTemplate.getForObject(provider_url, String.class);

	}
}
