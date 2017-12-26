package com.jeff.spring.zuul.test;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanAutoTest {

	@Bean
	public TestBean creat() {
		return new TestBean();
	}

	@Autowired
	private Map<String, TestBean> testBeans;

	@Bean
	public TestBeans crate(Map<String, TestBean> testBeans) {
		return new TestBeans();
	}

}
