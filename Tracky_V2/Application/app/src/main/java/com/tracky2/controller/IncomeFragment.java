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

public class IncomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_income, container, false);

        return root;
    }

    //TODO ezeket a metódusokat beletenni a listenerekbe

    /* Bevétel hozzáadása
    if( BEVÉTELMENNYISÉGMEZŐJE.getText().length() == 0){
        Toast.makeText(getContext(), "Üres a bevétel mennyisége szövegmező!", Toast.LENGTH_SHORT).show();
    }
    else {
        try {
            int amount = Integer.parseInt(String.valueOf(BEVÉTELMENNYISÉGMEZŐJE.getText()));
            if( amount < 0){
                Toast.makeText(getContext(), amount + " kevesebb mint nulla", Toast.LENGTH_SHORT).show();
            }
            else {
                Manager.addIncome(amount, BEVÉTELLEÍRÁSMEZŐ.getText().toString());
                Toast.makeText(getContext(), amount + " Hozzáadva a bevételekhez.", Toast.LENGTH_SHORT).show();
                BEVÉTELMENNYISÉGEMEZŐ.setText("");
                BEVÉTELLEÍRÁSAMEZŐ.setText("");
            }
        } catch (java.lang.NumberFormatException e) {
            Toast.makeText(getContext(), BEVÉTELMENNYISÉGEMEZŐ.getText().toString() +" nem egy szám!", Toast.LENGTH_SHORT).show();
        }
    }
    */

    /*Bevétel szerkesztése kódrészlet
        Lekérni a bevétel objektumot az új értékekkel és
        Manager.editIncome(income);
        Toast.makeText(getContext(), "Sikeres szerkesztés!", Toast.LENGTH_SHORT).show();
     */

}