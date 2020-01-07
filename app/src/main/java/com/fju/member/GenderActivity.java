package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class GenderActivity extends AppCompatActivity implements View.OnClickListener {

    boolean gDone = false;
    private RadioButton rbB;
    private RadioButton rbG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        rbB = findViewById(R.id.rbB);
        rbG = findViewById(R.id.rbG);
        findViewById(R.id.gDone).setOnClickListener(this);
        String gender = "男性";
        SharedPreferences pref = getSharedPreferences("test",MODE_PRIVATE);
        pref.edit()
                .putString("Gender",gender)
                .commit();
    }

    @Override
    public void onClick(View v) {
        if (!gDone){

        }
    }
}
