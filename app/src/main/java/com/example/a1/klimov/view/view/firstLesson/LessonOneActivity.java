package com.example.a1.klimov.view.view.firstLesson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.a1.klimov.R;



public class LessonOneActivity extends AppCompatActivity {

    private TextView mHelloTextView;
    private EditText mNameEditText;
    private Button mButton;
    private int mCount = 0;
    private static final String KEY_COUNT = "COUNT";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onelesson);
        mHelloTextView = (TextView)findViewById(R.id.textView);
        mNameEditText = (EditText) findViewById(R.id.editText);
        mButton = (Button) findViewById(R.id.button);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(mToolbar);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mButton.setText("Я насчитал " + ++mCount + " ворон");
            }
        });
        if (savedInstanceState != null) {
            mCount = savedInstanceState.getInt(KEY_COUNT, 0);
            mNameEditText.setText("Я насчитал " + mCount + " ворон");
        }


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onClick(View view) {
        if (mNameEditText.getText().length() == 0) {
            mHelloTextView.setText("Hello Kitty!");
        } else {
            mHelloTextView.setText("Привет," + mNameEditText.getText());
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(KEY_COUNT, mCount);
    }

}
