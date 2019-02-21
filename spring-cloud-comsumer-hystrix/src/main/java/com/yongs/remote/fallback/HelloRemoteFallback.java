package com.yongs.remote.fallback;

import org.springframework.stereotype.Component;

import com.yongs.remote.HelloRemote;

@Component
public class HelloRemoteFallback implements HelloRemote {

	@Override
	public String sayHello(String name) {
		return "hello"+name+", this message send faild, is from hystrix!!!";
	}

}
