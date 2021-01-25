package com.example.controller;

import com.saikie.starter.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    HelloService helloService;

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable(name = "name") String name) {
        return helloService.sayHello(name);
    }
}
