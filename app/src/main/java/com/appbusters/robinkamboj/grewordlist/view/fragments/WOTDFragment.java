package com.appbusters.robinkamboj.grewordlist.view.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import com.appbusters.robinkamboj.grewordlist.R;

import java.util.Random;

/**
 * WORD OF THE DAY FRAGMENT
 */
public class WOTDFragment extends Fragment {

    private Random random;
    private int index;
    private String[] words, meanings;
    private String word, meaning;
    private TextView wordtv, meaningtv, exampletv;
    private SeekBar seekBar;

    public WOTDFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_wotd, container, false);

        wordtv = (TextView) v.findViewById(R.id.word);
        meaningtv = (TextView) v.findViewById(R.id.meaning);
        exampletv = (TextView) v.findViewById(R.id.example);
        seekBar = (SeekBar) v.findViewById(R.id.seekbar);

        random = new Random();
        index = random.nextInt(800);

        words = getResources().getStringArray(R.array.words);
        meanings = getResources().getStringArray(R.array.meanings);

        word = words[index];
        meaning = meanings[index];

        wordtv.setText(word);
        meaningtv.setText(meaning);
        exampletv.setText("Test Example");

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

}
