package com.example.batman.cards;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class VocablesActivity extends AppCompatActivity {

    private ArrayList<Vocable> vocables;
    private ArrayList<Chapter> chapters;
    private boolean[] checked;
    private int counter = 0;
    private String file_name = "vocables/vocables.txt";
    private Button b_solve, b_next, b_start;
    private TextView t_german, t_japanese_easy, t_japanese_hard;

    public void init() {

        // set up view
        this.setContentView(R.layout.activity_vocables);
        getWindow().getDecorView().setBackgroundColor(Color.BLACK);

        checked  = this.getIntent().getExtras().getBooleanArray("checked");
        try (InputStream k = getAssets().open(file_name)) {
            BufferedReader input = new BufferedReader(new InputStreamReader(k));
            Importer imp = new Importer();
            chapters = imp.import_vocables(input);
        } catch (IOException error) {
        }

        t_german = (TextView) findViewById(R.id.t_german);
        t_german.setTextColor(Color.WHITE);
        t_japanese_easy = (TextView) findViewById(R.id.t_japanese_easy);
        t_japanese_easy.setTextColor(Color.WHITE);
        t_japanese_hard = (TextView) findViewById(R.id.t_japanese_hard);
        t_japanese_hard.setTextColor(Color.WHITE);

        b_next = (Button) findViewById(R.id.b_next);
        b_next.setBackgroundColor(Color.WHITE);
        b_next.setEnabled(false);
        b_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_next.setEnabled(false);
                b_solve.setEnabled(true);
                if (counter < vocables.size() - 1) {
                    counter ++;
                } else {
                    counter = 0;
                }
                t_german.setText(vocables.get(counter).get_vocable_german());
                t_japanese_easy.setText(" ");
                t_japanese_hard.setText(" ");
            }
        });

        b_solve = (Button) findViewById(R.id.b_solve);
        b_solve.setBackgroundColor(Color.WHITE);
        b_solve.setEnabled(false);
        b_solve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_next.setEnabled(true);
                b_solve.setEnabled(false);
                t_japanese_easy.setText(vocables.get(counter).get_vocable_japanese_easy());
                t_japanese_hard.setText(vocables.get(counter).get_vocable_japanese_hard());
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocables);
        init();
        // fetch vocables
        define_vocabulary(chapters, checked);
        b_solve.setEnabled(true);
        t_german.setText(vocables.get(counter).get_vocable_german());
    }

    private void define_vocabulary(ArrayList<Chapter> chapters, boolean[] checked) {
        vocables = new ArrayList<>();
        for (int i = 0; i < checked.length; i++) {
            if (checked[i]) {
                Chapter current_chapter = chapters.get(i);
                for (int j = 0; j < current_chapter.get_vocables().size(); j++) {
                    vocables.add(current_chapter.get_vocables().get(j));
                }
            }
        }
    }
}
