package com.jamesvrooney.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/")
	public String getGreeting() {

		log.info("Entering greeting method.");

		return "Welcome to the book catalog!";
	}

}
