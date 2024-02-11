package com.wildcards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wildcards.services.EmailService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class WildcardsApplication  {

	public static void main(String[] args) {
		SpringApplication.run(WildcardsApplication.class, args);
	}
	
	//use this code below if I want to test out other emails.
//	
//	@Autowired
//    private EmailService emailService;
//
//	@Override
//	public void run(String... args) throws Exception  {
//		// TODO Auto-generated method stub
//		emailService.sendMail("lokeshgupta1981@gmail.com", "Hi", "Ho ho ho");
//        
//        emailService.sendPreConfiguredMail("sent from application");
//        
//        emailService.sendSignUpEmail("ramel.haines@daemen.edu", "welcome to liq and win");
//	}
//	
	

}
