package com.tracky2.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.tracky2.MainActivity;
import com.tracky2.R;
import com.tracky2.TestActivity;
import com.tracky2.data.manager.Manager;
import com.tracky2.mainTablaAdapter;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    TextView homeBalance;

    RecyclerView MainTabla;
    mainTablaAdapter MainTablaAdapter;

    List<String> balanceList;

    Button devMode;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        //DEVMODE
        devMode=(Button) root.findViewById(R.id.devmodebutton);

        devMode.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.context, TestActivity.class);
                intent.addFlags(intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
            }
        });

        homeBalance = (TextView) root.findViewById(R.id.home_balance);
        //homeBalance.setText(String.valueOf(Manager.getBalance()));
        homeBalance.setText("745,912");


        balanceList = new ArrayList<>();
        MainTabla = root.findViewById(R.id.mainTabla2);
        MainTablaAdapter = new mainTablaAdapter(balanceList);
        //MainTabla.setLayoutManager(new LinearLayoutManager(context));

        MainTabla.setAdapter(MainTablaAdapter);

        balanceList.add("iron man");

        return root;

    }


}
