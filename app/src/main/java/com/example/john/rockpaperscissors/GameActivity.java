package com.example.john.rockpaperscissors;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {

    private Button rockButton;
    private Button paperButton;
    private Button scissorsButton;
    private Game game;
    private Option gameOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        game = new Game(gameOption);

        rockButton = (Button) findViewById(R.id.rock_button);
        paperButton = (Button) findViewById(R.id.paper_button);
        scissorsButton = (Button) findViewById(R.id.scissors_button);
    }

    public void onRockClicked(View button) {
        Intent i = new Intent(this, OutcomeActivity.class);
        i.putExtra("playerResult", "rock");
        startActivity(i);
    }

    public void onPaperClicked(View button) {
        Intent i = new Intent(this, OutcomeActivity.class);
        i.putExtra("playerResult", "paper");
        startActivity(i);
    }

    public void onScissorsClicked(View button) {
        Intent i = new Intent(this, OutcomeActivity.class);
        i.putExtra("playerResult", "scissors");
        startActivity(i);
    }

}
