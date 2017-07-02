package com.example.a1.klimov.view.view.fourthLesson;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.a1.klimov.R;



public class TraficLightActivity extends AppCompatActivity implements View.OnClickListener {


    private ConstraintLayout  mConstraintLayout;
    private TextView mInfoTextView;
    private Button redButton;
    private Button greenButton;
    private Button yellowButton;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trafic_light_activity);

        mConstraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        mInfoTextView = (TextView) findViewById(R.id.textView3);
        yellowButton = (Button) findViewById(R.id.buttonYellow);
        redButton = (Button) findViewById(R.id.buttonRed);
        greenButton = (Button) findViewById(R.id.buttonGreen);

        yellowButton.setOnClickListener(this);
        redButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);

        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView.setText(R.string.yellow);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(TraficLightActivity.this, R.color.yellowColor));
            }
        });
    }

    public void onRedButtonClick(View view) {
        mInfoTextView.setText(R.string.red);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
    }

    public void onGreenButtonClick(View view) {
        mInfoTextView.setText(R.string.green);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.greenColor));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonRed: mInfoTextView.setText("Красный"); break;
            case R.id.buttonGreen: mInfoTextView.setText("Зеленый"); break;
            case R.id.buttonYellow: mInfoTextView.setText("Желтый"); break;
        }

    }
}
