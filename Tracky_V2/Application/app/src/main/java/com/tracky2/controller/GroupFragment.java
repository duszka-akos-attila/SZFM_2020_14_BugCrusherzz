package com.tracky2.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.tracky2.R;
import com.tracky2.data.manager.Manager;

public class GroupFragment extends DialogFragment {

        TextView title;
        TextView descriptionTextBox;
        TextView amountTextBox;
        TextView groupTextBox;
        TextView groupBackground;
        Button cancel;
        Button submit;

        public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View root = inflater.inflate(R.layout.fragment_group, container, false);

            title = root.findViewById(R.id.groupFragmentTitle);
            descriptionTextBox = root.findViewById(R.id.groupFragmentDescriptionTextBox);
            amountTextBox = root.findViewById(R.id.groupFragmentAmountTextBox);
            groupTextBox = root.findViewById(R.id.groupFragmentGroupTextBox);
            groupBackground = root.findViewById(R.id.groupFragmentGroupBackground);
            cancel = root.findViewById(R.id.groupFragmentCancel);
            submit = root.findViewById(R.id.groupFragmentSubmit);


            if(ExpenseFragmentList.editMode){
                title.setText("Kiadás szerkesztése");
                descriptionTextBox.setText(GroupFragmentList.groupToEdit.getName());
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

    //TODO Beilleszteni a kódrészleteket a listenerekbe

    /*új csoport
    if( CSOPORTNEVEMEZŐ.getText().length() == 0){
        Toast.makeText(getContext(), "Üres a csoport neve mező!", Toast.LENGTH_SHORT).show();
    }
    else {
        Manager.addGroup(CSOPORTNEVE.getText().toString(), CSOPORTSZÍNE);
        CSOPORTSZÍNEMEZŐ ALAPHELYZETBE ÁLLÍTÁSA
        Toast.makeText(getContext(), CSOPORTNEVEMEZŐ.getText().toString() + " hozzáadva a csoportokhoz!", Toast.LENGTH_SHORT).show();
        CSOPORTNEVEMEZŐ.setText("");
    }
     */

    /*Csoport szerkesztése
        LEKÉRNI A CSOPORT OBJEKTUMOT és
        Manager.editGroup(group);
        Toast.makeText(getContext(), "Sikeres szerkesztés!", Toast.LENGTH_SHORT).show();
     */


}