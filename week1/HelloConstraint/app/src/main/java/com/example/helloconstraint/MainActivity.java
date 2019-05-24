package com.example.helloconstraint;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button button_count, button_zero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView)findViewById(R.id.show_count);
        button_count = (Button)findViewById(R.id.button_count);
        button_zero = (Button)findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        if(mCount!=0){
            button_zero.setBackgroundColor(Color.GREEN);
        }else{
            button_zero.setBackgroundColor(Color.RED);
        }

        if(mCount%2==0){
            button_count.setBackgroundColor(Color.BLUE);
        }else{
            button_count.setBackgroundColor(Color.RED);
        }
    }

    public void countZero(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        button_zero.setBackgroundColor(Color.RED);
        button_count.setBackgroundColor(Color.BLUE);
    }
}
