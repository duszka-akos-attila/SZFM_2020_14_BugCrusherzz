package com.tracky2.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.tracky2.R;
import com.tracky2.data.manager.Manager;

public class TemplateFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_template, container, false);



        return root;
    }

    //TODO ezeket a metódusokat beletenni a listenerekbe

    /*Sablon hozzáadása
    if( MENNYISÉGMEZŐJE.getText().length() == 0){
                Toast.makeText(getContext(), "Üres az összeg mennyisége!", Toast.LENGTH_SHORT).show();
    }
    else{
        if( BEVÉTEL){
                try {
                    int amount = Integer.parseInt(String.valueOf(MENNYISÉGMEZŐ.getText()));
                    if( amount < 0){
                        Toast.makeText(getContext(), amount + " kevesebb mint nulla", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Manager.addTemplate( true, amount, LEÍRÁSMEZŐ.getText().toString(), -1 );
                        Toast.makeText(getContext(), amount + " Hozzáadva a sablonokhoz", Toast.LENGTH_SHORT).show();
                        MENNYISÉGMEZŐ.setText("");
                        LEÍRÁSMEZŐ.setText("");
                    }
                }catch (java.lang.NumberFormatException e) {
                    Toast.makeText(getContext(), MENNYISÉGMEZŐ.getText().toString() +" nem egy szám!", Toast.LENGTH_SHORT).show();
                }
        }
        else{
            try{
                int amount = Integer.parseInt(String.valueOf(MENNYISÉGMEZŐ.getText()));
                int groupId = A CSOPORT IDJÁNAK A MEGSZERZÉSE
                    if( amount < 0){
                        Toast.makeText(getContext(), amount + " kevesebb mint nulla", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Manager.addTemplate( false, amount, LEÍRÁSMEZŐ.getText().toString(), groupId );
                        Toast.makeText(getContext(), amount + " Hozzáadva a sablonokhoz", Toast.LENGTH_SHORT).show();
                        MENNYISÉGMEZŐ.setText("");
                        LEÍRÁSMEZŐ.setText("");
                        A CSOPORT MEZŐJÉNEK ALAPHELYZETBE ÁLLÍTÁSA
                    }

            }catch (java.lang.NumberFormatException e) {
                Toast.makeText(getContext(), MENNYISÉGMEZŐ.getText().toString() +" nem egy szám!", Toast.LENGTH_SHORT).show();
            }
        }
    }
     */

    /*Sablon módosítása
        SABLON OBJEKTUM MEGSZERZÉSE
        Manager.editTemplate(template);
     */

    /*Sablon törlése
        SABLON OBJEKTUM MEGSZERZÉSE
        Manager.deleteTemplate(template);
     */
}