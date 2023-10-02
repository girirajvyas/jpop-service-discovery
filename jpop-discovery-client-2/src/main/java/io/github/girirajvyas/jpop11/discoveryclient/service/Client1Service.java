package io.github.girirajvyas.jpop11.discoveryclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.girirajvyas.jpop11.discoveryclient.feign.DiscoveryClient1FeignClient;

@Service
public class Client1Service {

	@Autowired
	private DiscoveryClient1FeignClient feignClient;

	private final RestTemplate restTemplate;

    @Autowired
    public Client1Service(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String callDiscoveryClient1RestTemplate() {
        ResponseEntity<String> response = restTemplate.getForEntity("http://discovery-client-1/api/resource", String.class);
        // Process the response here
        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        } else {
            // Handle error cases
            return "Error response from Discovery Client 1";
        }
    }
	
    public ResponseEntity<String> callDiscoveryClient1RestTemplateResponseEntity() {
        return restTemplate.getForEntity("http://discovery-client-1/api/resource", String.class);
        
    }
	
    public String callDiscoveryClient1() {
        ResponseEntity<String> response = feignClient.getResource();
        // You can process the response here
        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        } else {
            // Handle error cases
            return "Error response from Discovery Client 1";
        }
    }
    
    public ResponseEntity<String> callDiscoveryClient1ResponseEntity() {
        return feignClient.getResource();
       
    }
}

