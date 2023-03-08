package com.learnspring.springboot.learnjpaandhibernate.course;

import com.learnspring.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.learnspring.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private static CourseJdbcRepository jdbcRepo;

    @Autowired
    private CourseJpaRepository jpaRepo;
    @Override
    public void run(String... args) throws Exception {
//        runJdbc();
        runJpa();
    }

    private void runJpa() {
        jpaRepo.insert(new Course(1, "Learn AWS NOW JPA", "Jean"));
        jpaRepo.insert(new Course(2, "Learn Azure JPA", "Y"));
        jpaRepo.insert(new Course(3, "Learn Gcloud JPA", "X"));
        jpaRepo.insert(new Course(4, "Learn gcloud later JPA", "J"));
        jpaRepo.insert(new Course(5, "Learn AWS JPA", "Br"));
        jpaRepo.deleteById(5);

        System.out.println(jpaRepo.findById(2));
        System.out.println(jpaRepo.findById(3));

    }

    private static void runJdbc(){
        jdbcRepo.insert(new Course(1, "Learn AWS NOW", "Jean"));
        jdbcRepo.insert(new Course(2, "Learn Azure", "Y"));
        jdbcRepo.insert(new Course(3, "Learn Gcloud", "X"));
        jdbcRepo.insert(new Course(4, "Learn gcloud later", "J"));
        jdbcRepo.insert(new Course(5, "Learn AWS", "Br"));
        jdbcRepo.deleteById(5);

        System.out.println(jdbcRepo.findById(2));
        System.out.println(jdbcRepo.findById(3));

    }
}
