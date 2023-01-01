package com.example.springbootlistener.listener;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

import java.time.Duration;

/**
 * @author LuoPing
 * @project IntelliJ IDEA
 * @Package springboot-study
 * @Date 2022/12/21 18:25
 */
public class MySpringApplicationRunListener implements SpringApplicationRunListener {
    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        SpringApplicationRunListener.super.starting(bootstrapContext);
        System.out.println("MySpringApplicationRunListener.starting()");
    }

    @Override
    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
        SpringApplicationRunListener.super.environmentPrepared(bootstrapContext, environment);
        System.out.println("MySpringApplicationRunListener.environmentPrepared()");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        SpringApplicationRunListener.super.contextPrepared(context);
        System.out.println("MySpringApplicationRunListener.contextPrepared()");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        SpringApplicationRunListener.super.contextLoaded(context);
        System.out.println("MySpringApplicationRunListener.contextLoaded()");

    }

    @Override
    public void started(ConfigurableApplicationContext context, Duration timeTaken) {
        SpringApplicationRunListener.super.started(context, timeTaken);
        System.out.println("MySpringApplicationRunListener.started()");
    }

    @Override
    public void ready(ConfigurableApplicationContext context, Duration timeTaken) {
        SpringApplicationRunListener.super.ready(context, timeTaken);
        System.out.println("MySpringApplicationRunListener.ready()");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        SpringApplicationRunListener.super.failed(context, exception);
        System.out.println("MySpringApplicationRunListener.failed()");
    }
}
