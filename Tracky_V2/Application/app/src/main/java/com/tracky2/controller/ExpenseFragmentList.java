package com.tracky2.controller;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;
import com.tracky2.MainActivity;
import com.tracky2.R;
import com.tracky2.adapters.mainExpenseListRecycleAdapter;
import com.tracky2.data.Expense;
import com.tracky2.data.manager.Manager;
import com.tracky2.expTablaAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import it.xabaras.android.recyclerview.swipedecorator.RecyclerViewSwipeDecorator;

public class ExpenseFragmentList extends Fragment {

    RecyclerView MainTabla;
    expTablaAdapter expTablaAdapter;

    //New expense list
    RecyclerView mainExpenseListRecycleView;
    mainExpenseListRecycleAdapter mainExpenseListRecycleAdapter;

    List<String> ExpbalanceList;

    List<Expense> expenses;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_expenselist2, container, false);

        /*

        ExpbalanceList = new ArrayList<>();
        //balanceList = Manager.lastBalanceModificaitons(20,"-","auto");
        MainTabla = root.findViewById(R.id.mainTablaExp);
        expTablaAdapter = new expTablaAdapter(ExpbalanceList);

        MainTabla.setAdapter(expTablaAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(MainTabla.getContext(), DividerItemDecoration.VERTICAL);
        MainTabla.addItemDecoration(dividerItemDecoration);


         */


        //New expense list
        expenses = Manager.getExpensesDescDate();
        mainExpenseListRecycleView = root.findViewById(R.id.mainExpenseListRecycleView);
        mainExpenseListRecycleAdapter = new mainExpenseListRecycleAdapter(expenses);
        mainExpenseListRecycleView.setAdapter(mainExpenseListRecycleAdapter);
        DividerItemDecoration decoration = new DividerItemDecoration(mainExpenseListRecycleView.getContext(), DividerItemDecoration.VERTICAL);
        mainExpenseListRecycleView.addItemDecoration(decoration);

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleCallback);
        itemTouchHelper.attachToRecyclerView(mainExpenseListRecycleView);

        return root;

    }

    Expense deletedExpense;

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
                    deletedExpense = expenses.get(position);
                    Manager.deleteExpense(expenses.get(position));
                    expenses.remove(position);
                    mainExpenseListRecycleAdapter.notifyItemRemoved(position);
                    Snackbar.make(mainExpenseListRecycleView, "A "+deletedExpense.getDescription()+" leírású elem törölve lett.",Snackbar.LENGTH_LONG)
                            .setAction("Visszavonás", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    expenses.add(position, deletedExpense);
                                    mainExpenseListRecycleAdapter.notifyItemInserted(position);
                                    Manager.addExpense(deletedExpense);
                                }
                            }).show();
                    break;

                case ItemTouchHelper.RIGHT:

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

    //TODO Ezeket a függvényeket beilleszteni a listenerekbe

    /*Kiadás törlése kódrészlet
        Lekérni a kiadás objektumot és
        Manager.deleteExpense(expense);
        Toast.makeText(getContext(), "Sikeres törlés!", Toast.LENGTH_SHORT).show();
     */
}