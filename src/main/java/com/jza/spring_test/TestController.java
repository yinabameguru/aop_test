package com.jza.spring_test;

import com.jza.spring_test.mongo.entity.Location;
import com.jza.spring_test.mongo.entity.Person;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import javafx.geometry.Pos;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/dt", method = RequestMethod.POST)
    public String dateTime(@RequestParam Person p1, @RequestParam Person p2) {
//        String s = localDateTime.toString();
//        return s;
        return p1.toString() + p2;
    }
}
