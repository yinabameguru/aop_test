package com.jza.spring_test.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

//@Async
@Component
public class AsyncTest {

    @Async
    public void plus(int num) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Task1 " + (num + 1));
        }
    }

    @Async
    public void plusPlus(int num) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Task2 " + (num + 2));
        }
    }


}
