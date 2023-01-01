package com.lp.springbootcondition.config;

import com.lp.springbootcondition.condition.ConditionOnClass;
import com.lp.springbootcondition.pojo.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author LuoPing
 * @project IntelliJ IDEA
 * @Package springboot-study
 * @Date 2022/12/19 19:24
 */
@Configuration
public class ConditionConfig {
//    @Bean
//    public User user() {
//        return new User();
//    }
    @Bean
//    @Conditional(ClassCondition.class)
    @ConditionOnClass({"redis.clients.jedis.Jedis"})
    public User user(){
        return new User();
    }

    @Bean
    @ConditionalOnProperty(name ="ydlclass",havingValue ="lp")
    public User user1(){
        return new User();
    }
}
