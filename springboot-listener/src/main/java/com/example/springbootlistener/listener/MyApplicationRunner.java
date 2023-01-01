package com.example.springbootlistener.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author LuoPing
 * @project IntelliJ IDEA
 * @Package springboot-study
 * @Date 2022/12/21 17:55
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
//        连接一下数据库,业务逻辑
        System.out.println("MyApplicationRunner 程序启动了");
    }
}
