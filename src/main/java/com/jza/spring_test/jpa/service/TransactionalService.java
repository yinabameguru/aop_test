package com.jza.spring_test.jpa.service;

import com.jza.spring_test.jpa.entity.Person;

public interface TransactionalService {

    Person savePersonWithRollBack(Person person);

    Person savePersonWithoutRollBack(Person person);

}
