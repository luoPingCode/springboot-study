package com.lp.springbootcondition.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;


/**
 * @author LuoPing
 * @project IntelliJ IDEA
 * @Package springboot-study
 * @Date 2022/12/19 19:23
 */
public class ClassCondition implements Condition {
    @Override
//    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//        return false;
//    }
//    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//        try {
//
//            Class.forName("redis.clients.jedis.Jedis");
//            return true;
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        try {
            //必须引入动态传来的包名，才生成对象
            Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes("com.lp.springbootcondition.condition.ConditionClass");
            System.out.println(annotationAttributes);
            if (annotationAttributes != null) {
                String[] values = (String[]) annotationAttributes.get("value");
                for (String value : values) {
                    Class.forName(value);
                }
            }
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
