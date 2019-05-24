package com.example.droidcafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    TextView textview_order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        textview_order = findViewById(R.id.textview_desc);
        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String value = extras.getString(MainActivity.TAG);
            textview_order.setText(value);
        }
    }
}
