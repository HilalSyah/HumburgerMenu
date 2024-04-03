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

public class premierleague extends Fragment {

    private RecyclerView recyclerView;
    private ListAdapte adapter;
    private List<TeamFootball> team;

    public premierleague() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_premierleague, container, false);

        recyclerView = view.findViewById(R.id.recyclerview1);
        team = new ArrayList<>();

        team.add(new TeamFootball("LIVERPOOL", R.drawable.inggris3, "Peringkat : 1"));
        team.add(new TeamFootball("ARSENAL", R.drawable.inggris4, "Peringkat : 2"));
        team.add(new TeamFootball("MANCHESTER CITY", R.drawable.inggris2, "Peringkat : 3"));
        team.add(new TeamFootball("ASTON VILLA", R.drawable.inggris7, "Peringkat : 4"));
        team.add(new TeamFootball("TOTTENHAM HOTSPUR", R.drawable.inggris5, "Peringkat : 5"));
        team.add(new TeamFootball("MANCHESTER UNITED", R.drawable.inggris1, "Peringkat : 6"));
        team.add(new TeamFootball("WEST HAM UNITED", R.drawable.inggris8, "Peringkat : 7"));
        team.add(new TeamFootball("NEWCASTLE UNITED", R.drawable.inggris9, "Absen: 8"));
        team.add(new TeamFootball("BRIGHTON", R.drawable.inggris10, "Absen: 9"));
        team.add(new TeamFootball("WOLVES", R.drawable.inggris11, "Absen: 10"));

        adapter = new ListAdapte(getContext(), team);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(adapter);

        return view;
    }
}