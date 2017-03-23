package com.example.mauriciogodinez.basketpoints;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreA = 0;
    private int scoreB = 0;
    TextView sA;
    TextView sB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sA = (TextView) findViewById(R.id.score_a_text_view);
        sB = (TextView) findViewById(R.id.score_b_text_view);
    }

    public void addOneTeamA(View view){
        scoreA += 1;
        displayTeamA(scoreA);
    }

    public void addTwoTeamA(View view){
        scoreA += 2;
        displayTeamA(scoreA);
    }

    public void addThreeTeamA(View view){
        scoreA += 3;
        displayTeamA(scoreA);
    }

    public void addOneTeamB(View view){
        scoreB += 1;
        displayTeamB(scoreB);
    }

    public void addTwoTeamB(View view){
        scoreB += 2;
        displayTeamB(scoreB);
    }

    public void addThreeTeamB(View view){
        scoreB += 3;
        displayTeamB(scoreB);
    }

    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        displayTeamA(scoreA);
        displayTeamB(scoreB);
    }

    public void displayTeamA(int score){
        sA.setText(String.valueOf(score));
    }

    private void displayTeamB(int score){
        sB.setText(String.valueOf(score));
    }
}
