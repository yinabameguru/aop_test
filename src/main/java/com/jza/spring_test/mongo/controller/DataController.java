package com.jza.spring_test.mongo.controller;

import com.google.common.collect.Sets;
import com.jza.spring_test.mongo.dao.MongoPersonRepository;
import com.jza.spring_test.mongo.entity.Location;
import com.jza.spring_test.mongo.entity.Person;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataController {

    @Autowired
    MongoPersonRepository personRepository;

    @RequestMapping("/save")
    public String save() {
        Person person = new Person("jza", 21);
        Set<Location> locations = new LinkedHashSet<>();
        locations.add(new Location("武汉", "18"));
        locations.add(new Location("深圳", "19"));
        person.setLocations(locations);
        return String.valueOf(personRepository.save(person));
    }

    @RequestMapping("/q1")
    public Person query1() {
        return personRepository.findByName("jza");
    }

    @RequestMapping("/q2")
    public List<Person> query2() {
        return personRepository.withQueryFindByAge(21);
    }
}
