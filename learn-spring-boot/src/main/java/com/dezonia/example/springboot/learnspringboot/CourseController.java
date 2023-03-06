package com.dezonia.example.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "Jean DeZonia"),
                new Course(2, "Learn DevOps", "Brittney DeZonia"),
                new Course(3, "Learn Google Cloud", "Ollie"),
                new Course(4, "Learn Google", "Otis")
        );
    }
}
