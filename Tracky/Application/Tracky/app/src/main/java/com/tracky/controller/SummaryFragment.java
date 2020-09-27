package com.tracky.controller;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.tracky.data.manager.Manager;
import com.tracky.R;
import com.tracky.data.DateConverter;
import com.tracky.data.Expense;
import com.tracky.data.Income;

import java.util.ArrayList;
import java.util.List;

public class SummaryFragment extends Fragment {

    EditText summaryDay;
    EditText summaryMonth;
    EditText summaryAmount;
    Button listIt;
    RadioButton income;
    RadioButton expense;
    RadioButton both;

    TableLayout stk;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_summary, container, false);

        summaryDay = (EditText) root.findViewById(R.id.summary_day);
        summaryMonth = (EditText) root.findViewById(R.id.summary_month);
        summaryAmount = (EditText) root.findViewById(R.id.summary_amount);
        income = (RadioButton) root.findViewById(R.id.summary_income);
        expense = (RadioButton) root.findViewById(R.id.summary_expense);
        income = (RadioButton) root.findViewById(R.id.summary_income);
        both = (RadioButton) root.findViewById(R.id.summary_both);
        listIt = (Button) root.findViewById(R.id.summary_list);


        stk = (TableLayout) root.findViewById(R.id.table_summary);
        TableRow tbrow0 = new TableRow(getContext());
       /* TextView tv0 = new TextView(getContext());
        tv0.setText(" Id ");
        tv0.setTextColor(Color.WHITE);
        tbrow0.addView(tv0);*/
        TextView tv1 = new TextView(getContext());
        tv1.setText(" Amount ");
        tv1.setTextColor(Color.WHITE);
        tbrow0.addView(tv1);
        TextView tv2 = new TextView(getContext());
        tv2.setText(" Description ");
        tv2.setTextColor(Color.WHITE);
        tbrow0.addView(tv2);
        TextView tv3 = new TextView(getContext());
        tv3.setText(" GroupId ");
        tv3.setTextColor(Color.WHITE);
        tbrow0.addView(tv3);
        TextView tv4 = new TextView(getContext());
        tv4.setText(" Date ");
        tv4.setTextColor(Color.WHITE);
        tbrow0.addView(tv4);
        stk.addView(tbrow0);

        if (Manager.getExpenses().size()>0) {

            for (int i = 0; i < Manager.getExpenses().size(); i++) {
                TableRow tbrow = new TableRow(getContext());
                /*TextView t0v = new TextView(getContext());
                t0v.setText(String.valueOf(Manager.getExpenses().get(i).getId()));
                t0v.setTextColor(Color.WHITE);
                t0v.setGravity(Gravity.CENTER);
                tbrow.addView(t0v);*/
                TextView t1v = new TextView(getContext());
                t1v.setText(String.valueOf(Manager.getExpenses().get(i).getAmount()));
                t1v.setTextColor(Color.WHITE);
                t1v.setGravity(Gravity.CENTER);
                tbrow.addView(t1v);
                TextView t2v = new TextView(getContext());
                t2v.setText(Manager.getExpenses().get(i).getDescription());
                t2v.setTextColor(Color.WHITE);
                t2v.setGravity(Gravity.CENTER);
                tbrow.addView(t2v);
                TextView t3v = new TextView(getContext());
                t3v.setText(String.valueOf(Manager.getExpenses().get(i).getGroupId()));
                t3v.setTextColor(Color.WHITE);
                t3v.setGravity(Gravity.CENTER);
                tbrow.addView(t3v);
                TextView t4v = new TextView(getContext());
                t4v.setText(DateConverter.formatDate(Manager.getExpenses().get(i).getDate()));
                t4v.setTextColor(Color.WHITE);
                t4v.setGravity(Gravity.CENTER);
                tbrow.addView(t4v);
                stk.addView(tbrow);
            }
        }


        if(Manager.getIncomes().size()>0) {
            for (int i = 0; i < Manager.getIncomes().size(); i++) {
                TableRow tbrow = new TableRow(getContext());
               /* TextView t0v = new TextView(getContext());
                t0v.setText(String.valueOf(Manager.getIncomes().get(i).getId()));
                t0v.setTextColor(Color.WHITE);
                t0v.setGravity(Gravity.CENTER);
                tbrow.addView(t0v);*/
                TextView t1v = new TextView(getContext());
                t1v.setText(String.valueOf(Manager.getIncomes().get(i).getAmount()));
                t1v.setTextColor(Color.WHITE);
                t1v.setGravity(Gravity.CENTER);
                tbrow.addView(t1v);
                TextView t2v = new TextView(getContext());
                t2v.setText(Manager.getIncomes().get(i).getDescription());
                t2v.setTextColor(Color.WHITE);
                t2v.setGravity(Gravity.CENTER);
                tbrow.addView(t2v);
                TextView t3v = new TextView(getContext());
                t3v.setText("-");
                t3v.setTextColor(Color.WHITE);
                t3v.setGravity(Gravity.CENTER);
                tbrow.addView(t3v);
                TextView t4v = new TextView(getContext());
                t4v.setText(DateConverter.formatDate(Manager.getIncomes().get(i).getDate()));
                t4v.setTextColor(Color.WHITE);
                t4v.setGravity(Gravity.CENTER);
                tbrow.addView(t4v);
                stk.addView(tbrow);
            }
        }

        listIt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(expense.isChecked() || income.isChecked() || both.isChecked() ){
                    if(expense.isChecked() ){

                        expeseSelected();
                    }
                    else if( income.isChecked()){
                        incomeSelected();
                    }
                    else{
                        bothSelected();
                    }
                }
                else{
                    Toast.makeText(getContext(), "Nem választottad ki, hogy mi legyen kilistázva!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return root;
    }

    private void bothSelected( ) {
        int amount;
        int month;
        int day;

        if(summaryDay.getText().length() == 0){
            day = 0;
        }
        else{
            day = Integer.parseInt(String.valueOf(summaryDay.getText()));
        }

        if(summaryMonth.getText().length() == 0){
            month = 0;
        }
        else{
            month = Integer.parseInt(String.valueOf(summaryMonth.getText())) -1;
        }

        if(summaryAmount.getText().length() == 0){
            amount = 0;
        }
        else{
            amount = Integer.parseInt(String.valueOf(summaryAmount.getText()));
        }

        List<Income> incomeResults = new ArrayList<Income>();
        incomeResults = Manager.getIncomeResults( day , month , amount );

        List<Expense> expenseResults = new ArrayList<Expense>();
        expenseResults = Manager.getExpenseResults(day, month, amount);

        stk.removeAllViews();

        stk = (TableLayout) getView().findViewById(R.id.table_summary);
        TableRow tbrow0 = new TableRow(getContext());
       /* TextView tv0 = new TextView(getContext());
        tv0.setText(" Id ");
        tv0.setTextColor(Color.WHITE);
        tbrow0.addView(tv0);*/
        TextView tv1 = new TextView(getContext());
        tv1.setText(" Amount ");
        tv1.setTextColor(Color.WHITE);
        tbrow0.addView(tv1);
        TextView tv2 = new TextView(getContext());
        tv2.setText(" Description ");
        tv2.setTextColor(Color.WHITE);
        tbrow0.addView(tv2);
        TextView tv3 = new TextView(getContext());
        tv3.setText(" GroupId ");
        tv3.setTextColor(Color.WHITE);
        tbrow0.addView(tv3);
        TextView tv4 = new TextView(getContext());
        tv4.setText(" Date ");
        tv4.setTextColor(Color.WHITE);
        tbrow0.addView(tv4);
        stk.addView(tbrow0);

        if (expenseResults.size()>0) {

            for (int i = 0; i < expenseResults.size(); i++) {
                TableRow tbrow = new TableRow(getContext());
               /* TextView t0v = new TextView(getContext());
                t0v.setText(String.valueOf(expenseResults.get(i).getId()));
                t0v.setTextColor(Color.WHITE);
                t0v.setGravity(Gravity.CENTER);
                tbrow.addView(t0v);*/
                TextView t1v = new TextView(getContext());
                t1v.setText(String.valueOf(expenseResults.get(i).getAmount()));
                t1v.setTextColor(Color.WHITE);
                t1v.setGravity(Gravity.CENTER);
                tbrow.addView(t1v);
                TextView t2v = new TextView(getContext());
                t2v.setText(expenseResults.get(i).getDescription());
                t2v.setTextColor(Color.WHITE);
                t2v.setGravity(Gravity.CENTER);
                tbrow.addView(t2v);
                TextView t3v = new TextView(getContext());
                t3v.setText(String.valueOf(expenseResults.get(i).getGroupId()));
                t3v.setTextColor(Color.WHITE);
                t3v.setGravity(Gravity.CENTER);
                tbrow.addView(t3v);
                TextView t4v = new TextView(getContext());
                t4v.setText(DateConverter.formatDate(expenseResults.get(i).getDate()));
                t4v.setTextColor(Color.WHITE);
                t4v.setGravity(Gravity.CENTER);
                tbrow.addView(t4v);
                stk.addView(tbrow);
            }
        }


        if(incomeResults.size()>0) {
            for (int i = 0; i < incomeResults.size(); i++) {
                TableRow tbrow = new TableRow(getContext());
               /* TextView t0v = new TextView(getContext());
                t0v.setText(String.valueOf(incomeResults.get(i).getId()));
                t0v.setTextColor(Color.WHITE);
                t0v.setGravity(Gravity.CENTER);
                tbrow.addView(t0v);*/
                TextView t1v = new TextView(getContext());
                t1v.setText(String.valueOf(incomeResults.get(i).getAmount()));
                t1v.setTextColor(Color.WHITE);
                t1v.setGravity(Gravity.CENTER);
                tbrow.addView(t1v);
                TextView t2v = new TextView(getContext());
                t2v.setText(incomeResults.get(i).getDescription());
                t2v.setTextColor(Color.WHITE);
                t2v.setGravity(Gravity.CENTER);
                tbrow.addView(t2v);
                TextView t3v = new TextView(getContext());
                t3v.setText("-");
                t3v.setTextColor(Color.WHITE);
                t3v.setGravity(Gravity.CENTER);
                tbrow.addView(t3v);
                TextView t4v = new TextView(getContext());
                t4v.setText(DateConverter.formatDate(incomeResults.get(i).getDate()));
                t4v.setTextColor(Color.WHITE);
                t4v.setGravity(Gravity.CENTER);
                tbrow.addView(t4v);
                stk.addView(tbrow);
            }
        }
    }

    private void incomeSelected() {
        List<Income> incomeResults = new ArrayList<Income>();
        int day;
        int month;
        int amount;

        if(summaryDay.getText().length() == 0){
            day = 0;
        }
        else{
            day = Integer.parseInt(String.valueOf(summaryDay.getText()));
        }

        if(summaryMonth.getText().length() == 0){
            month = 0;
        }
        else{
            month = Integer.parseInt(String.valueOf(summaryMonth.getText())) -1;
        }

        if(summaryAmount.getText().length() == 0){
            amount = 0;
        }
        else{
            amount = Integer.parseInt(String.valueOf(summaryAmount.getText()));
        }

        incomeResults = Manager.getIncomeResults( day , month , amount );

        stk.removeAllViews();

        stk = (TableLayout) getView().findViewById(R.id.table_summary);
        TableRow tbrow0 = new TableRow(getContext());
        /*TextView tv0 = new TextView(getContext());
        tv0.setText(" Id ");
        tv0.setTextColor(Color.WHITE);
        tbrow0.addView(tv0);*/
        TextView tv1 = new TextView(getContext());
        tv1.setText(" Amount ");
        tv1.setTextColor(Color.WHITE);
        tbrow0.addView(tv1);
        TextView tv2 = new TextView(getContext());
        tv2.setText(" Description ");
        tv2.setTextColor(Color.WHITE);
        tbrow0.addView(tv2);
        TextView tv3 = new TextView(getContext());
        tv3.setText(" Date ");
        tv3.setTextColor(Color.WHITE);
        tbrow0.addView(tv3);
        stk.addView(tbrow0);

        if(incomeResults.size()>0) {
            for (int i = 0; i < incomeResults.size(); i++) {
                TableRow tbrow = new TableRow(getContext());
                /*TextView t0v = new TextView(getContext());
                t0v.setText(String.valueOf(incomeResults.get(i).getId()));
                t0v.setTextColor(Color.WHITE);
                t0v.setGravity(Gravity.CENTER);
                tbrow.addView(t0v);*/
                TextView t1v = new TextView(getContext());
                t1v.setText(String.valueOf(incomeResults.get(i).getAmount()));
                t1v.setTextColor(Color.WHITE);
                t1v.setGravity(Gravity.CENTER);
                tbrow.addView(t1v);
                TextView t2v = new TextView(getContext());
                t2v.setText(incomeResults.get(i).getDescription());
                t2v.setTextColor(Color.WHITE);
                t2v.setGravity(Gravity.CENTER);
                tbrow.addView(t2v);
                TextView t3v = new TextView(getContext());
                t3v.setText(DateConverter.formatDate(incomeResults.get(i).getDate()));
                t3v.setTextColor(Color.WHITE);
                t3v.setGravity(Gravity.CENTER);
                tbrow.addView(t3v);
                stk.addView(tbrow);
            }
        }
    }

    private void expeseSelected() {
        List<Expense> expenseResults = new ArrayList<Expense>();

        int day;
        int month;
        int amount;

        if(summaryDay.getText().length() == 0){
            day = 0;
        }
        else{
            day = Integer.parseInt(String.valueOf(summaryDay.getText()));
        }

        if(summaryMonth.getText().length() == 0){
            month = 0;
        }
        else{
            month = Integer.parseInt(String.valueOf(summaryMonth.getText())) -1 ;
        }

        if(summaryAmount.getText().length() == 0){
            amount = 0;
        }
        else{
            amount = Integer.parseInt(String.valueOf(summaryAmount.getText()));
        }

        expenseResults = Manager.getExpenseResults(day, month, amount);
        stk.removeAllViews();

        stk = (TableLayout) getView().findViewById(R.id.table_summary);
        TableRow tbrow0 = new TableRow(getContext());
       /* TextView tv0 = new TextView(getContext());
        tv0.setText(" Id ");
        tv0.setTextColor(Color.WHITE);
        tbrow0.addView(tv0);*/
        TextView tv1 = new TextView(getContext());
        tv1.setText(" Amount ");
        tv1.setTextColor(Color.WHITE);
        tbrow0.addView(tv1);
        TextView tv2 = new TextView(getContext());
        tv2.setText(" Description ");
        tv2.setTextColor(Color.WHITE);
        tbrow0.addView(tv2);
        TextView tv3 = new TextView(getContext());
        tv3.setText(" GroupId ");
        tv3.setTextColor(Color.WHITE);
        tbrow0.addView(tv3);
        TextView tv4 = new TextView(getContext());
        tv4.setText(" Date ");
        tv4.setTextColor(Color.WHITE);
        tbrow0.addView(tv4);
        stk.addView(tbrow0);

        if (expenseResults.size()>0) {

            for (int i = 0; i < expenseResults.size(); i++) {
                TableRow tbrow = new TableRow(getContext());
               /* TextView t0v = new TextView(getContext());
                t0v.setText(String.valueOf(expenseResults.get(i).getId()));
                t0v.setTextColor(Color.WHITE);
                t0v.setGravity(Gravity.CENTER);
                tbrow.addView(t0v);*/
                TextView t1v = new TextView(getContext());
                t1v.setText(String.valueOf(expenseResults.get(i).getAmount()));
                t1v.setTextColor(Color.WHITE);
                t1v.setGravity(Gravity.CENTER);
                tbrow.addView(t1v);
                TextView t2v = new TextView(getContext());
                t2v.setText(expenseResults.get(i).getDescription());
                t2v.setTextColor(Color.WHITE);
                t2v.setGravity(Gravity.CENTER);
                tbrow.addView(t2v);
                TextView t3v = new TextView(getContext());
                t3v.setText(String.valueOf(expenseResults.get(i).getGroupId()));
                t3v.setTextColor(Color.WHITE);
                t3v.setGravity(Gravity.CENTER);
                tbrow.addView(t3v);
                TextView t4v = new TextView(getContext());
                t4v.setText(DateConverter.formatDate(expenseResults.get(i).getDate()));
                t4v.setTextColor(Color.WHITE);
                t4v.setGravity(Gravity.CENTER);
                tbrow.addView(t4v);
                stk.addView(tbrow);
            }
        }
    }


}
