package com.jza.aop_test.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

//@Async
@Component
public class AsyncTest {

    @Async
    public void plus(int num1) {
        System.out.println("Task1 " + (num1 + 1));
    }

    @Async
    public void plusPlus(int num) {
        System.out.println("Task2 " + (num + 2));
    }


}
