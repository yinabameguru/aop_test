package com.jza.aop_test;

import com.jza.aop_test.dao.Student;
import com.jza.aop_test.service.MyService;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopTestApplicationTests {

    @Autowired
    MyService myService;

    @Test
    public void contextLoads() {
        myService.myService();
        System.out.println("end");

//        Student s1 = new Student(2);
//        Student s2 = new Student(1);
//        Student s3 = new Student(3);
//        ArrayList<Student> list = new ArrayList<>();
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        System.out.println("jza" + list.toString());
//        Collections.sort(list);
//        System.out.println("jza" + list.toString());
    }

}
