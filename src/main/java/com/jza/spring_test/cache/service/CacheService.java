package com.jza.spring_test.cache.service;

import com.jza.spring_test.jpa.entity.Person;

public interface CacheService {

    String save(Person person);

    String remove(Long id);

    String getOne(Person person);

}
