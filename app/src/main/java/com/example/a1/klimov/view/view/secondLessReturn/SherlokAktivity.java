package com.example.a1.klimov.view.view.secondLessReturn;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.a1.klimov.R;

public class SherlokAktivity extends AppCompatActivity {

    static final private int CHOOSE_THIEF = 0;
    private Button mButtonChoose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aherlok_activity);
        mButtonChoose = (Button) findViewById(R.id.buttonChoose);

        mButtonChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent questionIntent = new Intent(SherlokAktivity.this, ShooseActivity.class);
                startActivityForResult(questionIntent, CHOOSE_THIEF);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView infoTextView = (TextView) findViewById(R.id.textViewInfo);

        if (requestCode == CHOOSE_THIEF) {
            if (resultCode == RESULT_OK) {
                String thiefname = data.getStringExtra(ShooseActivity.THIEF);
                infoTextView.setText(thiefname);
            }else {
                infoTextView.setText("");
            }
        }
    }
}
