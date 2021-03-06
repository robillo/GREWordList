package com.appbusters.robinkamboj.grewordlist.model;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.appbusters.robinkamboj.grewordlist.R;
import com.appbusters.robinkamboj.grewordlist.controller.ItemClickListener;
import com.appbusters.robinkamboj.grewordlist.view.activities.DetailActivity;

public class View_Holder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener{

    public TextView word, meaning;
    public ImageButton bookmark;
    private ItemClickListener clickListener;
    private Context context;
    public CardView cardView;

    public View_Holder(View itemView) {
        super(itemView);

        context = itemView.getContext();
        word = (TextView) itemView.findViewById(R.id.word);
        meaning = (TextView) itemView.findViewById(R.id.meaning);
        bookmark = (ImageButton) itemView.findViewById(R.id.bookmark);
        cardView = (CardView) itemView.findViewById(R.id.cardView);

        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
    }

    public void setClickListener(ItemClickListener clickListener){
        this.clickListener = clickListener;
    }

    @Override
    public void onClick(View view) {
        clickListener.onClick(view, getAdapterPosition(), false);
    }

    @Override
    public boolean onLongClick(View view) {
        clickListener.onClick(view, getAdapterPosition(), true);
        return false;
    }

    public void intent(String word, String meaning, String example, boolean isBookmarked){
        Intent i = new Intent(context, DetailActivity.class);
        i.putExtra("word", word);
        i.putExtra("meaning", meaning);
        i.putExtra("example", example);
        i.putExtra("isBookmarked", isBookmarked);
        context.startActivity(i);
    }
}
