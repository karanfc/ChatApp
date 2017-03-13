package com.example.dell.finalchatapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class SplashActivity extends AppCompatActivity {
    private static final int SPLASH_TIME_MS = 2000;
    private Handler mHandler;
    private Runnable mRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mHandler = new Handler();
        mRunnable = new Runnable() {
            @Override
            public void run() {
                // check if user is already logged in or not
                if (FirebaseAuth.getInstance().getCurrentUser() != null) {
                    // if logged in redirect the user to user listing activity
                    Intent intent = new Intent(SplashActivity.this,UserListingActivity.class);
                    startActivity(intent);

                } else {
                    // otherwise redirect the user to login activity
                    Intent intent = new Intent(SplashActivity.this,Login.class);
                    startActivity(intent);
                }
                finish();
            }
        };

        mHandler.postDelayed(mRunnable, SPLASH_TIME_MS);
    }
}