package org.elp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LuoPing
 * @project ${PRODUCT_NAME}
 * @Package ${PROJECT_NAME}
 * @Date ${DATE} ${TIME}
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        System.out.println("Hello world!");
    }
}