package com.eureka.client.ws;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eurekaclient-uuid")
public interface UuidClientWs {

	@GetMapping(value="/getUuid")
	public String getUuid();
}
