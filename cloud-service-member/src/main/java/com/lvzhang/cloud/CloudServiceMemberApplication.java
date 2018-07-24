package com.lvzhang.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudServiceMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudServiceMemberApplication.class, args);
	}
}
