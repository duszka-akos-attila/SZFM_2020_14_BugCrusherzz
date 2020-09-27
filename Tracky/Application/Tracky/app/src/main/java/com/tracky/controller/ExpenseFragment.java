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
import com.tracky.data.manager.Manager;
import com.tracky.R;

public class ExpenseFragment extends Fragment {

    EditText expenseAmount;
    EditText expenseDesc;
    EditText expenseGroup;
    Button addexpense;
    Button deleteExpense;
    EditText expenseId;
    Button deleteAll;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_expense, container, false);

        addexpense = (Button) root.findViewById(R.id.add_expense);
        expenseAmount = (EditText) root.findViewById(R.id.expense_amount);
        expenseDesc = (EditText) root.findViewById(R.id.expense_desc);
        expenseGroup = (EditText) root.findViewById(R.id.expense_group);
        deleteExpense = (Button) root.findViewById(R.id.delete_expense);
        expenseId = (EditText) root.findViewById(R.id.expense_id);
        deleteAll = (Button) root.findViewById(R.id.delete_allexpenses);

        addexpense.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if( expenseAmount.getText().length() == 0){
                    Toast.makeText(getContext(), "Üres a kiadás összege szövegmező!", Toast.LENGTH_SHORT).show();
                }
                else {
                    try {
                        int amount = Integer.parseInt(String.valueOf(expenseAmount.getText()));
                        if( amount < 0){
                            Toast.makeText(getContext(), amount + " kevesebb mint nulla!", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Manager.addExpense(amount, expenseDesc.getText().toString(), Integer.parseInt(String.valueOf(expenseGroup.getText())));
                            Toast.makeText(getContext(), amount + " hozzáadva a kiadásokhoz!", Toast.LENGTH_SHORT).show();
                            expenseAmount.setText("");
                            expenseDesc.setText("");
                            expenseGroup.setText("");
                        }
                    } catch (java.lang.NumberFormatException e) {
                        Toast.makeText(getContext(), expenseAmount.getText().toString() + " nem egy szám!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        deleteExpense.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(expenseId.getText().length() == 0){
                    Toast.makeText(getContext(), "Üres az összeg szövegmező!", Toast.LENGTH_SHORT).show();
                }
                else{
                    try{
                        int osszeg = Integer.parseInt(String.valueOf(expenseId.getText()));
                        for( int i = 0; i < Manager.getExpenses().size(); i++){
                            if(Manager.getExpenses().get(i).getAmount() == osszeg ){
                                Manager.deleteExpense(Manager.getExpenses().get(i).getId());
                                Toast.makeText(getContext(), expenseId.getText().toString() + " összegű kiadás törölve", Toast.LENGTH_SHORT).show();
                                expenseId.setText("");
                            }
                        }

                    }catch (java.lang.NumberFormatException e) {
                        Toast.makeText(getContext(), expenseId.getText().toString() +" nem egy szám!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        deleteAll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Manager.deleteAllExpenses();
                Toast.makeText(getContext(), "Minden kiadás törölve!", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
}