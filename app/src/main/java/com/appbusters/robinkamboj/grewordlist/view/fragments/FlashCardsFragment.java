package com.appbusters.robinkamboj.grewordlist.view.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appbusters.robinkamboj.grewordlist.R;
import com.appbusters.robinkamboj.grewordlist.controller.FlashCardsAdapter;
import com.appbusters.robinkamboj.grewordlist.model.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FlashCardsFragment extends Fragment {

    private RecyclerView recyclerView;
    private FlashCardsAdapter adapter;
    private List<String> data;

    public FlashCardsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_flash_cards, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerview);
        data = fillWithData();

        return v;
    }

    private List<String> fillWithData(){
        List<String> data = new ArrayList<>();

        data.add("Meaning 1 That Is Supposed To Be Very Looong.");
        data.add("Meaning 2 That Is Supposed To Be Very Looong.");
        data.add("Meaning 3 That Is Supposed To Be Very Looong.");
        data.add("Meaning 4 That Is Supposed To Be Very Looong.");
        data.add("Meaning 5 That Is Supposed To Be Very Looong.");
        data.add("Meaning 6 That Is Supposed To Be Very Looong.");
        data.add("Meaning 7 That Is Supposed To Be Very Looong.");
        data.add("Meaning 8 That Is Supposed To Be Very Looong.");
        data.add("Meaning 9 That Is Supposed To Be Very Looong.");
        data.add("Meaning 10 That Is Supposed To Be Very Looong.");

        return data;
    }
}
