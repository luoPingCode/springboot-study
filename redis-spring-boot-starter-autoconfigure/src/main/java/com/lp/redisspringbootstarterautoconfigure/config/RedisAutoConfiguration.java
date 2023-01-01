package com.lp.redisspringbootstarterautoconfigure.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

/**
 * @author LuoPing
 * @project IntelliJ IDEA
 * @Package springboot-study
 * @Date 2022/12/21 17:26
 */
@Configuration
@EnableConfigurationProperties(RedisProperties.class)
public class RedisAutoConfiguration {
    /**
     * 提供Jedis的bean
     */
    @Bean
    public Jedis jedis(RedisProperties properties) {
        return new Jedis(properties.getHost(),properties.getPort());
    }
}
