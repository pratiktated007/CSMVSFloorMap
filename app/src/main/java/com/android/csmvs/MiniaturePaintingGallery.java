package com.android.csmvs;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MiniaturePaintingGallery extends AppCompatActivity {
    ExpandableListView expandableListView;
    DataBaseHelper dataBaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//Change this activity name depending on gallery //Change this activity name depending on gallery
        setContentView(R.layout.activity_miniature_painting_gallery);

        expandableListView = this.findViewById(R.id.expandable_info);
        dataBaseHelper = new DataBaseHelper(this);
        List<String> Heading = new ArrayList<String>() ;
        List<String> property = new ArrayList<String>();

        HashMap<String , String> childitems = new HashMap<String, String >();
        Cursor res;
        SQLiteDatabase db = dataBaseHelper.getWritableDatabase();
// Change the Table Name here. Change the Table Name in Database too having space in between with either _(underscore) or no space.
        res = db.rawQuery("Select * from INDIANMINIATUREPAINTINGS", null);//.getData("ARMS");


        byte []img;
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.f1);
        List<Bitmap> photo = new ArrayList<Bitmap>();
        while (res.moveToNext()){
            Heading.add(res.getString(1));
            String str = "MATERIAL:\n" + res.getString(2) + "\n\nPERIOD:\n" + res.getString(3) + "\n\nACQUISITION YEAR:\n" + res.getString(4)+"\n\nPROVENANCE:\n" + res.getString(5)+"\n\nDESCRIPTION:\n" + res.getString(6)+"\n\nRELIGION:\n" + res.getString(7);
            property.add(str);
            img = res.getBlob(res.getColumnIndex("IMAGE"));
            if(img != null) {
                b = BitmapFactory.decodeByteArray(img, 0, img.length);
            }
            photo.add(b);
        }
        for(int i = 0; i < Heading.size();i++){
            childitems.put(Heading.get(i),property.get(i));
        }

        //Adapter_guide adapter_guide = new Adapter_guide(this,Heading,childitems);
        MyAdapter myAdapter = new MyAdapter(this,Heading,childitems,photo);

        expandableListView.setAdapter(myAdapter);

    }
}
