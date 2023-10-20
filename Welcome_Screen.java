package com.example.hglibrary.screen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hglibrary.R;

public class Welcome_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);


        new Handler().postDelayed(new Runnable() {
            @Override

            public void run() {

                Intent intent = new Intent(Welcome_Screen.this, Login_Screen.class);
                startActivity(intent);
                finish();
            }
        },1500);

    }
}