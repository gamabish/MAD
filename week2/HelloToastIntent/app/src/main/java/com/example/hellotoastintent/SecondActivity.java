package com.example.hellotoastintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.recycleviewownprac.R;

public class SecondActivity extends AppCompatActivity {

    private TextView count_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        count_textview = findViewById(R.id.count_textView);
        Intent intent = getIntent();
        String count_message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        count_textview.setText(count_message);
    }
}
