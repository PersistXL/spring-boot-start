package com.saikie.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration // 标志为注解类
@ConditionalOnWebApplication //是web类的时候加载
@EnableConfigurationProperties(HelloProperties.class) // 使得HelloProperties属性文件生效
public class HelloServiceAutoConfiguration {

    // 导入属性文件
    @Resource
    HelloProperties helloProperties;

    @Bean
    public HelloService helloService() {
        HelloService service = new HelloService();
        service.setHelloProperties(helloProperties);
        return service;
    }
}
