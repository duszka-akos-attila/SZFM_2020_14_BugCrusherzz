package com.tracky.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.tracky.MainActivity;
import com.tracky.TestActivity;
import com.tracky.data.manager.Manager;
import com.tracky.R;

import org.w3c.dom.Text;

public class HomeFragment extends Fragment {
    TextView homeBalance;
    Button devMode;



    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        homeBalance = (TextView) root.findViewById(R.id.home_balance);
        homeBalance.setText(String.valueOf(Manager.getBalance()));
        devMode = (Button) root.findViewById(R.id.devMode);

        devMode.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.context, TestActivity.class);
                intent.addFlags(intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
            }
        });

        Text number;


        return root;

    }
}
