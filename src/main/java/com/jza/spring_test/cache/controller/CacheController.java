package com.jza.spring_test.cache.controller;

import com.jza.spring_test.cache.service.CacheService;
import com.jza.spring_test.jpa.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    @Autowired
    CacheService cacheService;

    @RequestMapping("/cachePut")
    public String cachePut(@RequestBody  Person person) {
        return cacheService.save(person);
    }

    @RequestMapping("/cacheEvict")
    public String cacheEvict(@RequestBody Person person) {
        return cacheService.remove(person.getId());
    }

    @RequestMapping("/cacheable")
    public String cacheable(@RequestBody Person person) {
        return cacheService.getOne(person);
    }
}
