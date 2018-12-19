package com.jza.aop_test.jpa;

import com.jza.spring_test.SpringTestApplication;
import com.jza.spring_test.jpa.dao.PersonRepository;
import com.jza.spring_test.jpa.entity.Person;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringTestApplication.class)
public class JpaTest {

    @Autowired
    PersonRepository personRepository;

    @Test
    public void init() {
        Person person = new Person("jza", 21, "武汉");
        Person save = personRepository.save(person);
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Person person1 = new Person("jza" + i, 21, "武汉");
            people.add(person1);
        }
        personRepository.saveAll(people);
    }

    @Test
    public void jpaTest() {
//        List<Person> byName = personRepository.findByName("jza");
//        List<Person> byNameAndAdress = personRepository.findByNameAndAdress("jza", "武汉");
//        List<Person> byNameAndAdressLike = personRepository
//            .findByNameAndAdressStartingWith("jza", "武");
//        List<Person> z = personRepository.findTop3ByNameContaining("z");
//        List<Person> people = personRepository.findByNamedQuery("jza");
//        List<Person> byAdressQuery = personRepository.findByAdressQuery("武汉");
//        List<Person> byAdressQuery2 = personRepository.findByAdressQuery2("武汉");
//        int updateAdress = personRepository.updateAdress("深圳", 1L);
        PageRequest pageRequest = PageRequest.of(1, 3);
        Page<Person> byName1 = personRepository
            .findByNameContaining("z", pageRequest);

        System.out.println("end");
    }

}
