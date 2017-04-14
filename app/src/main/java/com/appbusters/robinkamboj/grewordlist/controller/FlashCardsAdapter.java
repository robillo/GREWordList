package com.appbusters.robinkamboj.grewordlist.controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.appbusters.robinkamboj.grewordlist.R;
import com.appbusters.robinkamboj.grewordlist.model.FlashCardsHolder;

import java.util.Collections;
import java.util.List;

public class FlashCardsAdapter extends RecyclerView.Adapter<FlashCardsHolder>{

    public FlashCardsAdapter(List<String> data, Context context) {
        this.data = data;
        this.context = context;
    }

    private List<String> data = Collections.emptyList();
    private Context context;

    @Override
    public FlashCardsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new FlashCardsHolder(LayoutInflater.from(context).inflate(R.layout.row_flash_cards, parent, false));
    }

    @Override
    public void onBindViewHolder(FlashCardsHolder holder, int position) {
        final Animation animation = AnimationUtils.loadAnimation(context, R.anim.anim);
        holder.itemView.setAnimation(animation);
        holder.meaning.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
