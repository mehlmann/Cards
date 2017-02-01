package com.example.batman.cards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class PickVerbsActivity extends AppCompatActivity {

    private CheckBox[] cb_chap = new CheckBox[25];
    private Button start;

    public void init() {
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

        start = (Button) findViewById(R.id.los);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_verbs);
        init();
    }
}
