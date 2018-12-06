package com.jza.aop_test.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("singleton")
public class EventListener implements ApplicationListener<EventTest> {


    @Override
    public void onApplicationEvent(EventTest event) {
        System.out.println(event.getMsg());
    }
}
