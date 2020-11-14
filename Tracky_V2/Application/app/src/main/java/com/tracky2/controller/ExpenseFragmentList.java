package com.tracky2.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.tracky2.R;
import com.tracky2.data.manager.Manager;
import com.tracky2.mainTablaAdapter;

import java.util.ArrayList;
import java.util.List;

public class ExpenseFragmentList extends Fragment {

    RecyclerView MainTabla;
    mainTablaAdapter MainTablaAdapter;

    List<String> balanceList;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_expenselist, container, false);

        balanceList = new ArrayList<>();
        //balanceList = Manager.lastBalanceModificaitons(20,"-","auto");
        MainTabla = root.findViewById(R.id.mainTablaExp);
        MainTablaAdapter = new mainTablaAdapter(balanceList);

        MainTabla.setAdapter(MainTablaAdapter);
        return root;

    }

    //TODO Ezeket a függvényeket beilleszteni a listenerekbe

    /*Kiadás törlése kódrészlet
        Lekérni a kiadás objektumot és
        Manager.deleteExpense(expense);
        Toast.makeText(getContext(), "Sikeres törlés!", Toast.LENGTH_SHORT).show();
     */
}