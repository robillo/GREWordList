package com.appbusters.robinkamboj.grewordlist.view.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appbusters.robinkamboj.grewordlist.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class YourBookmarksFragment extends Fragment {


    public YourBookmarksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_your_bookmarks, container, false);
    }

}
