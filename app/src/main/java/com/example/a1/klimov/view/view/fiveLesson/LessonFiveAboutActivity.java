package com.example.a1.klimov.view.view.fiveLesson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.a1.klimov.R;


public class LessonFiveAboutActivity extends AppCompatActivity {

    String user = "ЖЫвотное";
    String gift = "дырку от бублика";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_five_lesson_text);

        user = getIntent().getExtras().getString(LessonFiveActivity.USER);
        user = getIntent().getExtras().getString(LessonFiveActivity.GIFT);

        TextView infoTextView = (TextView)findViewById(R.id.textViewInfo);
        infoTextView.setText(user + " , вам передали " + gift);
    }
}
