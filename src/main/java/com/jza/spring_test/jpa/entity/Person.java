package com.jza.spring_test.jpa.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.NamedQuery;

@Entity
@NamedQuery(name = "Person.findByNamedQuery", query = "select p from Person as p where p.name = ?1")
public class Person implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;
    private String adress;

    public Person() {
    }

    public Person(String name, Integer age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", adress='" + adress + '\'' +
            '}';
    }
}
