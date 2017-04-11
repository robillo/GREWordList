package com.appbusters.robinkamboj.grewordlist.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.appbusters.robinkamboj.grewordlist.R;

public class FlashCardsHolder extends RecyclerView.ViewHolder{

    public TextView meaning;

    public FlashCardsHolder(View itemView) {
        super(itemView);
        meaning = (TextView) itemView.findViewById(R.id.meaning);
    }
}
