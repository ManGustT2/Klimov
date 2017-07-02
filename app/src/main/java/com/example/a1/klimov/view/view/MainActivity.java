package com.example.a1.klimov.view.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.a1.klimov.R;
import com.example.a1.klimov.view.adapter.MyAdapter;
import com.example.a1.klimov.view.model.Lesson;
import com.example.a1.klimov.view.view.firstLesson.LessonOneActivity;
import com.example.a1.klimov.view.view.fiveLesson.LessonFiveActivity;
import com.example.a1.klimov.view.view.fourthLesson.TraficLightActivity;
import com.example.a1.klimov.view.view.secondLessReturn.SherlokAktivity;
import com.example.a1.klimov.view.view.thirdLesson.OrientationActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private ArrayList<Lesson> lessons = new ArrayList<Lesson>();
    private MyAdapter myAdapter;
    private LessonOneActivity lessonOneActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillData();
        myAdapter = new MyAdapter(this, lessons);

        ListView lvMain = (ListView) findViewById(R.id.lvMain);
        lvMain.setAdapter(myAdapter);

        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;
                switch (position){
                    case 0:
                        intent = new Intent(MainActivity.this, LessonOneActivity.class);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, SherlokAktivity.class);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, OrientationActivity.class);
                        break;
                    case 3:
                        intent = new Intent(MainActivity.this, TraficLightActivity.class);
                        break;
                    case 4:
                        intent = new Intent(MainActivity.this, LessonFiveActivity.class);
                        break;
                    case 5:
                        intent = new Intent(MainActivity.this, OrientationActivity.class);
                }

                startActivity(intent);
            }
        });
    }

    void fillData() {
        for (int i = 1; i <= 30; i++) {
            lessons.add(new Lesson("Lesson"+ " " + i));
        }
    }
}
