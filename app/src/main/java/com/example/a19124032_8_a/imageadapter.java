package com.example.a19124032_8_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class imageadapter extends BaseAdapter {
    private int[] images_id={R.drawable.butterfly,R.drawable.fox,R.drawable.chick,R.drawable.octopus,R.drawable.pufferfish,R.drawable.turtle,R.drawable.cat};
    Context ctx;
    imageadapter(Context ctx){
        this.ctx = ctx ;

    }
    @Override
    public int getCount() {
        return images_id.length;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return images_id[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridView = convertView ;
        if(gridView == null){


            LayoutInflater inflater =(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.show_image,null);
        }
        ImageView i1 = (ImageView)gridView.findViewById(R.id.myimage);
        i1.setImageResource(images_id[position]);
        return gridView;
    }
};