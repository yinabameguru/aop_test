package com.jza.spring_test.jpa;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
//SpringBoot中JpaBaseConfiguration有一个getPackagesToScan()方法可以自动扫描注解有@Entity的实体
//@EnableJpaRepositories("com.jza.spring_test.jpa.dao")
//SpringBoot已经自动配置好了RepositoryRestMvcConfiguration
//@Import(RepositoryRestMvcConfiguration.class)
//SpringBoot中DataSourceTransactionManagerAutoConfiguration已经配置好了
//@EnableTransactionManagement
public class JpaCfg {

}
