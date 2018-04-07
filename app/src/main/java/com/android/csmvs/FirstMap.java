package com.android.csmvs;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class FirstMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_map);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE); //Allows Screen Orientation to Landscape from both sides
    }

    /**
     * onClick of Miniature Painting Gallery image in FirstMap Activity
     * the method miniaturePaintingGallery will be called which will
     * intent the user screen to MiniaturePaintingGallery which contains
     * information of items available in that Gallery
     */
    public void miniaturePaintingGallery(View view) {
        Intent i = new Intent(this, MiniaturePaintingGallery.class);
        startActivity(i);
    }

    /**
     * onClick of Indian Metalware & Decorative Art Gallery image in FirstMap Activity
     * the method indianMetalwareDecorativeArt will be called which will
     * intent the user screen to IndianMetalwareDecorativeArt which contains
     * information of items available in that Gallery
     */
    public void indianMetalwareDecorativeArt(View view) {
        Intent i = new Intent(this, IndianMetalwareDecorativeArt.class);
        startActivity(i);
    }

    /**
     * onClick of Prints Gallery image in FirstMap Activity
     * the method printsGallery will be called which will
     * intent the user screen to printsGallery which contains
     * information of items available in that Gallery
     */
    public void printsGallery(View view) {
        Intent i = new Intent(this, PrintsGallery.class);
        startActivity(i);
    }

    /**
     * onClick of Coins Gallery image in FirstMap Activity
     * the method coinsGallery will be called which will
     * intent the user screen to CoinsGallery which contains
     * information of items available in that Gallery
     */
    public void coinsGallery(View view) {
        Intent i = new Intent(this, CoinsGallery.class);
        startActivity(i);
    }

    /**
     * onClick of Himalayan Art Gallery image in FirstMap Activity
     * the method himalayanArtGallery will be called which will
     * intent the user screen to HimalayanArtGallery which contains
     * information of items available in that Gallery
     */
    public void himalayanArtGallery(View view) {
        Intent i = new Intent(this, HimalayanArtGallery.class);
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
