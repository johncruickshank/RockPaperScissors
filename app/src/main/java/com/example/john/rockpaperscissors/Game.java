package com.example.john.rockpaperscissors;

import java.util.Random;

/**
 * Created by John on 08/11/2017.
 */

public class Game {

//    private Option playerOption;
    private Option gameOption;

    public Game(Option gameOption) {
        this.gameOption = gameOption;
    }


    public Option getGameOption() {
        return gameOption;
    }

    public void setGameOption(Option gameOption) {
        this.gameOption = gameOption;
    }

    public void assignRandomOption() {
        Random rand = new Random();
        int number = rand.nextInt(Option.getAmount());
        setGameOption(Option.values()[number]);
    }

    public String result(String player) {
        if (player.equals(gameOption.getValue())) {
            return "draw";
        }
            else if (gameOption.getBeatBy().equals(player)) {
                    return "win";
            }
            else return "lose";
        }

}
