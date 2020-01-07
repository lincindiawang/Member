package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AgeActivity extends AppCompatActivity implements View.OnClickListener {
    boolean ageright = false;
    private EditText age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        age = findViewById(R.id.aage);
        findViewById(R.id.ageright).setOnClickListener(this);
        String age = "20";
        SharedPreferences pref = getSharedPreferences("test",MODE_PRIVATE);
        pref.edit()
                .putString("AGE",age)
                .commit();
    }

    @Override
    public void onClick(View v) {
        if(!ageright){
            Intent intent = new Intent(this,GenderActivity.class);
            startActivity(intent);
        }
    }
}
