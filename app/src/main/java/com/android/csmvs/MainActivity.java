package com.android.csmvs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * ground_map method will intent activity_ground_map to open Map of Ground Floor
     */
    public void ground_map(View view) {
        Intent i = new Intent(this, GroundMap.class);
        startActivity(i);
    }

    /**
     * first_map method will intent activity_first_map to open Map of First Floor
     */
    public void first_map(View view) {
        Intent i = new Intent(this, FirstMap.class);
        startActivity(i);
    }

    /**
     * second_map method will intent activity_second_map to open Map of Second Floor
     */
    public void second_map(View view) {
        Intent i = new Intent(this, SecondMap.class);
        startActivity(i);
    }
}
