package com.jza.spring_test.invoke;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        try {
            System.out.println("in");
            return methodInvocation.proceed();
        } catch (Exception e) {
            System.out.println("err");
            return null;
        }
    }
}
