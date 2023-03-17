package com.springdevelopment.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "jdezonia", "Learn AWS",
                LocalDate.now().plusMonths(5), false));
        todos.add(new Todo(2, "jdezonia", "Learn GCLOUD",
                LocalDate.now().plusMonths(7), false));
        todos.add(new Todo(3, "jdezonia", "Learn SPRING",
                LocalDate.now().plusMonths(12), false));

    }

    public static List<Todo> findByUsername(String username) {
        return todos;
    }
}
