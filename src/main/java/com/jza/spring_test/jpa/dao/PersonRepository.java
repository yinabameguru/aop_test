package com.jza.spring_test.jpa.dao;

import com.jza.spring_test.jpa.entity.Person;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.transaction.annotation.Transactional;

@RepositoryRestResource(path = "people")
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByName(String name);

    List<Person> findByNameAndAdress(String name, String adress);

    List<Person> findByNameAndAdressStartingWith(String name, String adress);

    List<Person> findTop3ByNameContaining(String name);

    List<Person> findByNamedQuery(String name);

    @RestResource(path = "adressQuery", rel = "adressQuery")
    @Query("select p from Person as p where adress = :adress")
    List<Person> findByAdressQuery(@Param("adress") String adress);

    @Query("select p from Person as p where adress = ?1")
    List<Person> findByAdressQuery2(String adress);

    @Modifying
    @Transactional
    @Query("update from Person as p set adress = ?1 where id = ?2")
    int updateAdress(String adress, Long Id);

    Page<Person> findByNameContaining(String name, Pageable pageable);

}
