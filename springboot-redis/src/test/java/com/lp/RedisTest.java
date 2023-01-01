package com.lp;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author LuoPing
 * @project IntelliJ IDEA
 * @Package springboot-study
 * @Date 2022/12/18 20:46
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTest {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    @Test
    public void test(){
        redisTemplate.opsForValue().set("a","b");
        redisTemplate.boundValueOps("c").set("d");

    }

    @Test
    public void test1(){
        String a = redisTemplate.opsForValue().get("a");
        System.out.println(a);
        String c = redisTemplate.boundValueOps("c").get();
        System.out.println(c);
    }
}

