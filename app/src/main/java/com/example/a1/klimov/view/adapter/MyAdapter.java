package com.example.a1.klimov.view.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.a1.klimov.R;
import com.example.a1.klimov.view.model.Lesson;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter{



    Context ctx;
    LayoutInflater lInflater;
    ArrayList<Lesson> object;


    public MyAdapter(Context context, ArrayList<Lesson> lesson){
        ctx = context;
        object = lesson;
        lInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return object.size();
    }

    @Override
    public Object getItem(int position) {
        return object.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null){
            view = lInflater.inflate(R.layout.item, parent, false);
        }
        Lesson lesson = getLessons(position);
        ((TextView) view.findViewById(R.id.lesson)).setText(lesson.lessonNumber);
        return view;
    }

     Lesson getLessons(int position) {

         return ((Lesson)getItem(position));
    }
}
