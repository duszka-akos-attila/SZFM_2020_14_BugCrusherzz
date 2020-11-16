package com.tracky2.data.analysis;

import com.tracky2.data.Expense;
import com.tracky2.data.Income;
import com.tracky2.data.manager.Manager;

public class Statistics {

    // ------------------------- VARIABLES -------------------------

    // ------------------------- BALANCE -------------------------

    public int getTotalBalance(){
        int balance = 0;

        if(Manager.getIncomes().size() > 0 || Manager.getExpenses().size() > 0){
            for(Income income : Manager.getIncomes()){
                balance += income.getAmount();
            }

            for(Expense expense : Manager.getExpenses()){
                balance -= expense.getAmount();
            }
        }

        return balance;
    }

}
