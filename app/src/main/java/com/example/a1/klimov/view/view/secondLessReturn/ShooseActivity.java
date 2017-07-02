package com.example.a1.klimov.view.view.secondLessReturn;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.a1.klimov.R;

public class ShooseActivity extends AppCompatActivity{

    public final static String THIEF = "com.example.a1.klimov.view.view.THIEF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aherlok_activity);

    }

    public void onRadioClick(View v){
        Intent answerIntent = new Intent();

        switch (v.getId()){
            case R.id.radioDog:
                answerIntent.putExtra(THIEF, "Сраный пёсик");
                break;
            case R.id.radioCrow:
                answerIntent.putExtra(THIEF, "Ворона");
                break;
            case R.id.radioCat:
                answerIntent.putExtra(THIEF, "Лошадь Пржевальского");
                break;

            default:
                break;
        }
        setResult(RESULT_OK, answerIntent);
        finish();
    }
}
