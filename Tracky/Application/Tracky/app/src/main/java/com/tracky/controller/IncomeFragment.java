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

public class IncomeFragment extends Fragment {

    EditText incomeAmount;
    EditText incomeDesc;
    Button addincome;
    Button deleteIncome;
    EditText incomeId;
    Button deleteAll;


    public View onCreateView(@NonNull final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_income, container, false);
        addincome = (Button) root.findViewById(R.id.add_income);
        incomeAmount = (EditText) root.findViewById(R.id.income_amount);
        incomeDesc = (EditText) root.findViewById(R.id.income_desc);
        deleteIncome = (Button) root.findViewById(R.id.delete_income);
        incomeId = (EditText) root.findViewById(R.id.income_id);
        deleteAll = (Button) root.findViewById(R.id.delete_allincomes);

        addincome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if( incomeAmount.getText().length() == 0){
                    Toast.makeText(getContext(), "Üres a bevétel mennyisége szövegmező!", Toast.LENGTH_SHORT).show();
                }
                else {
                    try {
                        int amount = Integer.parseInt(String.valueOf(incomeAmount.getText()));
                        if( amount < 0){
                            Toast.makeText(getContext(), amount + " kevesebb mint nulla", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Manager.addIncome(amount, incomeDesc.getText().toString());
                            Toast.makeText(getContext(), amount + " Hozzáadva a bevételekhez.", Toast.LENGTH_SHORT).show();
                            incomeAmount.setText("");
                            incomeDesc.setText("");
                        }
                    } catch (java.lang.NumberFormatException e) {
                        Toast.makeText(getContext(), incomeAmount.getText().toString() +" nem egy szám!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        deleteIncome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(incomeId.getText().length() == 0){
                    Toast.makeText(getContext(), "Üres az összeg szövegmező!", Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        int osszeg = Integer.parseInt(String.valueOf(incomeId.getText()));
                        for( int i = 0; i < Manager.getIncomes().size(); i++){
                            if(Manager.getIncomes().get(i).getAmount() == osszeg ){
                                Manager.deleteIncome(Manager.getIncomes().get(i).getId());
                                Toast.makeText(getContext(), incomeId.getText().toString() + " összegű bevétel törölve", Toast.LENGTH_SHORT).show();
                                incomeId.setText("");
                            }
                        }

                    }
                    catch (java.lang.NumberFormatException e) {
                        Toast.makeText(getContext(), incomeId.getText().toString() +" nem egy szám!", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        deleteAll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Manager.deleteAllIncomes();
                Toast.makeText(getContext(), "Minden bevétel törölve!", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }


}