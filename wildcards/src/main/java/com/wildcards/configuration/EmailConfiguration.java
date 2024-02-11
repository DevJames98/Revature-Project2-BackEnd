package com.wildcards.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;

//TEMPLATE EMAIL 

@Configuration
public class EmailConfiguration {

	@Bean
	public SimpleMailMessage emailTemplate() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("e@email.com");
		message.setFrom("djsilentswagg@gmail.com");
		message.setSubject("Important email");
		message.setText("FATAL - Application crash. Save your job !!");
		return message;
	}

}
