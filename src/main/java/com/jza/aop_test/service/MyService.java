package com.jza.aop_test.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void myService() {
        System.out.println("run");
        int i = 1 / 0;
    }

}
