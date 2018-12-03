package com.jza.aop_test.invoke;


import com.fasterxml.jackson.databind.ObjectMapper;
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
