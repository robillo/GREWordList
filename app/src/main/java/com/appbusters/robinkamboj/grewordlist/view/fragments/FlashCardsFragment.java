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
import android.widget.TextView;
import android.widget.Toast;

import com.appbusters.robinkamboj.grewordlist.R;
import com.appbusters.robinkamboj.grewordlist.controller.FlashCardsAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class FlashCardsFragment extends Fragment {

    private RecyclerView recyclerView;
    private FlashCardsAdapter adapter;
    private List<String> data;
    private CharSequence[] items = {"Level 1 (4 hints)", "Level 2 (8 hints)", "Level 3 (12 hints)", "Level 4 (16 hints)", "Level 5 (20 hints)"};
    private String[] allWords, allMeanings, meaningsList;
    private String word;
    private TextView wordtv;
    private Random random;
    private int wordIndex, listSize = 4;

    public FlashCardsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_flash_cards, container, false);
        setHasOptionsMenu(true);

        wordtv = (TextView) v.findViewById(R.id.word);
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerview);

        generate();
        setRV();

        return v;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        inflater.inflate(R.menu.menu_flash, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.flash_filter:{
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Choose Level:")
                        .setItems(items, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                switch (which){
                                    case 0:{
                                        listSize = 4;
                                        setRV();
                                        break;
                                    }
                                    case 1:{
                                        listSize = 8;
                                        setRV();
                                        break;
                                    }
                                    case 2:{
                                        listSize = 12;
                                        setRV();
                                        break;
                                    }
                                    case 3:{
                                        listSize = 16;
                                        setRV();
                                        break;
                                    }
                                    case 4:{
                                        listSize = 20;
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

    private List<String> fillWithData(){
        List<String> data = new ArrayList<>();

        for(int i=0; i<listSize; i++){
            data.add("Meaning " + i + " That Is Supposed To Be Very Looong.");
        }

        return data;
    }

    private void setRV(){
        data = fillWithData();

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new FlashCardsAdapter(data, getActivity());
        recyclerView.setAdapter(adapter);
    }

    private void generate(){
        allWords = getResources().getStringArray(R.array.words);
        allMeanings = getResources().getStringArray(R.array.meanings);

        random = new Random();
        wordIndex = random.nextInt(800);

        wordtv.setText(allWords[wordIndex]);
    }
}
