package com.example.recyclerviewhw.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerviewhw.Model.Receipe;
import com.example.recyclerviewhw.R;
import com.squareup.picasso.Picasso;

public class ReceipeDetailActivity extends AppCompatActivity {

    Receipe receipe;
    ImageView ivImageView;
    TextView tvDesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipe_detail);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ivImageView = findViewById(R.id.receipeImageView);
        tvDesc = findViewById(R.id.tvReceipeDesc);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Bundle extras = getIntent().getExtras();

        if (extras!=null){
            receipe = (Receipe)extras.getSerializable("Receipe");
            tvDesc.setText(receipe.getReceipeDesc());
            //Picasso.get().load(receipe.getReceipeImage()).into(ivImageView);

            ivImageView.setImageResource(receipe.getReceipeImage());
        }
    }

}
