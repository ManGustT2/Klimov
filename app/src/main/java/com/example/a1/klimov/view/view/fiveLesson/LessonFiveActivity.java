package com.example.a1.klimov.view.view.fiveLesson;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.a1.klimov.R;

public class LessonFiveActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mButtonIntent;
    private Button mButtonSend;
    public final static String USER = "com.example.a1.klimov.view.view.USER";
    public final static String GIFT = "com.example.a1.klimov.view.view.GIFT";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_lesson);

        mButtonIntent = (Button) findViewById(R.id.buttonIntent);
        mButtonSend = (Button) findViewById(R.id.buttonSend);

        mButtonIntent.setOnClickListener(this);
        mButtonSend.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        EditText userEditText = (EditText) findViewById(R.id.editTextUser);
        EditText giftEditText = (EditText) findViewById(R.id.editTextGift);
        Intent intent = new Intent(LessonFiveActivity.this, LessonFiveAboutActivity.class);

        intent.putExtra(USER ,userEditText.getText().toString());
        intent.putExtra(GIFT ,giftEditText.getText().toString());

        startActivity(intent);

    }
}
