package com.jza.spring_test.cache.service.impl;

import com.jza.spring_test.cache.service.CacheService;
import com.jza.spring_test.jpa.dao.PersonRepository;
import com.jza.spring_test.jpa.entity.Person;
import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CacheServiceImpl implements CacheService {

    @Autowired
    PersonRepository personRepository;

    @Override
    @CachePut(value = "people", key = "#person.id")
    public String save(Person person) {
        Person save = personRepository.save(person);
        System.out.println("id为" + save.getId() + "的数据已缓存");
        return "id为" + save.getId() + "的数据已缓存";
    }

    @Override
    @CacheEvict(value = "people")
    public String remove(Long id) {
        System.out.println("id为" + id + "的数据已移除缓存");
        personRepository.deleteById(id);
        return "id为" + id + "的数据已移除缓存";
    }

    @Override
    @Cacheable(value = "people", key = "#person.id")
    public String getOne(Person person) {
        personRepository.getOne(person.getId());
        System.out.println("id为" + person.getId() + "的数据已缓存");
        return "id为" + person.getId() + "的数据已缓存";
    }
}
