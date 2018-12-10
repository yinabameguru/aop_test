package com.jza.spring_test.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(HellloService.class)
@ConditionalOnProperty(prefix = "hello", value = "enabled", matchIfMissing = true)
@EnableAutoConfiguration
public class HelloServiceAutoConfiguration {

    @Autowired
    HelloServiceProperties helloServiceProperties;

    @Bean
    @ConditionalOnMissingBean(HellloService.class)
    public HellloService hellloService() {
        HellloService hellloService = new HellloService();
        hellloService.setMsg(helloServiceProperties.getMsg());
        return hellloService;
    }
}
