package com.jza.spring_test.event;

import org.springframework.context.ApplicationListener;

//@Component
//@Scope("singleton")
public class EventListener implements ApplicationListener<EventTest> {


    @Override
    public void onApplicationEvent(EventTest event) {
        System.out.println(event.getMsg());
    }
}
