package com.tracky2.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.tracky2.R;
import com.tracky2.data.manager.Manager;

public class ExpenseFragmentList extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_expenselist, container, false);

        return root;
    }

    //TODO Ezeket a függvényeket beilleszteni a listenerekbe

    /*Kiadás törlése kódrészlet
        Lekérni a kiadás objektumot és
        Manager.deleteExpense(expense);
        Toast.makeText(getContext(), "Sikeres törlés!", Toast.LENGTH_SHORT).show();
     */
}