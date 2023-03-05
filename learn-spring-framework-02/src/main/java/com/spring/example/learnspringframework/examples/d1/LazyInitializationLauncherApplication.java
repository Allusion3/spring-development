package com.spring.example.learnspringframework.examples.d1;

import com.spring.example.learnspringframework.examples.c1.BusinessCalculationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {

    private ClassA classA;

    public ClassB(ClassA classA) {

        System.out.println("Some Initialization Logic");
        this.classA = classA;
    }
}
@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

        }
    }
}
