package com.tracky.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;
import com.tracky.MainActivity;
import com.tracky.R;
import com.tracky.TestActivity;
import com.tracky.data.manager.Manager;
import com.tracky.mainTablaAdapter;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    TextView homeBalance;
    Button devMode;

    RecyclerView MainTabla;
    mainTablaAdapter MainTablaAdapter;

    List<String[]> balanceList;


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

        balanceList = new ArrayList<>();
        balanceList = Manager.lastBalanceModificaitons(5,"-","auto");
        for(int i = 0; i < balanceList.size(); i++){
            Toast.makeText(getContext(),
                    balanceList.get(i)[0]+" "+ balanceList.get(i)[1]+" "+ balanceList.get(i)[2]+" "+
                            balanceList.get(i)[3]+" "+balanceList.get(i)[4]+" "+balanceList.get(i)[5]+" "+ i, Toast.LENGTH_SHORT).show();
        }
        Text number;
        MainTabla = root.findViewById(R.id.mainTabla2);
        MainTablaAdapter = new mainTablaAdapter(balanceList);
        //MainTabla.setLayoutManager(new LinearLayoutManager(context));

        MainTabla.setAdapter(MainTablaAdapter);



        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleCallback);
        itemTouchHelper.attachToRecyclerView(MainTabla);
        return root;

    }
    String deletedAdat = null;

    ItemTouchHelper.SimpleCallback simpleCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {
        @Override
        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
            return false;
        }

        @Override
        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {

            final int position = viewHolder.getAdapterPosition();

                    switch( direction) {
                        case ItemTouchHelper.LEFT:
                            //deletedAdat = balanceList.get(position);
                            //balanceList.remove(position);
                            MainTablaAdapter.notifyItemRemoved(position);
                            Snackbar.make(MainTabla, deletedAdat, Snackbar.LENGTH_LONG)
                                    .setAction("Undo", new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            //balanceList.add(position, deletedAdat);
                                            MainTablaAdapter.notifyItemRemoved(position);
                                        }
                                    }).show();
                            break;

                    }
        }
    };
}
