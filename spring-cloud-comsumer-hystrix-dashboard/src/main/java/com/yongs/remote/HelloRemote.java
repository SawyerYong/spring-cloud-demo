package com.yongs.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yongs.remote.fallback.HelloRemoteFallback;

@FeignClient(name="spring-cloud-producer",fallback=HelloRemoteFallback.class)
public interface HelloRemote {
	
	@RequestMapping("/hello")
	public String sayHello(@RequestParam("name")String name);
}
