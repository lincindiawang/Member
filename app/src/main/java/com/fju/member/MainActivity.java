package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText userid;

    //    String abc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       getSharedPreferences("Jack",MODE_PRIVATE);
        startActivity(new Intent(this,NicknameActivity.class));
//        userid = findViewById(R.id.edNickname);
//        String userid = getSharedPreferences("test",MODE_PRIVATE)
//                .getString("USER","");

    }
}
