package com.appbusters.robinkamboj.grewordlist.controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.appbusters.robinkamboj.grewordlist.R;
import com.appbusters.robinkamboj.grewordlist.model.Data;
import com.appbusters.robinkamboj.grewordlist.model.View_Holder;

import java.util.Collections;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<View_Holder>{

    private List<Data> list = Collections.emptyList();
    private String word, meaning, example;
    private Context context;

    public RecyclerViewAdapter(List<Data> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new View_Holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(View_Holder holder, int position) {
        holder.word.setText(list.get(position).getWord());
        holder.meaning.setText(list.get(position).getWord());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
