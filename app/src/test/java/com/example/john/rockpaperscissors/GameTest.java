package com.example.john.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by John on 08/11/2017.
 */

public class GameTest {

    Game game;
    Option playerOption;
    Option gameOption;

    @Before
    public void setUp() throws Exception {
        game = new Game(gameOption);
    }

    @Test
    public void canGetGameOption () {
        game.assignRandomOption();
        assertNotNull(game.getGameOption());
    }

    @Test
    public void testResultDraw () {
        game.setGameOption(Option.ROCK);
        assertEquals("draw", game.result("rock"));
    }

    @Test
    public void testResultWin () {
        game.setGameOption(Option.ROCK);
        assertEquals("win", game.result("paper"));
    }

    @Test
    public void testResultLose () {
        game.setGameOption(Option.SCISSORS);
        assertEquals("lose", game.result("paper"));
    }

}
