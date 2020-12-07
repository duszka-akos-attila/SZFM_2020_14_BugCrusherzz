package com.tracky2.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import com.tracky2.MainActivity;
import com.tracky2.R;
import com.tracky2.data.Income;
import com.tracky2.data.manager.Manager;

public class IncomeFragment extends DialogFragment {

    TextView title;
    TextView descriptionTextBox;
    TextView amountTextBox;
    Button cancel;
    Button submit;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_income, container, false);

        title = root.findViewById(R.id.incomeFragmentTitle);
        descriptionTextBox = root.findViewById(R.id.incomeFragmentDescriptionTextBox);
        amountTextBox = root.findViewById(R.id.incomeFragmentAmountTextBox);
        cancel = root.findViewById(R.id.incomeFragmentCancel);
        submit = root.findViewById(R.id.incomeFragmentSubmit);


        if(IncomeFragmentList.editMode){
            title.setText("Bevétel szerkesztése");
            descriptionTextBox.setText(IncomeFragmentList.incomeToEdit.getDescription());
            amountTextBox.setText(String.valueOf(IncomeFragmentList.incomeToEdit.getAmount()));
            submit.setText("Módosítás");

        }
        else{
            title.setText("Bevétel hozzáadása");
            submit.setText("Hozzáadás");
        }

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IncomeFragmentList.mainIncomeListRecycleAdapter.notifyItemChanged(IncomeFragmentList.elementPosition);

                getDialog().dismiss();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(IncomeFragmentList.editMode){
                    IncomeFragmentList.incomeToEdit.setDescription(descriptionTextBox.getText().toString());
                    IncomeFragmentList.incomeToEdit.setAmount((int)Integer.parseInt(amountTextBox.getText().toString()));
                    Manager.editIncome(IncomeFragmentList.incomeToEdit);
                    IncomeFragmentList.mainIncomeListRecycleAdapter.notifyItemChanged(IncomeFragmentList.elementPosition);
                }
                else{
                    Manager.addIncome((int)Integer.parseInt(amountTextBox.getText().toString()),descriptionTextBox.getText().toString());
                    IncomeFragmentList.incomes.clear();
                    IncomeFragmentList.incomes.addAll(Manager.getIncomesDescDate());
                    IncomeFragmentList.mainIncomeListRecycleAdapter.notifyDataSetChanged();
                }


                getDialog().dismiss();
            }
        });

        /*groupTextBox.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if(!groupTextBox.getText().toString().isEmpty() && groupTextBox.getText().toString()!=""){
                        groupBackground.setBackgroundColor(255*Manager.findGroupByName(groupTextBox.getText().toString()).getColor());
                    }
                }
            }
        });*/


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
                Manager.addIncome(amount, KIADÁSLEÍRÁSMEZŐJE.getText().toString(), Integer.parseInt(String.valueOf(KIADÁSCSOPORTJAMEZŐ.getText())));
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
        Manager.editIncome(income);
        Toast.makeText(getContext(), "Sikeres szerkesztés!", Toast.LENGTH_SHORT).show();
     */



}