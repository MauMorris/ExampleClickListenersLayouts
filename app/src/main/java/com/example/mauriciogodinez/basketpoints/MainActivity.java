package com.example.mauriciogodinez.basketpoints;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private int scoreA = 0;
    private int scoreB = 0;
    TextView scoreATextView;
    TextView scoreBTextView;

    public static final String SCORE_EXTRA = "score";
    public static final int SCORE_EXTRA_TEAM_A = 0;
    public static final int SCORE_EXTRA_TEAM_B = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreATextView = findViewById(R.id.score_a_text_view);
        scoreBTextView = findViewById(R.id.score_b_text_view);

        if (savedInstanceState != null){
            if(savedInstanceState.containsKey(SCORE_EXTRA)){
                ArrayList <Integer> updatedScore = savedInstanceState.getIntegerArrayList(SCORE_EXTRA);
               if(updatedScore != null) {
                   if (updatedScore.size() > 0) {
                       scoreA = updatedScore.get(SCORE_EXTRA_TEAM_A);
                       displayTeamA(scoreA);
                       scoreB = updatedScore.get(SCORE_EXTRA_TEAM_B);
                       displayTeamB(scoreB);
                   }
               }
            }
        }
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
        scoreATextView.setText(String.valueOf(score));
    }

    private void displayTeamB(int score){
        scoreBTextView.setText(String.valueOf(score));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ArrayList <Integer> scoreToBeSave = new ArrayList<>();

        scoreToBeSave.add(SCORE_EXTRA_TEAM_A, scoreA);
        scoreToBeSave.add(SCORE_EXTRA_TEAM_B, scoreB);

        outState.putIntegerArrayList(SCORE_EXTRA, scoreToBeSave);
    }
}