package com.codingShuttle.biswa.week1Intro.IntroToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    Apple getApple(){
        return new Apple();
    }
}
