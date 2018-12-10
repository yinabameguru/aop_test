package com.jza.aop_test;

import com.jza.spring_test.property.HellloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTestApplicationTests {

//    @Autowired
//    MyService myService;
//
//    @Autowired
//    ContextHolder contextHolder;

    @Autowired
    HellloService hellloService;

//    @Autowired
//    ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
//        myService.myService();
//        System.out.println("end");

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

//    @Test
//    public void eventTest() {
//        ApplicationContext applicationContext = contextHolder.getApplicationContext();
//        applicationContext.publishEvent(new EventTest(this, "jiao"));
//    }

    @Test
    public void helloServiceAutoConfigurationTest() {
        String s = hellloService.sayHello();
        System.out.println(s);
    }

}
