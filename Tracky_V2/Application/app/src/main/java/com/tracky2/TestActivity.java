package com.tracky2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.tracky2.data.DateConverter;

public class TestActivity extends AppCompatActivity {

    private DevModule dev = new DevModule();
    int amount = 0;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        dev.createGroups();
        init();
        editText = (EditText) findViewById(R.id.amountField);
    }

    public void updateAmount(){
        if(editText.getText().length()>0 && Integer.parseInt(String.valueOf(editText.getText()))>0){
            amount = Integer.parseInt(String.valueOf(editText.getText()));
        }
    }

    public void createExpansesPressed(View view){
        updateAmount();
        dev.createExpenses(amount);
        init();
    }

    public void createIncomesPressed(View view){
        updateAmount();
        dev.createIncomes(amount);
        init();
    }

    public void deleteExpensesPressed(View view){
        updateAmount();
        dev.deleteExpenses(amount);
        init();
    }

    public void deleteIncomesPressed(View view){
        updateAmount();
        dev.deleteIncomes(amount);
        init();
    }

    public void deleteAllPressed(View view){
        dev.deleteAll();
        init();
    }

    protected void init(){
        TableLayout stk = (TableLayout) findViewById(R.id.table_main);
        stk.removeAllViews();
        TableRow tbrow0 = new TableRow(this);
        TextView tv0 = new TextView(this);
        tv0.setText(" Id ");
        tv0.setTextColor(Color.WHITE);
        tbrow0.addView(tv0);
        TextView tv1 = new TextView(this);
        tv1.setText(" Amount ");
        tv1.setTextColor(Color.WHITE);
        tbrow0.addView(tv1);
        TextView tv2 = new TextView(this);
        tv2.setText(" Description ");
        tv2.setTextColor(Color.WHITE);
        tbrow0.addView(tv2);
        TextView tv3 = new TextView(this);
        tv3.setText(" GroupId ");
        tv3.setTextColor(Color.WHITE);
        tbrow0.addView(tv3);
        TextView tv4 = new TextView(this);
        tv4.setText(" Date ");
        tv4.setTextColor(Color.WHITE);
        tbrow0.addView(tv4);
        stk.addView(tbrow0);
        if (dev.getExpenses().size()>0) {
            for (int i = 0; i < dev.getExpenses().size(); i++) {
                TableRow tbrow = new TableRow(this);
                TextView t0v = new TextView(this);
                t0v.setText(String.valueOf(dev.getExpenses().get(i).getId()));
                t0v.setTextColor(Color.WHITE);
                t0v.setGravity(Gravity.CENTER);
                tbrow.addView(t0v);
                TextView t1v = new TextView(this);
                t1v.setText(String.valueOf(dev.getExpenses().get(i).getAmount()));
                t1v.setTextColor(Color.WHITE);
                t1v.setGravity(Gravity.CENTER);
                tbrow.addView(t1v);
                TextView t2v = new TextView(this);
                t2v.setText(dev.getExpenses().get(i).getDescription());
                t2v.setTextColor(Color.WHITE);
                t2v.setGravity(Gravity.CENTER);
                tbrow.addView(t2v);
                TextView t3v = new TextView(this);
                t3v.setText(String.valueOf(dev.getExpenses().get(i).getGroupId()));
                t3v.setTextColor(Color.WHITE);
                t3v.setGravity(Gravity.CENTER);
                tbrow.addView(t3v);
                TextView t4v = new TextView(this);
                t4v.setText(DateConverter.formatDate(dev.getExpenses().get(i).getDate()));
                t4v.setTextColor(Color.WHITE);
                t4v.setGravity(Gravity.CENTER);
                tbrow.addView(t4v);
                stk.addView(tbrow);
            }
        }
        if(dev.getIncomes().size()>0) {
            for (int i = 0; i < dev.getIncomes().size(); i++) {
                TableRow tbrow = new TableRow(this);
                TextView t0v = new TextView(this);
                t0v.setText(String.valueOf(dev.getIncomes().get(i).getId()));
                t0v.setTextColor(Color.WHITE);
                t0v.setGravity(Gravity.CENTER);
                tbrow.addView(t0v);
                TextView t1v = new TextView(this);
                t1v.setText(String.valueOf(dev.getIncomes().get(i).getAmount()));
                t1v.setTextColor(Color.WHITE);
                t1v.setGravity(Gravity.CENTER);
                tbrow.addView(t1v);
                TextView t2v = new TextView(this);
                t2v.setText(dev.getIncomes().get(i).getDescription());
                t2v.setTextColor(Color.WHITE);
                t2v.setGravity(Gravity.CENTER);
                tbrow.addView(t2v);
                TextView t3v = new TextView(this);
                t3v.setText("-");
                t3v.setTextColor(Color.WHITE);
                t3v.setGravity(Gravity.CENTER);
                tbrow.addView(t3v);
                TextView t4v = new TextView(this);
                t4v.setText(DateConverter.formatDate(dev.getIncomes().get(i).getDate()));
                t4v.setTextColor(Color.WHITE);
                t4v.setGravity(Gravity.CENTER);
                tbrow.addView(t4v);
                stk.addView(tbrow);
            }
        }

    }


}