package com.appbusters.robinkamboj.grewordlist.view.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appbusters.robinkamboj.grewordlist.R;
import com.appbusters.robinkamboj.grewordlist.controller.RecyclerViewAdapter;
import com.appbusters.robinkamboj.grewordlist.model.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class WMListFragment extends Fragment {

    private RecyclerView recyclerView;
    private String[] words, meanings;
    private LinearLayoutManager layoutManager;
    private RecyclerViewAdapter adapter;
    private int displayCode, startIndex, endIndex;

    public WMListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_wmlist, container, false);
        displayCode = getArguments().getInt("displayCode");
        assignIndex();

        words = getActivity().getResources().getStringArray(R.array.words);
        meanings = getActivity().getResources().getStringArray(R.array.meanings);
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerview);
        List<Data> data = fillWithData();
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(data, getActivity().getApplicationContext());
        recyclerView.setAdapter(adapter);

        return v;
    }

    private List<Data> fillWithData(){
        List<Data> data = new ArrayList<>();

        for(int i=0; i<=100; i++){
            data.add(new Data(words[i], meanings[i], "DUMMY EXAMPLE which is supposed to be long, very LOOOOOOOOONG.....!"));
        }

        return data;
    }

    private void assignIndex(){
        switch (displayCode){
            case 100:{
                startIndex = 0;
                endIndex = 199;
                break;
            }
        }
    }
}
