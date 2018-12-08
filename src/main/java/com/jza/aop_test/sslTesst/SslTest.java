package com.jza.aop_test.sslTesst;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SslTest {

    @RequestMapping("/test")
    @ResponseBody
    public String sslTest() {
        return "sslTest";
    }

}
