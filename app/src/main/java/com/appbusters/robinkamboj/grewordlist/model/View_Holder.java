package com.appbusters.robinkamboj.grewordlist.model;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.appbusters.robinkamboj.grewordlist.R;
import com.appbusters.robinkamboj.grewordlist.controller.ItemClickListener;

public class View_Holder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener{

    public TextView word, meaning;
    public ImageButton bookmark;
    private ItemClickListener clickListener;
    private Context context;

    public View_Holder(View itemView) {
        super(itemView);

        context = itemView.getContext();
        word = (TextView) itemView.findViewById(R.id.word);
        meaning = (TextView) itemView.findViewById(R.id.meaning);
        bookmark = (ImageButton) itemView.findViewById(R.id.bookmark);

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
}
