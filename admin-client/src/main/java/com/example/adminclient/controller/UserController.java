package com.example.adminclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LuoPing
 * @project IntelliJ IDEA
 * @Package springboot-study
 * @Date 2022/12/21 19:29
 */
@RestController
@RequestMapping("hello")
public class UserController {

    @GetMapping("test")
    public String test() {
        return "hello world";
    }
}
