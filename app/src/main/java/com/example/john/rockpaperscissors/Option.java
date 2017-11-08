package com.example.john.rockpaperscissors;

/**
 * Created by John on 08/11/2017.
 */

public enum Option {

    ROCK("rock", "paper"),
    PAPER("paper", "scissors"),
    SCISSORS("scissors", "rock");

    public String value;
    public String beatBy;

    Option(String value, String beatBy) {
        this.value = value;
        this.beatBy = beatBy;
    }

    public static int getAmount() {
        return Option.values().length;
    }

    public String getValue() {
        return value;
    }

    public String getBeatBy() {
        return beatBy;
    }
}
