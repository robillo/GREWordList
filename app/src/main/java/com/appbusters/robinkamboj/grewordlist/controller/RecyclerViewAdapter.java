package com.appbusters.robinkamboj.grewordlist.controller;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.appbusters.robinkamboj.grewordlist.R;
import com.appbusters.robinkamboj.grewordlist.model.Data;
import com.appbusters.robinkamboj.grewordlist.model.View_Holder;

import java.util.Collections;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<View_Holder>{

    private List<Data> list = Collections.emptyList();
    private Context context;

    private String word, meaning, example;
    private Boolean isBookmarked;

    public RecyclerViewAdapter(List<Data> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new View_Holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(final View_Holder holder, int position) {

        word = list.get(position).getWord();
        meaning = list.get(position).getMeaning();
        example = list.get(position).getExample();
        isBookmarked = true;

        holder.word.setText(word);
        holder.meaning.setText(meaning);

        holder.setClickListener(new ItemClickListener() {
            @Override
            public void onClick(View v, int position, boolean isLongClick) {
                if(!isLongClick){
                    holder.intent(word, meaning, example, isBookmarked);
                }
                else {
                    holder.intent(word, meaning, example, isBookmarked);
                }
            }
        });

//        final Animation animation = AnimationUtils.loadAnimation(context, R.anim.anim);
//        holder.itemView.setAnimation(animation);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
