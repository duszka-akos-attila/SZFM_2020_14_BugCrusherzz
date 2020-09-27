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

public class GroupFragment extends Fragment {

    EditText groupName;
    EditText groupColor;
    Button addGroup;
    Button deleteGroup;
    EditText groupId;
    Button deleteAll;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_group, container, false);

        addGroup = (Button) root.findViewById(R.id.add_group);
        groupName = (EditText) root.findViewById(R.id.group_name);
        //groupColor= (EditText) root.findViewById(R.id.group_color);
        deleteGroup = (Button) root.findViewById(R.id.delete_group);
        groupId = (EditText) root.findViewById(R.id.group_id);
        deleteAll = (Button) root.findViewById(R.id.delete_allgroups);

        addGroup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if( groupName.getText().length() == 0){
                    Toast.makeText(getContext(), "Üres a csoport neve mező!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Manager.addGroup(groupName.getText().toString(), 0);
                    groupName.setText("");
                    groupColor.setText("");
                    Toast.makeText(getContext(), groupName.getText().toString() + " hozzáadva a csoportokhoz!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        deleteGroup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(groupId.getText().length() == 0){
                    Toast.makeText(getContext(), " Üres a csoport neve szövegmező!", Toast.LENGTH_SHORT).show();
                }
                else{

                    String name = groupName.getText().toString();
                    for( int i = 0; i < Manager.getGroups().size(); i++){
                        if(Manager.getGroups().get(i).getName().equals(name) ){
                            Manager.deleteGroup(Manager.getGroups().get(i).getId());
                            Toast.makeText(getContext(), groupId.getText().toString() + " nevű csoport törölve", Toast.LENGTH_SHORT).show();
                            groupId.setText("");
                        }
                    }

                }
            }
        });

        deleteAll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Manager.deleteAllGroups();
                Toast.makeText(getContext(), "Minden csoport törölve!", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
}