package com.jza.spring_test.aop.service;

import com.jza.spring_test.aop.Action;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service()
public class MyService {

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }

    @Action(name = "student")
    public void myService() {
        System.out.println("run");
        int i = 1 / 0;
    }

}
