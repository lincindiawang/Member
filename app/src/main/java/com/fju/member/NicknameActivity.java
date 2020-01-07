package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NicknameActivity extends AppCompatActivity implements View.OnClickListener {
    boolean nickright = false;
    private EditText user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
        user = findViewById(R.id.nickname);
        findViewById(R.id.nickright).setOnClickListener(this);
//        getSharedPreferences("Jack",MODE_PRIVATE);
//        startActivity(new Intent(this,NicknameActivity.class));
        String user = "jack";
        SharedPreferences pref = getSharedPreferences("test",MODE_PRIVATE);
        pref.edit()
                .putString("USER",user)
                .commit();

    }

    @Override
    public void onClick(View v) {
        if(!nickright){
            Intent intent = new Intent(this,AgeActivity.class);
            startActivity(intent);
        }
    }
}
