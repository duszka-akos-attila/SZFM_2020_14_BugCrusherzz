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
import com.tracky2.data.Expense;
import com.tracky2.data.manager.Manager;

public class ExpenseFragment extends DialogFragment {

    TextView title;
    TextView descriptionTextBox;
    TextView amountTextBox;
    TextView groupTextBox;
    TextView groupBackground;
    Button cancel;
    Button submit;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_expense, container, false);

        title = root.findViewById(R.id.expenseFragmentTitle);
        descriptionTextBox = root.findViewById(R.id.expenseFragmentDescriptionTextBox);
        amountTextBox = root.findViewById(R.id.expenseFragmentAmountTextBox);
        groupTextBox = root.findViewById(R.id.expenseFragmentGroupTextBox);
        groupBackground = root.findViewById(R.id.expenseFragmentGroupBackground);
        cancel = root.findViewById(R.id.expenseFragmentCancel);
        submit = root.findViewById(R.id.expenseFragmentSubmit);


        if(ExpenseFragmentList.editMode){
            title.setText("Kiadás szerkesztése");
            descriptionTextBox.setText(ExpenseFragmentList.expenseToEdit.getDescription());
            amountTextBox.setText(String.valueOf(ExpenseFragmentList.expenseToEdit.getAmount()));
            groupTextBox.setText(Manager.findGroupById(ExpenseFragmentList.expenseToEdit.getGroupId()).getName());
            groupBackground.setBackgroundColor(255*Manager.findGroupById(ExpenseFragmentList.expenseToEdit.getGroupId()).getColor());
            submit.setText("Módosítás");

        }
        else{
            title.setText("Kiadás hozzáadása");
            submit.setText("Hozzáadás");
        }

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ExpenseFragmentList.mainExpenseListRecycleAdapter.notifyItemChanged(ExpenseFragmentList.elementPosition);

                getDialog().dismiss();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ExpenseFragmentList.editMode){
                    ExpenseFragmentList.expenseToEdit.setDescription(descriptionTextBox.getText().toString());
                    ExpenseFragmentList.expenseToEdit.setAmount((int)Integer.parseInt(amountTextBox.getText().toString()));
                    ExpenseFragmentList.expenseToEdit.setGroup(Manager.findGroupByName(groupTextBox.getText().toString()));
                    Manager.editExpense(ExpenseFragmentList.expenseToEdit);
                    ExpenseFragmentList.mainExpenseListRecycleAdapter.notifyItemChanged(ExpenseFragmentList.elementPosition);
                }
                else{
                    int gId=0;
                    if(!groupTextBox.getText().toString().isEmpty() && groupTextBox.getText().toString()!=""){
                        gId = Manager.findGroupByName(groupTextBox.getText().toString()).getId();
                    }
                    Manager.addExpense((int)Integer.parseInt(amountTextBox.getText().toString()),descriptionTextBox.getText().toString(),gId);
                    ExpenseFragmentList.expenses.clear();
                    ExpenseFragmentList.expenses.addAll(Manager.getExpensesDescDate());
                    ExpenseFragmentList.mainExpenseListRecycleAdapter.notifyDataSetChanged();
                }


                getDialog().dismiss();
            }
        });

        groupTextBox.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if(!groupTextBox.getText().toString().isEmpty() && groupTextBox.getText().toString()!=""){
                        groupBackground.setBackgroundColor(255*Manager.findGroupByName(groupTextBox.getText().toString()).getColor());
                    }
                }
            }
        });


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