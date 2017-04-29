package com.chazz.mukcha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MukchaController {

	 @RequestMapping(value = "/test",  method = RequestMethod.GET)
	    public String hello() {
		 	System.out.println("hello!!");
	        return String.format("World!") ;
	    }
	
}
