package com.codingShuttle.biswa.week1Intro.IntroToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

//    @Autowired
//    private DevDB db; // This is Called Tightly Coupling

    @Autowired
    private DB db;

    String getData(){
        return db.getData();
    }
}
