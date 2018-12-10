package com.jza.spring_test.jpa;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.jza.spring_test.jpa.dao")
public class JpaCfg {


//    public EntityManagerFactory entityManagerFactory() {
//
//    }
}
