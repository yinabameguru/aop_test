package com.jza.spring_test.condition;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(LinuxCondition.class)
public class LinuxListService implements ListService {

    @Override
    public void show() {
        System.out.println("linux");
    }
}
