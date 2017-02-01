package com.example.batman.cards;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This class implements the window where the user chooses which chapters to lern.
 */
public class PickVocablesActivity extends AppCompatActivity {

    private CheckBox[] cb_chap = new CheckBox[25];
    private Button start;

    public void init() {
        // set up view
        this.setContentView(R.layout.activity_pick_vocables);
        getWindow().getDecorView().setBackgroundColor(Color.BLACK);



        cb_chap[0] = (CheckBox)findViewById(R.id.chap1);
        cb_chap[1] = (CheckBox)findViewById(R.id.chap2);
        cb_chap[2] = (CheckBox)findViewById(R.id.chap3);
        cb_chap[3] = (CheckBox)findViewById(R.id.chap4);
        cb_chap[4] = (CheckBox)findViewById(R.id.chap5);
        cb_chap[5] = (CheckBox)findViewById(R.id.chap6);
        cb_chap[6] = (CheckBox)findViewById(R.id.chap7);
        cb_chap[7] = (CheckBox)findViewById(R.id.chap8);
        cb_chap[8] = (CheckBox)findViewById(R.id.chap9);
        cb_chap[9] = (CheckBox)findViewById(R.id.chap10);
        cb_chap[10] = (CheckBox)findViewById(R.id.chap11);
        cb_chap[11] = (CheckBox)findViewById(R.id.chap12);
        cb_chap[12] = (CheckBox)findViewById(R.id.chap13);
        cb_chap[13] = (CheckBox)findViewById(R.id.chap14);
        cb_chap[14] = (CheckBox)findViewById(R.id.chap15);
        cb_chap[15] = (CheckBox)findViewById(R.id.chap16);
        cb_chap[16] = (CheckBox)findViewById(R.id.chap17);
        cb_chap[17] = (CheckBox)findViewById(R.id.chap18);
        cb_chap[18] = (CheckBox)findViewById(R.id.chap19);
        cb_chap[19] = (CheckBox)findViewById(R.id.chap20);
        cb_chap[20] = (CheckBox)findViewById(R.id.chap21);
        cb_chap[21] = (CheckBox)findViewById(R.id.chap22);
        cb_chap[22] = (CheckBox)findViewById(R.id.chap23);
        cb_chap[23] = (CheckBox)findViewById(R.id.chap24);
        cb_chap[24] = (CheckBox)findViewById(R.id.chap25);
        for (int i = 0; i < cb_chap.length; i++) {
            cb_chap[i].setTextColor(Color.WHITE);
        }

        start = (Button) findViewById(R.id.los);
        start.setBackgroundColor(Color.WHITE);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean[] checked = new boolean[25];
                boolean at_least_one = false;
                for (int i = 0; i < cb_chap.length; i++) {
                    if (cb_chap[i].isChecked()) {
                        checked[i] = true;
                        at_least_one = true;
                    }
                }
                if (at_least_one) {
                    // push the values to the next activity
                    Intent intent_vocables = new Intent(PickVocablesActivity.this, VocablesActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putBooleanArray("checked", checked);
                    intent_vocables.putExtras(bundle);
                    startActivity(intent_vocables);
                } else {
                    new AlertDialog.Builder(PickVocablesActivity.this)
                            .setTitle("Ernsthaft?")
                            .setMessage("Wähle mal paar Kapitel, du faules Stück Scheiße!")
                            .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    // get back here!
                                }
                            })
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                }
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_vocables);
        init();
    }
}
