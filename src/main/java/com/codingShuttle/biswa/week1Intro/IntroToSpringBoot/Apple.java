package com.codingShuttle.biswa.week1Intro.IntroToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


public class Apple {
    void eatApple(){
        System.out.println("I am Eating Appleeee");
    }

    @PostConstruct
    void callThisBeforeAppleIsCreated(){
        System.out.println("Creating the Apple Bean Before Used");
    }

    @PreDestroy
    void callThisBeforeAppleIsDestroyed(){
        System.out.println("Destroying the Apple Bean Before Used");
    }
}
