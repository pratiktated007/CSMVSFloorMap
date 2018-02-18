package com.android.csmvs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SculptureGallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sculpture_gallery);
    }

    public void groundSculptureGallery(View view) {
        Intent i = new Intent(this, SculptureGallery.class);
        startActivity(i);
    }
}
