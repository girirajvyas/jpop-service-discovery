package io.github.girirajvyas.jpop11.discoveryclient.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "discovery-client-1")
public interface DiscoveryClient1FeignClient {
	
	@GetMapping("/api/resource")
	ResponseEntity<String> getResource();
	
}
