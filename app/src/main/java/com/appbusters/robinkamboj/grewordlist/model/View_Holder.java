package com.appbusters.robinkamboj.grewordlist.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.appbusters.robinkamboj.grewordlist.R;

public class View_Holder extends RecyclerView.ViewHolder{

    public TextView word, meaning;
    public ImageButton bookmark;

    public View_Holder(View itemView) {
        super(itemView);

        word = (TextView) itemView.findViewById(R.id.word);
        meaning = (TextView) itemView.findViewById(R.id.meaning);
        bookmark = (ImageButton) itemView.findViewById(R.id.bookmark);
    }
}
