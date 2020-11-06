package com.tracky2.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.tracky2.R;
import com.tracky2.data.manager.Manager;

public class GroupFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_group, container, false);

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