package com.jza.aop_test.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTest {

    @Scheduled(fixedDelay = 5000)
    public void scheduledTest() {
        System.out.println("5s");
    }

    @Scheduled(fixedDelay = 1000)
    public void scheduledTest2() {
        System.out.println("1s");
    }

}
