package com.school.campus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControolerDemo {

	@RequestMapping(value = "/hello" , method = RequestMethod.GET)
	public String say() {
		return "hello spring boot!";
	}
	
}
