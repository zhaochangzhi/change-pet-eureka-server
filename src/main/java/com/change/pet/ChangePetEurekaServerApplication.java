package com.change.pet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhaochangzhi
 * @description
 * @date 2018/10/12 10:54
 */
@EnableEurekaServer
@SpringBootApplication
public class ChangePetEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChangePetEurekaServerApplication.class, args);
	}
}
