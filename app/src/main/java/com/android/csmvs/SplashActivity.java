package com.android.csmvs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Start Main Activity
        startActivity(new Intent(this, MainActivity.class));

        //Close Splash Activity
        finish();
    }
}
