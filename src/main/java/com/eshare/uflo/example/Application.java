package com.eshare.uflo.example;

import com.bstek.uflo.console.UfloServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by liangyh on 2018/1/28.
 * Email:10856214@163.com
 */
@EnableAutoConfiguration
@ImportResource("classpath:context.xml")
public class Application {
     public static void main(String[] args){
         SpringApplication.run(Application.class,args);
     }
    @Bean
    public ServletRegistrationBean buildUfloServlet(){
        return new ServletRegistrationBean(new UfloServlet(),"/uflo/*");
    }
}
