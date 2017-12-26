package com.jeff.spring.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	private final static Logger log = LoggerFactory.getLogger(BaseController.class);

	@RequestMapping("/")
	public String base() {
		log.error("========log.error : call into ok ===================");
		log.warn("========log.warn : call into ok ===================");
		log.info("========log.info : call into ok ===================");
		log.debug("========log.debug : call into ok ===================");
		log.trace("========log.trace : call into ok ===================");
		return "ok";
	}
}
