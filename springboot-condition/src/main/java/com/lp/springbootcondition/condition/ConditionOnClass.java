package com.lp.springbootcondition.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author LuoPing
 * @project IntelliJ IDEA
 * @Package springboot-study
 * @Date 2022/12/20 0:34
 */
@Target({ElementType.TYPE,ElementType.METHOD}) //可以用在哪些地方
@Documented//生成javadoc
@Retention(RetentionPolicy.RUNTIME) //运行时起作用
@Conditional(ClassCondition.class)
public @interface ConditionOnClass {
    String[] value();
}
