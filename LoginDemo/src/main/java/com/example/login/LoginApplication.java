package com.example.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.org.rapid_framework.freemarker.directive.BlockDirective;
import cn.org.rapid_framework.freemarker.directive.ExtendsDirective;
import cn.org.rapid_framework.freemarker.directive.OverrideDirective;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/*
@Configuration
public class FreemarkerConfiguration {

    @Autowired
    freemarker.template.Configuration configuration;

    @PostConstruct
    public void setSharedVariable(){
        configuration.setSharedVariable("block", new BlockDirective());
        configuration.setSharedVariable("override", new OverrideDirective());
        configuration.setSharedVariable("extends", new ExtendsDirective());
    }

}
*/

@SpringBootApplication
public class LoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
    }

}
