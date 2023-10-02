package io.github.girirajvyas.jpop11.discoveryclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients 
@SpringBootApplication
public class JpopDiscoveryClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(JpopDiscoveryClient2Application.class, args);
	}

}
