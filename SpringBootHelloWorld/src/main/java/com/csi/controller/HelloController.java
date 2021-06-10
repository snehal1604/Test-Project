package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

	@GetMapping("/")
	public String sayHello()
	{
		return "Hello world.....welcome to spring boot.....";
	}
	@GetMapping("/csiservices")
	public String sayCSIServices()
	{
		return "Software Development";
	}
	
	@GetMapping("/csiaddress")
	public String sayCSIAddress()
	{
		return "INSPIRIA MALL";
	}
	
}
