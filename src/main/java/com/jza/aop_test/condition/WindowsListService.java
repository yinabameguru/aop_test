package com.jza.aop_test.condition;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(WindowsCondition.class)
public class WindowsListService implements ListService {

    @Override
    public void show() {
        System.out.println("windows");
    }
}
