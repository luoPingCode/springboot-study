package com.lp.springbootcondition;

import com.lp.springbootcondition.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootConditionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootConditionApplication.class, args);
        System.out.println(run);
        //只要引入Redis起步依赖，就有了RedisTemplate对象
        Object redisTemplate = run.getBean("redisTemplate");
        System.out.println(redisTemplate);
//        User user = (User) run.getBean("user");
//        System.out.println(user);
    }
}
