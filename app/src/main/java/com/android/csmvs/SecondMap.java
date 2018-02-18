package com.android.csmvs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_map);
    }

    /**
     * onClick of European Painting Gallery (Left) image in SecondMap Activity
     * the method europeanPaintingGalleryL will be called which will
     * intent the user screen to EuropeanPaintingGalleryL which contains
     * information of items available in that Gallery
     */
    public void europeanPaintingGalleryL(View view) {
        Intent i = new Intent(this, EuropeanPaintingGalleryL.class);
        startActivity(i);
    }

    /**
     * onClick of European Painting Gallery (Right) image in SecondMap Activity
     * the method europeanPaintingGalleryR will be called which will
     * intent the user screen to EuropeanPaintingGalleryR which contains
     * information of items available in that Gallery
     */
    public void europeanPaintingGalleryR(View view) {
        Intent i = new Intent(this, EuropeanPaintingGalleryR.class);
        startActivity(i);
    }

    /**
     * onClick of Arms & Armour Gallery image in SecondMap Activity
     * the method armsArmourGallery will be called which will
     * intent the user screen to ArmsArmourGallery which contains
     * information of items available in that Gallery
     */
    public void armsArmourGallery(View view) {
        Intent i = new Intent(this, ArmsArmourGallery.class);
        startActivity(i);
    }

    /**
     * onClick of Indian Textiles & Costumes Gallery image in SecondMap Activity
     * the method indianTextilesCostumesGallery will be called which will
     * intent the user screen to IndianTextilesCostumesGallery which contains
     * information of items available in that Gallery
     */
    public void indianTextilesCostumesGallery(View view) {
        Intent i = new Intent(this, IndianTextilesCostumesGallery.class);
        startActivity(i);
    }
}
