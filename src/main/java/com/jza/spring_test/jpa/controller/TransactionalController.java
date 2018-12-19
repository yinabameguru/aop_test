package com.jza.spring_test.jpa.controller;

import com.jza.spring_test.jpa.entity.Person;
import com.jza.spring_test.jpa.service.TransactionalService;
import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TransactionalController {

    @Autowired
    TransactionalService personService;

    @RequestMapping(value = "/rollBack",
//        consumes = "application/json", produces = "application/json",
        method = RequestMethod.POST)
    @ResponseBody
    public String savePersonWithRollBack(
        @RequestBody
        Person person,
        HttpServletRequest request) {
        try {
            String contentType = request.getContentType();
            Enumeration<String> headerNames = request.getHeaderNames();
            while (headerNames.hasMoreElements()) {
                String k = headerNames.nextElement();
                String v = request.getHeader(k);
                System.out.println(k + "," + v);
            }
            String queryString = request.getQueryString();
//            Enumeration<String> attributeNames = request.getAttributeNames();
//            while (attributeNames.hasMoreElements()) {
//                String k = attributeNames.nextElement();
//                String v = (String) request.getAttribute(k);
//                System.out.println(k + "," + v);
//            }

            personService.savePersonWithRollBack(person);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @RequestMapping("/noRollBack")
    public String savePersonWithoutRollBack(Person person) {
        try {
            personService.savePersonWithoutRollBack(person);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
