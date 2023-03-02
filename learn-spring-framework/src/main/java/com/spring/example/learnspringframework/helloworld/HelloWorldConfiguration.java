package com.spring.example.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){};
record Address(String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Jean";
    }

    @Bean
    public int age(){
        return 34;
    }

    @Bean
    public Person person(){
      return new Person("Brittney", 33, new Address("123 Road", "Austin"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3){
        return new Person(name, age, address3);
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address){
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3Qualifier") Address address){
        return new Person(name, age, address);
    }

    @Bean(name="address2")
    @Primary
    public Address address(){
        return new Address("7730 Robert Mondavi", "San Antonio");
    }

    @Bean(name="address3")
    @Qualifier("address3Qualifier")
    public Address address3(){
        return new Address("14145 Branding Iron Dr", "Helendale");
    }


}
