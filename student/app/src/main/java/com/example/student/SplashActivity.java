package com.example.student;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;



import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    // Splash screen duration in milliseconds
    private static final int SPLASH_DURATION = 2000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Using a handler to delay the execution of code for the splash screen duration
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the main activity after the splash screen duration
                startActivity(new Intent(SplashActivity.this, RegistrationActivity.class));
                finish();
            }
        }, SPLASH_DURATION);
    }
}
