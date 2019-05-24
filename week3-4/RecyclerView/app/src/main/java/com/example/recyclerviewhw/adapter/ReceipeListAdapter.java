package com.example.recyclerviewhw.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recyclerviewhw.Model.Receipe;
import com.example.recyclerviewhw.R;
import com.example.recyclerviewhw.activities.ReceipeDetailActivity;

import java.util.LinkedList;

public class ReceipeListAdapter extends  RecyclerView.Adapter<ReceipeListAdapter.WordViewHolder>{
    private final LinkedList<Receipe> mReceipes;
    private Context mContext;
    private LayoutInflater mInflater;

    public ReceipeListAdapter(Context context, LinkedList<Receipe> mReceipes) {
        mInflater = LayoutInflater.from(context);
        this.mContext = context;
        this.mReceipes = mReceipes;
    }

    @NonNull
    @Override
    public ReceipeListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View mItemView = mInflater.inflate(R.layout.receipelist_item,
                parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ReceipeListAdapter.WordViewHolder wordViewHolder, int i) {
        Receipe mCurrent = mReceipes.get(i);
        wordViewHolder.ReceipeTitle.setText(mCurrent.getReceipeTitle());
        wordViewHolder.receipeOverview.setText(mCurrent.getReceipeOverview());
    }

    @Override
    public int getItemCount() {
        return mReceipes.size();
    }

    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public final TextView ReceipeTitle;
        public final TextView receipeOverview;
        final ReceipeListAdapter mAdapter;


        public WordViewHolder(@NonNull View itemView, ReceipeListAdapter adapter) {
            super(itemView);
            ReceipeTitle = itemView.findViewById(R.id.receipeTitle);
            receipeOverview = itemView.findViewById(R.id.receipeOverview);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Receipe receipe = mReceipes.get(getAdapterPosition());
            Intent intent = new Intent(mContext, ReceipeDetailActivity.class);
            intent.putExtra("Receipe", receipe);
            mContext.startActivity(intent);
//            // Get the position of the item that was clicked.
//            int mPosition = getLayoutPosition();
//// Use that to access the affected item in mWordList.
//            Receipe element = mReceipes.get(mPosition);
//// Change the word in the mWordList.;
//            element.setReceipeTitle("Clicked Title");
//// Notify the adapter, that the data has changed so it can
//// update the RecyclerView to display the data.
//            mAdapter.notifyDataSetChanged();
        }
    }
}
