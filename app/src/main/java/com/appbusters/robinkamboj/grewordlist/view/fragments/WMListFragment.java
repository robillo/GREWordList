package com.appbusters.robinkamboj.grewordlist.view.fragments;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

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
//        setHasOptionsMenu(true);

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
            case 0:{
                startIndex = 0;
                endIndex = 80;
                break;
            }
            case 1:{
                startIndex = 81;
                endIndex = 103;
                break;
            }
            case 2:{
                startIndex = 104;
                endIndex = 184;
                break;
            }
            case 3:{
                startIndex = 185;
                endIndex = 245;
                break;
            }
            case 4:{
                startIndex = 246;
                endIndex = 308;
                break;
            }
            case 5:{
                startIndex = 309;
                endIndex = 349;
                break;
            }
            case 6:{
                startIndex = 350;
                endIndex = 366;
                break;
            }
            case 7:{
                startIndex = 367;
                endIndex = 380;
                break;
            }
            case 8:{
                startIndex = 381;
                endIndex = 440;
                break;
            }
            case 9:{
                startIndex = 441;
                endIndex = 446;
                break;
            }
            case 10:{
                startIndex = 447;
                endIndex = 447;
                break;
            }
            case 11:{
                startIndex = 448;
                endIndex = 473;
                break;
            }
            case 12:{
                startIndex = 474;
                endIndex = 511;
                break;
            }
            case 13:{
                startIndex = 512;
                endIndex = 520;
                break;
            }
            case 14:{
                startIndex = 521;
                endIndex = 537;
                break;
            }
            case 15:{
                startIndex = 538;
                endIndex = 612;
                break;
            }
            case 16:{
                startIndex = 613;
                endIndex = 620;
                break;
            }
            case 17:{
                startIndex = 621;
                endIndex = 655;
                break;
            }
            case 18:{
                startIndex = 656;
                endIndex = 731;
                break;
            }
            case 19:{
                startIndex = 732;
                endIndex = 763;
                break;
            }
            case 20:{
                startIndex = 764;
                endIndex = 769;
                break;
            }
            case 21:{
                startIndex = 770;
                endIndex = 793;
                break;
            }
            case 22:{
                startIndex = 794;
                endIndex = 798;
                break;
            }
            case 23:{


                break;
            }
            case 24:{


                break;
            }
            case 25:{
                startIndex = 799;
                endIndex = 799;
                break;
            }
        }
    }

    private void setRV(){
        List<Data> data = fillWithData();
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(data, getActivity().getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}
