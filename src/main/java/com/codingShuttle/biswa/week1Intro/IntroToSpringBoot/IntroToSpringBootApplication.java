package com.codingShuttle.biswa.week1Intro.IntroToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroToSpringBootApplication implements CommandLineRunner {

	@Autowired
	Apple ap;

	@Autowired
	DBService dbService;

	public static void main(String[] args) {
		SpringApplication.run(IntroToSpringBootApplication.class, args);

//		Apple ap = new Apple(); ap.eatAple();  we dont have to use new keyWord in SpringBoot

	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(dbService.getData());
//		ap.eatApple();
	}
}
