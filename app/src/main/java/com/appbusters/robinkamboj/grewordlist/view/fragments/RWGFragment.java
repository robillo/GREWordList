package com.appbusters.robinkamboj.grewordlist.view.fragments;


import android.animation.Animator;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import com.appbusters.robinkamboj.grewordlist.R;
import com.willowtreeapps.spruce.Spruce;
import com.willowtreeapps.spruce.animation.DefaultAnimations;
import com.willowtreeapps.spruce.sort.LinearSort;

import java.util.Random;

//RANDOM WORD GENERATOR FRAGMENT

public class RWGFragment extends Fragment {

    private Random random;
    private int index;
    private String[] words, meanings;
    private String word, meaning;
    private TextView wordtv, meaningtv, exampletv;
    private SeekBar seekBar;
    private LinearLayout spruceLayout;

    public RWGFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_rwg, container, false);
        setHasOptionsMenu(true);
        wordtv = (TextView) v.findViewById(R.id.word);
        meaningtv = (TextView) v.findViewById(R.id.meaning);
        exampletv = (TextView) v.findViewById(R.id.example);
        seekBar = (SeekBar) v.findViewById(R.id.seekbar);
        spruceLayout = (LinearLayout) v.findViewById(R.id.spruceLayout);

        generate();

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int size, boolean b) {
                wordtv.setTextSize(size);
                meaningtv.setTextSize(size);
                exampletv.setTextSize(size);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        return v;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        inflater.inflate(R.menu.menu_rwg, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.refresh:{
                generate();
                break;
            }
        }

        return super.onOptionsItemSelected(item);
    }

    private void generate(){

        animateView(spruceLayout);

        random = new Random();
        index = random.nextInt(800);

        words = getResources().getStringArray(R.array.words);
        meanings = getResources().getStringArray(R.array.meanings);

        word = words[index];
        meaning = meanings[index];

        wordtv.setText(word);
        meaningtv.setText(meaning);
        exampletv.setText("Test Example");
    }

    private void animateView(LinearLayout linearLayout) {
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
}
