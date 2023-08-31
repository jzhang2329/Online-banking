package com.jz.finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class InternetBankingCoreServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternetBankingCoreServiceRegistryApplication.class, args);
	}

}
