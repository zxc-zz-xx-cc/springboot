package com.example.demo.config;

import com.example.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zxc
 * @date 2020/12/11 - 11:14
 */
@Configuration // 指明当前类是配置类，用来代替配置文件
public class MyappConfig {
    @Bean // 将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
    public HelloService helloService() {
        return new HelloService();
    }
}
