package com.jza.spring_test.jpa.service.impl;

import com.jza.spring_test.jpa.dao.PersonRepository;
import com.jza.spring_test.jpa.entity.Person;
import com.jza.spring_test.jpa.service.TransactionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class TransactionalServiceImpl implements TransactionalService {

    @Autowired
    PersonRepository personRepository;

    @Override
    @Transactional(rollbackFor = IllegalArgumentException.class)
    public Person savePersonWithRollBack(Person person) {
        Person save = personRepository.save(person);
        if (save.getName().equals("jza"))
            throw new IllegalArgumentException("jza已存在，数据回滚。");
        return save;
    }

    @Override
    @Transactional(noRollbackFor = IllegalArgumentException.class)
    public Person savePersonWithoutRollBack(Person person) {
        Person save = personRepository.save(person);
        if (save.getName().equals("jza"))
            throw new IllegalArgumentException("jza虽已存在，但数据不回滚");
        return save;
    }
}
