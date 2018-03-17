package com.android.csmvs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.io.IOException;
import java.sql.SQLException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataBaseHelper myDB = new DataBaseHelper(this);
        try {
            Log.i("create", "h");
            myDB.createDataBase();
        } catch (IOException e) {
            e.printStackTrace();
            Log.i("create error", e.getMessage());
        }
        try {
            Log.i("Open", "YES");
            myDB.openDataBase();
        } catch (SQLException e) {
            e.printStackTrace();
            Log.i("Open Error", e.getMessage());
        }
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
