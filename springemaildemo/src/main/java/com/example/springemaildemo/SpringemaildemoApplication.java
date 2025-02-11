package com.example.springemaildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringemaildemoApplication {
    @Autowired
	private emailsenderservice senderService;

	public static void main(String[] args) {

		SpringApplication.run(SpringemaildemoApplication.class, args);

	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		senderService.sendEmail("chahnanpatel@gmail.com",
				"Hey there im chahna",
				"im learning email sending with swing");
	}
}
