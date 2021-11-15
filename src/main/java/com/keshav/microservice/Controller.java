package com.keshav.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/Name")
	public String getName()
	{

		return "Hello!! I am Keshav Aggarwal";

	}
}
