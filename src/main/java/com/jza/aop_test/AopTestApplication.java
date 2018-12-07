package com.jza.aop_test;

import com.jza.aop_test.async.AsyncTest;
import com.jza.aop_test.condition.ListService;
import com.jza.aop_test.event.EventListener;
import com.jza.aop_test.event.EventTest;
import com.jza.aop_test.event.PublisherTest;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
@ImportResource(locations = {"classpath:spring-aop.xml"})
@EnableScheduling
@EnableAsync
public class AopTestApplication implements AsyncConfigurer {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = null;
        try {
            SpringApplication springApplication = new SpringApplication(AopTestApplication.class);
            run = springApplication.run(args);

            //监听
            //注册监听器，也可以直接在监听器类上加Component注解注册bean
            springApplication.addListeners(new EventListener());
            PublisherTest publisherTest = run.getBean(PublisherTest.class);
            publisherTest.publish(new EventTest(AopTestApplication.class, "jiao1"));
//        publisherTest.publish(new EventTest(AopTestApplication.class, "jiao2"));
//        run.publishEvent(new EventTest(AopTestApplication.class, "jiao"));


//            //异步
//            AsyncTest asyncTest = run.getBean(AsyncTest.class);
//            for (int i = 0; i < 15; i++) {
//               ] asyncTest.plus(i);
//                asyncTest.plusPlus(i);
//            }
            //条件bean
//            ListService listService = run.getBean(ListService.class);
//            listService.show();
            //计划任务
            //@@EnableScheduling @Scheduled

            TimeUnit.SECONDS.sleep(10);


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (!Objects.isNull(run)) {
                run.close();
            }
        }
//        SpringApplication.run(AopTestApplication.class, args);
    }

    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(5);
        threadPoolTaskExecutor.setMaxPoolSize(10);
        threadPoolTaskExecutor.setQueueCapacity(20);
        return threadPoolTaskExecutor;
    }
}
