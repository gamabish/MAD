package com.example.recyclerviewhw.activities;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.recyclerviewhw.Model.Receipe;
import com.example.recyclerviewhw.R;
import com.example.recyclerviewhw.adapter.ReceipeListAdapter;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private LinkedList<Receipe> mReceipes;
    private RecyclerView mRecyclerView;
    private ReceipeListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        InitializeData();



        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
// Create an adapter and supply the data to be displayed.
        mAdapter = new ReceipeListAdapter(this, mReceipes);
// Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
// Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void InitializeData(){
        mReceipes = new LinkedList<Receipe>();
        mReceipes.add(new Receipe("299537","Curry", "Curry is what Indians eat for breakfast, lunch, and dinner", "Curry is what Indians eat for breakfast, lunch, and dinner\n" +
                "Talking about India, the first and foremost thing that every Japanese knew is the curry. All the Indian restaurants in Japan have Naan and curry in their menus. It again fixed the Japanese belief that curry is the one and only inevitable food item in India. Some people who have connections with India knew other food items there. But the number of those people are really less.\n" +
                "Whomever I have talked with in my place, the countryside city of Tajimi, believe that Indian food is all about curry. I have tried to change their concept talking about various other food items we are consuming in our daily diet.", "R.drawable.curry"));
        mReceipes.add(new Receipe("299537","Misal Pav", "Misal Pav, Maharashtra", "This Maharashtrian delight consists of sprouted moth beans cooked in some spicy gravy peppered with coriander, onions, tomatoes and some crunchy farsan. Team it with some pav (bread) toasted with butter and you might end up saying Jai Maharashtra!", "/0*gMxBDbMRUVUcwrzo.jpg"));
        mReceipes.add(new Receipe("299537","hyderabadi Biryani", "hyderabadi Biryani, Telangana", "They say a way to a man's heart is through food. Known for their hospitality, the Hyderabadis swear by this rule and will kill you with an overdose of love by serving you lots of lip-smacking Biryani.", "/0*gMxBDbMRUVUcwrzo.jpg"));
        mReceipes.add(new Receipe("299537","Ras Malai", "Ras Malai, Odisha", " \n" +
                "Store it in the fridge as Ras Malai is best when it's served chilled. A word of caution: This one might not stay in the fridge for long.", "/0*gMxBDbMRUVUcwrzo.jpg"));


    }
}
