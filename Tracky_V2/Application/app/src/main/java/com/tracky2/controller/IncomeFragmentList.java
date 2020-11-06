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

public class IncomeFragmentList extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_incomelist, container, false);

        return root;
    }

    //TODO kódrészlet beillesztése a listenerekbe

    /*Bevétel törlése kódrészlet
        Lekérni a bevétel objektumot és
        Manager.deleteIncome(income);
        Toast.makeText(getContext(), "Sikeres törlés!", Toast.LENGTH_SHORT).show();
     */
}