package com.android.csmvs;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;


public class MyAdapter extends BaseExpandableListAdapter {

    private List<String> header_title;
    private HashMap<String,String> child_title;
    private Context ctx;
    private List<Bitmap> photo;

    MyAdapter(Context ctx, List<String> header_title , HashMap<String,String> child_title, List<Bitmap> photo ){
        this.ctx = ctx;
        this.child_title = child_title;
        this.header_title = header_title;
        this.photo = photo;

    }
    @Override
    public int getGroupCount() {
        return header_title.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return 1;
    }

    @Override
    public Object getGroup(int i) {
        return header_title.get(i);
    }

    @Override
    public Object getChild(int i, int pos) {
        return child_title.get(header_title.get(i));
    }

    public Bitmap getPhoto(int i){
        return photo.get(i);
    }
    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        String title = (String) this.getGroup(i);

        if (view == null){
            LayoutInflater layoutInflater = (LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.parent_layout,null);
        }

        TextView textView = view.findViewById(R.id.heading_item);
        textView.setText(title);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        String title = (String) this.getChild(i, i1);
        Bitmap img = this.getPhoto(i);
        if (view == null){
            LayoutInflater layoutInflater = (LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.child_layout,null);
        }
        ImageView imageView = view.findViewById(R.id.info_img);
        imageView.setImageBitmap(img);
        TextView textView = view.findViewById(R.id.child_items);
        textView.setText(title);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
