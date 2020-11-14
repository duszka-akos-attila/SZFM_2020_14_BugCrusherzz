package com.tracky2.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import com.tracky2.R;
import com.tracky2.data.manager.Manager;
import com.tracky2.incTablaAdapter;
import com.tracky2.mainTablaAdapter;

import java.util.ArrayList;
import java.util.List;

public class IncomeFragmentList extends Fragment {

    RecyclerView MainTabla;
    incTablaAdapter IncTablaAdapter;

    List<String> incbalanceList;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_incomelist, container, false);

        incbalanceList = new ArrayList<>();
        //balanceList = Manager.lastBalanceModificaitons(20,"-","auto");
        MainTabla = root.findViewById(R.id.mainTablaInc);
        IncTablaAdapter = new incTablaAdapter(incbalanceList);

/*
        FloatingActionButton fab = root.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new IncomeFragment();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.income_frag, fragment);
            }
        });*/


        MainTabla.setAdapter(IncTablaAdapter);

        return root;

    }

    //TODO kódrészlet beillesztése a listenerekbe

    /*Bevétel törlése kódrészlet
        Lekérni a bevétel objektumot és
        Manager.deleteIncome(income);
        Toast.makeText(getContext(), "Sikeres törlés!", Toast.LENGTH_SHORT).show();
     */
}