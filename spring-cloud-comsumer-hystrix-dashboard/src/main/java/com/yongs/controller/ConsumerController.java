package com.yongs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yongs.remote.HelloRemote;

@RestController
public class ConsumerController {
	
	@Autowired
	private HelloRemote helloRemote;

	@RequestMapping("/hello/{name}")
	public String sayHello(@PathVariable("name")String name) {
		return helloRemote.sayHello(name);
	}
}
