package com.example.demo.config;

import com.example.demo.compponent.MyLocaleResolver;
import com.example.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author zxc
 * @date 2020/12/11 - 11:14
 */
@Configuration // 指明当前类是配置类，用来代替配置文件
public class MyappConfig implements WebMvcConfigurer {
    @Bean // 将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
    public HelloService helloService() {
        return new HelloService();
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
    }

    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }

}
