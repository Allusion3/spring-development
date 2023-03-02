package com.spring.example.learnspringframework;

import com.spring.example.learnspringframework.game.GameRunner;
import com.spring.example.learnspringframework.game.Pacman;

public class App01GamingBasicJava {

    public static void main(String[] args) {

//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new Pacman();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }

}
