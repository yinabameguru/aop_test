package com.jza.aop_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@ImportResource(locations = {"classpath:spring-aop.xml"})
//@EnableScheduling
//@EnableAsync
public class SpringTestApplication
//    implements AsyncConfigurer
{

    public static void main(String[] args) {
        ConfigurableApplicationContext run = null;
//        try {
            SpringApplication springApplication = new SpringApplication(SpringTestApplication.class);
            run = springApplication.run(args);

            //监听
            //注册监听器，也可以直接在监听器类上加Component注解注册bean
//            springApplication.addListeners(new EventListener());
//            PublisherTest publisherTest = run.getBean(PublisherTest.class);
//            publisherTest.publish(new EventTest(AopTestApplication.class, "jiao1"));
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

            //外部propertiy配置
//            HelloServiceProperties helloServiceProperties = run.getBean(HelloServiceProperties.class);
//            String msg = helloServiceProperties.getMsg();
//            System.out.println(msg);
            //自动配置bean并注入外部配置

//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            if (!Objects.isNull(run)) {
//                run.close();
//            }
//        }
//        SpringApplication.run(AopTestApplication.class, args);
    }

//    @Override
//    public Executor getAsyncExecutor() {
//        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
//        threadPoolTaskExecutor.setCorePoolSize(5);
//        threadPoolTaskExecutor.setMaxPoolSize(10);
//        threadPoolTaskExecutor.setQueueCapacity(20);
//        return threadPoolTaskExecutor;
//    }
}
