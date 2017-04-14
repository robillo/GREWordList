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
    private CharSequence[] items = {"Level 1 (4 hints)", "Level 2 (8 hints)", "Level 3 (12 hints)", "Level 4 (16 hints)", "Level 5 (20 hints)"};
    private String[] meaningsList;
    private String word;

    public FlashCardsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_flash_cards, container, false);
        setHasOptionsMenu(true);

        data = fillWithData();

        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new FlashCardsAdapter(data, getActivity());
        recyclerView.setAdapter(adapter);

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
                Toast.makeText(getActivity(), "Flash Menu Filter", Toast.LENGTH_SHORT).show();
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Choose Level:")
                        .setItems(items, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                switch (which){
                                    case 0:{

                                        break;
                                    }
                                    case 1:{

                                        break;
                                    }
                                    case 2:{

                                        break;
                                    }
                                    case 3:{

                                        break;
                                    }
                                    case 4:{

                                        break;
                                    }
                                }
                            }
                        });
                break;
            }
        }

        return super.onOptionsItemSelected(item);
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
