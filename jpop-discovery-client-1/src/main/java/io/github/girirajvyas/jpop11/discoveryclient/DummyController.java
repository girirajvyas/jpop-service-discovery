package io.github.girirajvyas.jpop11.discoveryclient;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

	@GetMapping("/api/resource")
    ResponseEntity<String> getResource(){
		return ResponseEntity.ok("discovery-client-1");
	}
}
