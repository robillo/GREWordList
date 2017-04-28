package com.appbusters.robinkamboj.grewordlist.controller;

import android.animation.Animator;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.appbusters.robinkamboj.grewordlist.R;
import com.appbusters.robinkamboj.grewordlist.model.FlashCardsHolder;
import com.willowtreeapps.spruce.Spruce;
import com.willowtreeapps.spruce.animation.DefaultAnimations;
import com.willowtreeapps.spruce.sort.LinearSort;

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
        holder.meaning.setText(data.get(position));
        animateView(holder.cardView);
    }

    private void animateView(CardView linearLayout) {
        Animator[] animators = new Animator[]{
                DefaultAnimations.shrinkAnimator(linearLayout, 500L),
                DefaultAnimations.fadeInAnimator(linearLayout, 500L)
        };

        LinearSort linearSort = new LinearSort(100L, false, LinearSort.Direction.TOP_TO_BOTTOM);

        Animator spruceAnimator = new Spruce
                .SpruceBuilder(linearLayout)
                .sortWith(linearSort)
                .animateWith(animators)
                .start();
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
