package com.appbusters.robinkamboj.grewordlist.view.fragments;


import android.content.DialogInterface;
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
    private CharSequence[] items = {"Letter A", "Letter B", "Letter C", "Letter D", "Letter E",
            "Letter F", "Letter G", "Letter H", "Letter I", "Letter J", "Letter K", "Letter L",
            "Letter M", "Letter N", "Letter O", "Letter P", "Letter Q", "Letter R", "Letter S",
            "Letter T", "Letter U", "Letter V", "Letter W", "Letter X", "Letter Y", "Letter Z"};

    public WMListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_wmlist, container, false);
        setHasOptionsMenu(true);

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
                builder.setTitle("Choose Sorting Option:")
                        .setItems(items, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                switch (which){
                                    case 0:{
                                        assignIndex(0);
                                        setRV();
                                        break;
                                    }
                                    case 1:{
                                        assignIndex(1);
                                        setRV();
                                        break;
                                    }
                                    case 2:{
                                        assignIndex(2);
                                        setRV();
                                        break;
                                    }
                                    case 3:{
                                        assignIndex(3);
                                        setRV();
                                        break;
                                    }
                                    case 4:{
                                        assignIndex(4);
                                        setRV();
                                        break;
                                    }
                                    case 5:{
                                        assignIndex(5);
                                        setRV();
                                        break;
                                    }
                                    case 6:{
                                        assignIndex(6);
                                        setRV();
                                        break;
                                    }
                                    case 7:{
                                        assignIndex(7);
                                        setRV();
                                        break;
                                    }
                                    case 8:{
                                        assignIndex(8);
                                        setRV();
                                        break;
                                    }
                                    case 9:{
                                        assignIndex(9);
                                        setRV();
                                        break;
                                    }
                                    case 10:{
                                        assignIndex(10);
                                        setRV();
                                        break;
                                    }
                                    case 11:{
                                        assignIndex(11);
                                        setRV();
                                        break;
                                    }
                                    case 12:{
                                        assignIndex(12);
                                        setRV();
                                        break;
                                    }
                                    case 13:{
                                        assignIndex(13);
                                        setRV();
                                        break;
                                    }
                                    case 14:{
                                        assignIndex(14);
                                        setRV();
                                        break;
                                    }
                                    case 15:{
                                        assignIndex(15);
                                        setRV();
                                        break;
                                    }
                                    case 16:{
                                        assignIndex(16);
                                        setRV();
                                        break;
                                    }
                                    case 17:{
                                        assignIndex(17);
                                        setRV();
                                        break;
                                    }
                                    case 18:{
                                        assignIndex(18);
                                        setRV();
                                        break;
                                    }
                                    case 19:{
                                        assignIndex(19);
                                        setRV();
                                        break;
                                    }
                                    case 20:{
                                        assignIndex(20);
                                        setRV();
                                        break;
                                    }
                                    case 21:{
                                        assignIndex(21);
                                        setRV();
                                        break;
                                    }
                                    case 22:{
                                        assignIndex(22);
                                        setRV();
                                        break;
                                    }
                                    case 23:{
//                                        assignIndex(23);
//                                        setRV();
                                        Toast.makeText(getActivity(), "No Words for letter X.", Toast.LENGTH_SHORT).show();
                                        break;
                                    }
                                    case 24:{
//                                        assignIndex(24);
//                                        setRV();
                                        Toast.makeText(getActivity(), "No Words for letter X.", Toast.LENGTH_SHORT).show();
                                        break;
                                    }
                                    case 25:{
                                        assignIndex(25);
                                        setRV();
                                        break;
                                    }

                                }
                            }
                        }).show();
                break;
            }
        }

        return super.onOptionsItemSelected(item);
    }

    private void setRV(){
        List<Data> data = fillWithData();
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(data, getActivity().getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}
