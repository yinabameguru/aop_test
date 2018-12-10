package com.jza.spring_test.property;

import org.springframework.stereotype.Service;

//@Service
public class HellloService {
    private String msg;

    public String sayHello() {
        return "hello" + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
