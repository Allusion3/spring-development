package com.spring.example.learnspringframework;

import com.spring.example.learnspringframework.game.GameRunner;
import com.spring.example.learnspringframework.game.GamingConsole;
import com.spring.example.learnspringframework.game.Pacman;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }
    }
}
