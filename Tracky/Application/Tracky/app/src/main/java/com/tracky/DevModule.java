package com.tracky;

import com.tracky.data.Expense;
import com.tracky.data.Income;
import com.tracky.data.manager.Manager;

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

    private Manager manager;

    public void initManager(){
        manager = new Manager();
        manager.importDB();
    }
    /* INCOMES */

    public void createIncomes(int amount) {
        for(int i = 0; i< amount; i++) {
            manager.addIncome((int) (Math.random() * 14500) + 500, descriptions.get((int) (Math.random() * descriptions.size())));
        }
    }

    public void createGroups(){
        for (int i =0; i< groupNames.size(); i++) {
            manager.addGroup(groupNames.get(i),(int)(Math.random()*2147483647));
        }
    }

    public void createExpenses(int amount) {
        for(int i = 0; i< amount; i++) {
            manager.addExpense((int) (Math.random() * 14500) + 500,
                    descriptions.get((int) (Math.random() * descriptions.size())),
                    manager.getGroups().get((int)(Math.random()*manager.getGroups().size())).getId());
        }
    }

    public void deleteExpenses(int amount){
        if(manager.getExpenses().size()>amount){
            for(int i= manager.getExpenses().size()-1; i > manager.getExpenses().size()-amount-1;i--){
                manager.deleteExpense(manager.getExpenses().get(i).getId());
            }
        }
    }

    public void deleteIncomes(int amount){
        if(manager.getDbIncomes().size()>amount){
            for(int i= manager.getIncomes().size()-1; i > manager.getIncomes().size()-amount-1;i--){
                manager.deleteIncome(manager.getIncomes().get(i).getId());
            }
        }
    }

    public void deleteAll(){

        if(manager.getIncomes().size()!=0) {
            for (int i = 0; manager.getIncomes().size() != 0; ) {
                manager.deleteIncome(manager.getIncomes().get(i).getId());
            }
        }

        if(manager.getExpenses().size()!=0) {
            for (int i = 0; manager.getExpenses().size() != 0; ) {
                manager.deleteExpense(manager.getExpenses().get(i).getId());
            }
        }

        if(manager.getGroups().size()!=0) {
            for (int i = 0; manager.getGroups().size() != 0; ) {
                manager.deleteGroup(manager.getGroups().get(i).getId());
            }
        }

    }

    public List<Income> getIncomes(){
        return manager.getIncomes();
    }

    public List<Expense> getExpenses(){
        return manager.getExpenses();
    }


}
