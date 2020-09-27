package com.tracky.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.tracky.R;
import com.tracky.data.manager.Manager;
import com.tracky.mainTablaAdapter;

import java.util.ArrayList;
import java.util.List;

public class IncomeFragment2 extends Fragment {


    RecyclerView MainTabla;
    mainTablaAdapter MainTablaAdapter;

    List<String[]> balanceList;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_income2, container, false);

        balanceList = new ArrayList<>();
        balanceList = Manager.lastBalanceModificaitons(10,"-","auto");
        MainTabla = root.findViewById(R.id.mainTabla22);
        MainTablaAdapter = new mainTablaAdapter(balanceList);

        MainTabla.setAdapter(MainTablaAdapter);
        return root;

    }

}
