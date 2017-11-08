package com.example.john.rockpaperscissors;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.john.rockpaperscissors.R.id.computer_result;
import static com.example.john.rockpaperscissors.R.id.player_result;
import static com.example.john.rockpaperscissors.R.id.result;

public class OutcomeActivity extends AppCompatActivity {

    private Game game;
    private Option gameOption;
    private Button homeButton;
    TextView resultText;
    TextView computerText;
    TextView playerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outcome);

        resultText = (TextView) findViewById(result);
        computerText = (TextView) findViewById(computer_result);
        playerText = (TextView) findViewById(player_result);

        Intent i = getIntent();
        Bundle extras = i.getExtras();
        game = new Game(gameOption);
        game.assignRandomOption();
        String player = extras.getString("playerResult");

        resultText.setText(game.result(player));
        computerText.setText(game.getGameOption().getValue());
        playerText.setText(player);

        homeButton = (Button) findViewById(R.id.home_button);
    }

    public void onPlayAgainClicked(View button) {

        Intent home = new Intent(this, GameActivity.class);
        startActivity(home);
    }

}
