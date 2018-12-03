package com.jza.aop_test.dao;

public class Student implements Comparable<Student> {

    private Integer age;

    public Student(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return o.age - this.age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
            "age=" + age +
            '}';
    }
}
