package com.spring.example.learnspringframework;

import com.spring.example.learnspringframework.game.GameRunner;
import com.spring.example.learnspringframework.game.GamingConsole;
import com.spring.example.learnspringframework.game.Pacman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        return new Pacman();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
}
