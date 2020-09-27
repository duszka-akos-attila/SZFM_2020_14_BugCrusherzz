package com.tracky.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.tracky.data.manager.Manager;
import com.tracky.R;

public class TemplateFragment extends Fragment {

    EditText templateAmount;
    EditText templateDesc;
    EditText templateGroup;
    Button addTemplate;
    CheckBox isIncome;
    Button deleteTemplate;
    EditText templateId;
    Button deleteAll;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_template, container, false);

        addTemplate = (Button) root.findViewById(R.id.add_template);
        templateAmount = (EditText) root.findViewById(R.id.template_amount);
        templateDesc = (EditText) root.findViewById(R.id.template_desc);
        templateGroup = (EditText) root.findViewById(R.id.template_group);
        isIncome = (CheckBox) root.findViewById(R.id.check_isincome);
        deleteTemplate = (Button) root.findViewById(R.id.delete_template);
        templateId = (EditText) root.findViewById(R.id.template_id);
        deleteAll = (Button) root.findViewById(R.id.delete_alltemplates);

        addTemplate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if( templateAmount.getText().length() == 0){
                    Toast.makeText(getContext(), " Összeg mező üres!", Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        int amount = Integer.parseInt(String.valueOf(templateAmount.getText()));
                        if( amount < 0){
                            Toast.makeText(getContext(), amount + " kevesebb mint nulla!", Toast.LENGTH_SHORT).show();
                        }
                        else {
                                Manager.addTemplate(isIncome.isChecked(), amount, templateDesc.getText().toString(), 0);
                                templateAmount.setText("");
                                templateDesc.setText("");
                                templateGroup.setText("");
                                isIncome.setChecked(false);
                                Toast.makeText(getContext(), " hozzáadva a sablonokhoz", Toast.LENGTH_SHORT).show();
                        }
                    } catch (java.lang.NumberFormatException e) {
                        Toast.makeText(getContext(), templateAmount.getText().toString() + " nem egy szám!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        deleteTemplate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(templateId.getText().length() == 0){
                    Toast.makeText(getContext(), " Üres az összeg szövegmező!", Toast.LENGTH_SHORT).show();
                }
                else{
                    try{
                        int amount = Integer.parseInt(String.valueOf(templateId.getText()));
                        for( int i = 0; i < Manager.getTemplates().size(); i++){
                            if(Manager.getTemplates().get(i).getAmount() == amount ){
                                Manager.deleteTemplate(Manager.getTemplates().get(i).getId());
                                Toast.makeText(getContext(), templateId.getText().toString() + " összegű sablon törölve", Toast.LENGTH_SHORT).show();
                                templateId.setText("");
                            }
                        }

                    }catch (java.lang.NumberFormatException e) {
                        Toast.makeText(getContext(), templateId.getText().toString() +" nem egy szám!", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        deleteAll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Manager.deleteAllTemplates();
                Toast.makeText(getContext(), "Minden sablon törölve!", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
}
