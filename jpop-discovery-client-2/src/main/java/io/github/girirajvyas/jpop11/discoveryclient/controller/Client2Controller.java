package io.github.girirajvyas.jpop11.discoveryclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.girirajvyas.jpop11.discoveryclient.service.Client1Service;

@RestController
public class Client2Controller {

	@Autowired
	Client1Service client1Service;
	
	@GetMapping("/api/resource")
    ResponseEntity<String> getResource(){
		return ResponseEntity.ok("discovery-client-2");
	}
	
	@GetMapping("/api/client1/resource")
    ResponseEntity<String> getClient1Resource(){
		ResponseEntity<String> resource = client1Service.callDiscoveryClient1ResponseEntity();
		return resource;
	}
	
	@GetMapping("/api/client1/rest/resource")
    ResponseEntity<String> getClient1ResourceRestTemplate(){
		ResponseEntity<String> resource = client1Service.callDiscoveryClient1RestTemplateResponseEntity();
		return resource;
	}
}
