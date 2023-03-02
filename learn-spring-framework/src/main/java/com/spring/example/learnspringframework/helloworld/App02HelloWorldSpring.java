package com.spring.example.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main(String[] args) {

        // 1. Launch a Spring Context
        // try with resources
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
            // 2. Configure the things that we want Spring framework to manage - @Configuration class

            // 3. Retrieving Beans managed by Spring
            context.getBean(Person.class);

            System.out.println(context.getBeanDefinitionCount());
            Arrays.stream( context.getBeanDefinitionNames())
                    .forEach(System.out::println);

        }





    }

}
