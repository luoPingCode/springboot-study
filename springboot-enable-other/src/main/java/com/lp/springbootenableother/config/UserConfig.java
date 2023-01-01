package com.lp.springbootenableother.config;

import com.lp.springbootenableother.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LuoPing
 * @project IntelliJ IDEA
 * @Package springboot-study
 * @Date 2022/12/21 14:47
 */
@Configuration
public class UserConfig {

    @Bean
    public User user() {
        return new User();
    }
}
