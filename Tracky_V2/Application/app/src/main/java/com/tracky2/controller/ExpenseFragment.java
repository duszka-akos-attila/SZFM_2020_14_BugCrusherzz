package com.tracky2.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.tracky2.R;
import com.tracky2.data.manager.Manager;

public class ExpenseFragment extends DialogFragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_expense, container, false);

        return root;
    }


    //TODO beilleszteni az alábbi kódokat a listenerekbe

    /*
    Új KIADÁS hozzáadásához kódrészlet

    if( KIADÁSMENNYISÉGMEZŐJE.getText().length() == 0){
        Toast.makeText(getContext(), "Üres a Mennyiség mező!", Toast.LENGTH_SHORT).show();
    }
    else if(|| KIADÁSCSOPORTMEZŐJE.getText().length() == 0){
        Toast.makeText(getContext(), "Üres a kiadás csoportja mező!", Toast.LENGTH_SHORT).show();
    }
    else {
        try {
            int amount = Integer.parseInt(String.valueOf(KIADÁSMENNYISÉGMEZŐJE.getText()));
            if( amount < 0){
                Toast.makeText(getContext(), amount + "A megadott érték kevesebb mint nulla!", Toast.LENGTH_SHORT).show();
            }
            else {
                Manager.addExpense(amount, KIADÁSLEÍRÁSMEZŐJE.getText().toString(), Integer.parseInt(String.valueOf(KIADÁSCSOPORTJAMEZŐ.getText())));
                Toast.makeText(getContext(), amount + " hozzáadva a kiadásokhoz!", Toast.LENGTH_SHORT).show();
                KIADÁSMENNYISÉGEMEZŐ.setText("");
                KIADÁSLEÍRÁSAMEZŐ.setText("");
                KIADÁSCSOPORTJAMEZŐ.setText("");
            }
        } catch (java.lang.NumberFormatException e) {
            Toast.makeText(getContext(), KIADÁSMENNYISÉGEMEZŐ.getText().toString() + " nem egy szám!", Toast.LENGTH_SHORT).show();
        }
    }
     */

    /*Kiadás szerkesztése kódrészlet
        Lekérni a kiadás objektumot az új értékekkel és
        Manager.editExpense(expense);
        Toast.makeText(getContext(), "Sikeres szerkesztés!", Toast.LENGTH_SHORT).show();
     */



}