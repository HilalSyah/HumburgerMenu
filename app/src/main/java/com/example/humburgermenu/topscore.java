package com.example.humburgermenu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class topscore extends Fragment {

    private RecyclerView recyclerView;
    private ListAdapte adapter;
    private List<TeamFootball> pemaintop;

    public topscore() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_topscore, container, false);

        recyclerView = view.findViewById(R.id.recyclerview2);
        pemaintop = new ArrayList<>();

        pemaintop.add(new TeamFootball("Erling Haaland", R.drawable.pemain1, "Score : 18 Gol"));
        pemaintop.add(new TeamFootball("Mohamed Salah", R.drawable.pemain2, "Score : 16"));
        pemaintop.add(new TeamFootball("Dominic Solanke", R.drawable.pemain3, "Score : 16"));
        pemaintop.add(new TeamFootball("Ollie Watkins", R.drawable.pemain4, "Score : 16"));
        pemaintop.add(new TeamFootball("Jarrod Bowen", R.drawable.pemain5, "Score : 15"));
        pemaintop.add(new TeamFootball("Son Heung-Min", R.drawable.pemain6, "Score : 15"));
        pemaintop.add(new TeamFootball("Alexander Isak", R.drawable.pemain7, "Score : 14"));
        pemaintop.add(new TeamFootball("Cole Palmer", R.drawable.pemain8, "Score: 13"));
        pemaintop.add(new TeamFootball("Bukayo Saka", R.drawable.pemain9, "Score: 13"));
        pemaintop.add(new TeamFootball("Phil Folden", R.drawable.pemain10, "Score: 11"));

        adapter = new ListAdapte(getContext(), pemaintop);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(adapter);

        return view;

    }
}