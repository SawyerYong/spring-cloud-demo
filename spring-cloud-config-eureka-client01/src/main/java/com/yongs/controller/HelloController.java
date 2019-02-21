package com.yongs.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${myconfig.name}")
	private String name;
	
	@RequestMapping("/getevn")
	public String getEnvName() {
		return this.name;
	}
}
