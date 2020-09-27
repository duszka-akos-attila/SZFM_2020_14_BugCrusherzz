package com.tracky.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.tracky.data.manager.Manager;
import com.tracky.R;

public class IncomeFragment extends Fragment {

    EditText incomeAmount;
    EditText incomeDesc;
    Button addincome;
    Button deleteIncome;
    EditText incomeId;


    public View onCreateView(@NonNull final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_income, container, false);
        addincome = (Button) root.findViewById(R.id.add_income);
        incomeAmount = (EditText) root.findViewById(R.id.income_amount);
        incomeDesc = (EditText) root.findViewById(R.id.income_desc);
        deleteIncome = (Button) root.findViewById(R.id.delete_income);
        incomeId = (EditText) root.findViewById(R.id.income_id);

        addincome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if( incomeAmount.getText().length() == 0){
                    Toast.makeText(getContext(), "Textfield is empty! Try again!", Toast.LENGTH_SHORT).show();
                }
                else {
                    try {
                        int amount = Integer.parseInt(String.valueOf(incomeAmount.getText()));
                        if( amount < 0){
                            Toast.makeText(getContext(), amount + " is less than 0. Try again!", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Manager.addIncome(amount, incomeDesc.getText().toString());
                            Toast.makeText(getContext(), amount + " Added to incomes.", Toast.LENGTH_SHORT).show();
                            incomeAmount.setText("");
                            incomeDesc.setText("");
                        }
                    } catch (java.lang.NumberFormatException e) {
                        Toast.makeText(getContext(), "Not a number! Try again", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        deleteIncome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(incomeId.getText().length() == 0){
                    Toast.makeText(getContext(), "Textfield is empty! Try again!", Toast.LENGTH_SHORT).show();
                }
                else{
                    int id = Integer.parseInt(String.valueOf(incomeId.getText()));
                    Manager.deleteIncome(id);
                    Toast.makeText(getContext(), "Income deleted!", Toast.LENGTH_SHORT).show();
                    incomeId.setText("");
                }
            }
        });

        return root;
    }


}