package com.appbusters.robinkamboj.grewordlist.view.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
    private CharSequence[] items = {"Letter A", "Letter B", "Letter C", "Letter D", "Letter E",
            "Letter F", "Letter G", "Letter H", "Letter I", "Letter J", "Letter K", "Letter L",
            "Letter M", "Letter N", "Letter O", "Letter P", "Letter Q", "Letter R", "Letter S",
            "Letter T", "Letter U", "Letter V", "Letter W", "Letter X", "Letter Y", "Letter Z" };

    public WMListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_wmlist, container, false);
        displayCode = getArguments().getInt("displayCode");
        assignIndex(displayCode);

        words = getActivity().getResources().getStringArray(R.array.words);
        meanings = getActivity().getResources().getStringArray(R.array.meanings);
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerview);

        setRV();

        return v;
    }

    private List<Data> fillWithData(){
        List<Data> data = new ArrayList<>();

        for(int i=startIndex; i<=endIndex; i++){
            data.add(new Data(words[i], meanings[i], "DUMMY EXAMPLE which is supposed to be long, very LOOOOOOOOONG.....!"));
        }

        return data;
    }

    private void assignIndex(int code){
        switch (code){
            case 100:{
                startIndex = 0;
                endIndex = 199;
                break;
            }
            case 101:{
                startIndex = 200;
                endIndex = 399;
                break;
            }
            case 102:{
                startIndex = 400;
                endIndex = 599;
                break;
            }
            case 103:{
                startIndex = 600;
                endIndex = 799;
                break;
            }
        }
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.main, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id){
            case R.id.action_sort:{
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

                break;
            }
        }

        return super.onOptionsItemSelected(item);
    }

    private void setRV(){
        assignIndex(displayCode);
        List<Data> data = fillWithData();
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(data, getActivity().getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}
