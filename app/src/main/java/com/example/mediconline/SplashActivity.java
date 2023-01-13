package com.example.mediconline;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SystemClock.sleep(3000);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish(); // evitar regresar a éste activity
    }
}