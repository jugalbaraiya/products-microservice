package com.djb.productsmicroservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloWorld() {
		return "Hello World !!!";
	}

}
