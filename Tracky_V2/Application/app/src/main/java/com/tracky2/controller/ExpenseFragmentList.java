package com.tracky2.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import com.tracky2.R;
import com.tracky2.expTablaAdapter;

import java.util.ArrayList;
import java.util.List;

public class ExpenseFragmentList extends Fragment {

    RecyclerView MainTabla;
    expTablaAdapter expTablaAdapter;

    List<String> ExpbalanceList;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_expenselist, container, false);

        ExpbalanceList = new ArrayList<>();
        //balanceList = Manager.lastBalanceModificaitons(20,"-","auto");
        MainTabla = root.findViewById(R.id.mainTablaExp);
        expTablaAdapter = new expTablaAdapter(ExpbalanceList);

        MainTabla.setAdapter(expTablaAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(MainTabla.getContext(), DividerItemDecoration.VERTICAL);
        MainTabla.addItemDecoration(dividerItemDecoration);
        return root;

    }

    //TODO Ezeket a függvényeket beilleszteni a listenerekbe

    /*Kiadás törlése kódrészlet
        Lekérni a kiadás objektumot és
        Manager.deleteExpense(expense);
        Toast.makeText(getContext(), "Sikeres törlés!", Toast.LENGTH_SHORT).show();
     */
}