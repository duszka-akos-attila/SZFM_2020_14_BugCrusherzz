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
                    Toast.makeText(getContext(), "Textfield is empty! Try again!", Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        int amount = Integer.parseInt(String.valueOf(templateAmount.getText()));
                        if( amount < 0){
                            Toast.makeText(getContext(), amount + " is less than 0. Try again!", Toast.LENGTH_SHORT).show();
                        }
                        else {
                           // if( isIncome.isChecked()) {
                                Manager.addTemplate(isIncome.isChecked(), amount, templateDesc.getText().toString(), 0);
                                templateAmount.setText("");
                                templateDesc.setText("");
                                templateGroup.setText("");
                                isIncome.setChecked(false);
                                Toast.makeText(getContext(), "Added to templates.", Toast.LENGTH_SHORT).show();
                            //}
                            /*else{
                                Manager.addTemplate(isIncome.isChecked(), amount, templateDesc.getText().toString(), Integer.parseInt(String.valueOf(templateGroup.getText())));
                                templateAmount.setText("");
                                templateDesc.setText("");
                                templateGroup.setText("");
                                isIncome.setChecked(false);
                                Toast.makeText(getContext(), "Added to templates.", Toast.LENGTH_SHORT).show();
                            }*/
                        }
                    } catch (java.lang.NumberFormatException e) {
                        Toast.makeText(getContext(), "Amount is not a number! Try again", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        deleteTemplate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Manager.deleteAllTemplates();
            }
        });

        return root;
    }
}
