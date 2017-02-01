package com.example.batman.cards;

import android.content.Intent;
import android.graphics.Color;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This class implements the start screen and the main activity of the application.
 */
public class StartActivity extends AppCompatActivity {

    private Button b_vocables, b_verbs;

    public void init() {
        // set up view
        this.setContentView(R.layout.activity_start);
        getWindow().getDecorView().setBackgroundColor(Color.BLACK);

        // Set up buttons
        b_vocables = (Button)findViewById(R.id.vocablesButton);
        b_vocables.setBackgroundColor(Color.WHITE);
        b_vocables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_pick_vocables = new Intent(StartActivity.this, PickVocablesActivity.class);
                startActivity(intent_pick_vocables);
                }
        });

        b_verbs = (Button)findViewById(R.id.verbsButton);
        b_verbs.setBackgroundColor(Color.WHITE);
        b_verbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_pick_verbs = new Intent(StartActivity.this, PickVerbsActivity.class);
                startActivity(intent_pick_verbs);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        init();
    }
}
