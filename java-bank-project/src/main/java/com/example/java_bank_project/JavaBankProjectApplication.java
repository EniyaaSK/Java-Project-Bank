package com.example.java_bank_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class JavaBankProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBankProjectApplication.class, args);
	}

}
