package com.tracky2;

import com.tracky2.data.Expense;
import com.tracky2.data.Income;
import com.tracky2.data.manager.Manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DevModule {

    private final ArrayList<String> descriptions = new ArrayList<>(Arrays.asList(
            "apple","banana","cigarette","date","fuse","cinema","cheese","water","coke","chips",
            "McDonalds","fuel","Netflix","Spotify","college","vodka","beer","barber","jeans",
            "shoes","car service","cat food","phone","phone charger"));

    private final ArrayList<String> groupNames = new ArrayList<>(Arrays.asList(
            "food", "car maintenance", "pets", "clothing", "cigarette", "subscriptions",
            "booze", "entertainment"));

    /* INCOMES */

    public void createIncomes(int amount) {
        for(int i = 0; i< amount; i++) {
            Manager.addIncome((int) (Math.random() * 14500) + 500, descriptions.get((int) (Math.random() * descriptions.size())));
        }
    }

    public void createGroups(){
        for (int i =0; i< groupNames.size(); i++) {
            Manager.addGroup(groupNames.get(i),(int)(Math.random()*2147483647));
        }
    }

    public void createExpenses(int amount) {
        for(int i = 0; i< amount; i++) {
            Manager.addExpense((int) (Math.random() * 14500) + 500,
                    descriptions.get((int) (Math.random() * descriptions.size())),
                    Manager.getGroups().get((int)(Math.random()*Manager.getGroups().size())).getId());
        }
    }

    public void deleteExpenses(int amount){
        if(Manager.getExpenses().size()>amount){
            for(int i= Manager.getExpenses().size()-1; i > Manager.getExpenses().size()-amount-1;i--){
                Manager.deleteExpense(Manager.getExpenses().get(i));
            }
        }
    }

    public void deleteIncomes(int amount){
        if(Manager.getIncomes().size()>amount){
            for(int i= Manager.getIncomes().size()-1; i > Manager.getIncomes().size()-amount-1;i--){
                Manager.deleteIncome(Manager.getIncomes().get(i));
            }
        }
    }

    public void deleteAll(){

        if(Manager.getIncomes().size()!=0) {
            for (int i = Manager.getIncomes().size()-1; i>=0 ;i--) {
                Manager.deleteIncome(Manager.getIncomes().get(i));
            }
        }

        if(Manager.getExpenses().size()!=0) {
            for (int i = Manager.getExpenses().size()-1; i>=0 ;i--) {
                Manager.deleteExpense(Manager.getExpenses().get(i));
            }
        }

        if(Manager.getGroups().size()!=0) {
            for (int i = Manager.getGroups().size()-1; i>=0 ;i--) {
                Manager.deleteGroup(Manager.getGroups().get(i));
            }
        }

    }


    public List<Income> getIncomes(){
        return Manager.getIncomes();
    }

    public List<Expense> getExpenses(){
        return Manager.getExpenses();
    }


}
