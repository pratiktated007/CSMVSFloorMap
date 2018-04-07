package com.android.csmvs;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class SecondMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_map);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE); //Allows Screen Orientation to Landscape from both sides
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

    /**
     * onClick of Chinese & Japanese Art Gallery image in SecondMap Activity
     * the method chineseJapaneseGallery will be called which will
     * intent the user screen to ChineseJapaneseArtGallery which contains
     * information of items available in that Gallery
     */
    public void chineseJapaneseGallery(View view) {
        Intent i = new Intent(this, ChineseJapaneseArtGallery.class);
        startActivity(i);
    }

    /**
     * onClick of Jehangir Sabvala Gallery image in SecondMap Activity
     * the method jehangirSabvalaGallery will be called which will
     * intent the user screen to JehangirSabvalaGallery which contains
     * information of items available in that Gallery
     */
    public void jehangirSabvalaGallery(View view) {
        Intent i = new Intent(this, JehangirSabvalaGallery.class);
        startActivity(i);
    }

    /**
     * onClick of Bombay School Gallery image in SecondMap Activity
     * the method bombaySchoolGallery will be called which will
     * intent the user screen to BombaySchoolGallery which contains
     * information of items available in that Gallery
     */
    public void bombaySchoolGallery(View view) {
        Intent i = new Intent(this, BombaySchoolGallery.class);
        startActivity(i);
    }

    /**
     * Toast to display "Gallery Data not available"
     * onClick on Galleries whose data is not available
     */
    public void toast(View view) {
        final Toast toast = Toast.makeText(this, "Gallery Data not available", Toast.LENGTH_SHORT);
        toast.show();


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, 1000);
    }
}
