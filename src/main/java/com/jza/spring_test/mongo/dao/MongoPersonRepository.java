package com.jza.spring_test.mongo.dao;

import com.jza.spring_test.mongo.entity.Person;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface  MongoPersonRepository extends MongoRepository<Person, String> {

    Person findByName(String name);

    @Query("{'age' : ?0}")
    List<Person> withQueryFindByAge(Integer age);

}
