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
import androidx.recyclerview.widget.DividerItemDecoration;
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

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL);
        dividerItemDecoration.setDrawable(getContext().getResources().getDrawable(R.drawable.dividerdec));
        MainTabla.addItemDecoration(dividerItemDecoration);

        balanceList.add("iron man");


        //ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleCallback);
        //itemTouchHelper.attachToRecyclerView(MainTabla);
        return root;

    }
    /*
    String[] deletedAdat = null;

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
                    deletedAdat = balanceList.get(position);
                    balanceList.remove(position);
                    MainTablaAdapter.notifyItemRemoved(position);
                    balanceList = Manager.lastBalanceModificaitons(5,"-","auto");
                            /*Snackbar.make(MainTabla, deletedAdat, Snackbar.LENGTH_LONG)
                                    .setAction("Undo", new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            //balanceList.add(position, deletedAdat);
                                            MainTablaAdapter.notifyItemRemoved(position);
                                        }
                                    }).show();   // ITt volt egy * /
                    break;

            }
        }
    };

*/

}
