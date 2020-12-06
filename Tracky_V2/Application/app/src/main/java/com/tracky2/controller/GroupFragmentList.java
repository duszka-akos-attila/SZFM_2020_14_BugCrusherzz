package com.tracky2.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import com.tracky2.R;
import com.tracky2.data.Group;
import com.tracky2.data.manager.Manager;
import com.tracky2.adapters.groupTablaAdapter;

import java.util.ArrayList;
import java.util.List;

public class GroupFragmentList extends Fragment {

    RecyclerView MainTabla;
    groupTablaAdapter groupTablaAdapter;

    List<Group> groupList;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_grouplist, container, false);

        groupList = Manager.getGroups();
        //balanceList = Manager.lastBalanceModificaitons(20,"-","auto");
        MainTabla = root.findViewById(R.id.GroupTablaa);
        groupTablaAdapter = new groupTablaAdapter(groupList);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(MainTabla.getContext(), DividerItemDecoration.VERTICAL);
        MainTabla.addItemDecoration(dividerItemDecoration);


        MainTabla.setAdapter(groupTablaAdapter);

        return root;
    }

    //TODO Beilleszteni a kódrészleteket a listenerekbe
    /*Csoport törlése
        LEKÉRNI A CSOPORT OBJEKTUMOT és
        Manager.deleteGroup(group);
        Toast.makeText(getContext(), "Sikeres törlés!", Toast.LENGTH_SHORT).show();
     */

}