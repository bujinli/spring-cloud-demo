package com.jeff.spring.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FromConsumerController {

	private final static Logger log = LoggerFactory.getLogger(FromConsumerController.class);

	@Value("${server.port}")
	private String serverPort;

	@RequestMapping(path = "/from_consumer", method = RequestMethod.GET)
	public String callProvider() {

		log.info("/from_consumer is called");
		return "from_consumer call from " + serverPort;

	}
}
