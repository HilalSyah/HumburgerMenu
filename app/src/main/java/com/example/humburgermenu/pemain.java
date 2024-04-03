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


public class pemain extends Fragment {

    private RecyclerView recyclerView;
    private ListAdapte adapter;
    private List<TeamFootball> pemain;

    public pemain() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pemain, container, false);

        recyclerView = view.findViewById(R.id.recyclerview3);
        pemain = new ArrayList<>();


        pemain.add(new TeamFootball("Mohamed Salah", R.drawable.pemain2, "Club : Liverpool"));
        pemain.add(new TeamFootball("Erling Haaland", R.drawable.pemain1, "Club : Manchester City"));
        pemain.add(new TeamFootball("Ollie Watkins", R.drawable.pemain4, "Club : Astin Villa"));
        pemain.add(new TeamFootball("Jarrod Bowen", R.drawable.pemain5, "Club : West Ham United"));
        pemain.add(new TeamFootball("Alexander Isak", R.drawable.pemain7, "Club : Newcastle United"));
        pemain.add(new TeamFootball("Son Heung-Min", R.drawable.pemain6, "Club : Tottenham Hotspur"));
        pemain.add(new TeamFootball("Cole Palmer", R.drawable.pemain8, "Club: Chelsea"));
        pemain.add(new TeamFootball("Dominic Solanke", R.drawable.pemain3, "Club : Bournemouth"));
        pemain.add(new TeamFootball("Phil Folden", R.drawable.pemain10, "Club: Manchester City"));
        pemain.add(new TeamFootball("Bukayo Saka", R.drawable.pemain9, "Club: Arsenal"));


        adapter = new ListAdapte(getContext(), pemain);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(adapter);

        return view;
    }
}