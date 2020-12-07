package com.tracky2.controller;

import android.graphics.Canvas;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.tracky2.MainActivity;
import com.tracky2.R;
import com.tracky2.data.Expense;
import com.tracky2.data.Group;
import com.tracky2.data.manager.Manager;
import com.tracky2.adapters.groupTablaAdapter;

import java.util.ArrayList;
import java.util.List;

import it.xabaras.android.recyclerview.swipedecorator.RecyclerViewSwipeDecorator;

public class GroupFragmentList extends Fragment {

    RecyclerView MainTabla;
    groupTablaAdapter groupTablaAdapter;

    static List<Group> groupList;

    FloatingActionButton addGroup;

    static boolean editMode;

    static Group groupToEdit;

    static int elementPosition;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_grouplist, container, false);

        groupList = Manager.getGroups();
        //balanceList = Manager.lastBalanceModificaitons(20,"-","auto");
        MainTabla = root.findViewById(R.id.GroupTablaa);
        groupTablaAdapter = new groupTablaAdapter(groupList);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(MainTabla.getContext(), DividerItemDecoration.VERTICAL);
        MainTabla.addItemDecoration(dividerItemDecoration);



        MainTabla.setAdapter(groupTablaAdapter);

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleCallback);
        itemTouchHelper.attachToRecyclerView(MainTabla);

        addGroup = root.findViewById(R.id.fabGroup);

        addGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editMode = false;
                GroupFragment groupFragment = new GroupFragment();
                groupFragment.setTargetFragment(GroupFragmentList.this,1);
                groupFragment.show(getFragmentManager(), "GroupFragment");
            }
        });

        return root;
    }

    Group deletedGroup;

    ItemTouchHelper.SimpleCallback simpleCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
        @Override
        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
            return false;
        }

        @Override
        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {

            final int position = viewHolder.getAdapterPosition();

            switch (direction){
                case ItemTouchHelper.LEFT:
                    deletedGroup = groupList.get(position);
                    Manager.deleteGroup(groupList.get(position));
                    groupList.remove(position);
                    groupTablaAdapter.notifyItemRemoved(position);
                    Snackbar.make(MainTabla, "A "+deletedGroup.getName()+" leírású elem törölve lett.",Snackbar.LENGTH_LONG)
                            .setAction("Visszavonás", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    groupList.add(position, deletedGroup);
                                    groupTablaAdapter.notifyItemInserted(position);
                                    Manager.addGroup(deletedGroup.getName(),deletedGroup.getColor());
                                }
                            }).show();
                    break;

                case ItemTouchHelper.RIGHT:
                    groupToEdit = groupList.get(position);
                    editMode = true;
                    GroupFragment groupFragment = new GroupFragment();
                    groupFragment.setTargetFragment(GroupFragmentList.this,1);
                    groupFragment.show(getFragmentManager(), "GroupFragment");
                    elementPosition = position;
                    break;

            }

        }

        @Override
        public void onChildDraw(@NonNull Canvas c, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {

            new RecyclerViewSwipeDecorator.Builder(MainActivity.context, c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
                    .addSwipeLeftBackgroundColor(ContextCompat.getColor(MainActivity.context,R.color.red))
                    .addSwipeLeftActionIcon(R.drawable.ic_baseline_delete_24)
                    .addSwipeRightBackgroundColor(ContextCompat.getColor(MainActivity.context,R.color.blue))
                    .addSwipeRightActionIcon(R.drawable.ic_baseline_edit_24)
                    .create()
                    .decorate();

            super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
        }
    };
    //TODO Beilleszteni a kódrészleteket a listenerekbe
    /*Csoport törlése
        LEKÉRNI A CSOPORT OBJEKTUMOT és
        Manager.deleteGroup(group);
        Toast.makeText(getContext(), "Sikeres törlés!", Toast.LENGTH_SHORT).show();
     */

}