package com.lp.springbootenable;

import com.lp.springbootenable.config.MyImportBeanDefinitionRegistrar;
import com.lp.springbootenable.config.MyImportSelector;
import com.lp.springbootenableother.config.EnableUser;
import com.lp.springbootenableother.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import java.util.Map;


@SpringBootApplication
//@ComponentScan("com.lp.springbootenableother.config")
//@Import(User.class)
//@EnableUser
//@Import(MyImportSelector.class)
//@Import({MyImportBeanDefinitionRegistrar.class})
public class SpringbootEnableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootEnableApplication.class, args);
//        User user = (User) run.getBean("user");
//        System.out.println(user);
        Map<String, User> beansOfType = run.getBeansOfType(User.class);
        System.out.println(beansOfType);

//        Jedis jedis = (Jedis) run.getBean("jedis");
//        System.out.println(jedis);
//        jedis.set("hello", "world");
//        String hello = jedis.get("hello");
//        System.out.println(hello);
    }
}
