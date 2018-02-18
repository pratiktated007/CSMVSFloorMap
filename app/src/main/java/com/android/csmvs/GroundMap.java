package com.android.csmvs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GroundMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ground_map);
    }

    /**
     * onClick of Pre Photo & History Gallery image in GroundMap Activity
     * the method groundPrePhotoHistoryGallery will be called which will
     * intent the user screen to PrePhotoHistoryGallery which contains
     * information of items available in that Gallery
     */
    public void groundPrePhotoHistoryGallery(View view) {
        Intent i = new Intent(this, PrePhotoHistoryGallery.class);
        startActivity(i);
    }

    /**
     * onClick of Sculpture Gallery image in GroundMap Activity
     * the method groundSculptureGallery will be called which will
     * intent the user screen to SculptureGallery which contains
     * information of items available in that Gallery
     */
    public void groundSculptureGallery(View view) {
        Intent i = new Intent(this, SculptureGallery.class);
        startActivity(i);
    }

    /**
     * onClick of Natural History Section image in GroundMap Activity
     * the method groundNaturalHistorySection will be called which will
     * intent the user screen to NaturalHistorySection which contains
     * information of items available in that Section
     */
    public void groundNaturalHistorySection(View view) {
        Intent i = new Intent(this, NaturalHistorySection.class);
        startActivity(i);
    }
}
