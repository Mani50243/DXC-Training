package com.eureka.pub.EurekaPublisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EurekaPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaPublisherApplication.class, args);
	}

}
