package com.tracky2.data.analysis;

import com.tracky2.data.Expense;
import com.tracky2.data.Income;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import static com.tracky2.data.manager.Manager.getExpenses;
import static com.tracky2.data.manager.Manager.getIncomes;

public class SearchAndFilter {

    // ------------------------- VARIABLES -------------------------

    // ------------------------- INCOME FILTERING -------------------------

    public ArrayList<Income> incomesBetweenAmounts(int min, int max){
        return null;
    }

    public ArrayList<Income> incomesBetweenDates(Date min, Date max){
        return null;
    }

    // ------------------------- INCOME SORTING -------------------------

    public ArrayList<Income> sortIncomes(ArrayList<Income> incomes, String by, String direction){
        if(by.equals("date")) {
            if(direction.equals("asc")) {
                Collections.sort(incomes, new Comparator<Income>() {
                    public int compare(Income i1, Income i2) {
                        return i1.getDate().compareTo(i2.getDate());
                    }
                });
            }
            if(direction.equals("desc")) {
                Collections.sort(incomes, new Comparator<Income>() {
                    public int compare(Income i1, Income i2) {
                        return i2.getDate().compareTo(i1.getDate());
                    }
                });
            }

        }

        if(by.equals("amount")) {
            if(direction.equals("asc")) {
                Collections.sort(incomes, new Comparator<Income>() {
                    public int compare(Income i1, Income i2) {
                        return Integer.compare(i1.getAmount(), i2.getAmount());

                    }
                });
            }
            if(direction.equals("desc")) {
                Collections.sort(incomes, new Comparator<Income>() {
                    public int compare(Income i1, Income i2) {
                        return Integer.compare(i2.getAmount(), i1.getAmount());
                    }
                });
            }

        }
        return incomes;
    }

    // ------------------------- EXPENSE SORTING -------------------------

    public ArrayList<Expense> sortExpenses(ArrayList<Expense> expenses, String by, String direction){
        if(by.equals("date")) {
            if(direction.equals("asc")) {
                Collections.sort(expenses, new Comparator<Expense>() {
                    public int compare(Expense e1, Expense e2) {
                        return e1.getDate().compareTo(e2.getDate());
                    }
                });
            }
            if(direction.equals("desc")) {
                Collections.sort(expenses, new Comparator<Expense>() {
                    public int compare(Expense e1, Expense e2) {
                        return e2.getDate().compareTo(e1.getDate());
                    }
                });
            }

        }

        if(by.equals("amount")) {
            if(direction.equals("asc")) {
                Collections.sort(expenses, new Comparator<Expense>() {
                    public int compare(Expense e1, Expense e2) {
                        return Integer.compare(e1.getAmount(), e2.getAmount());

                    }
                });
            }
            if(direction.equals("desc")) {
                Collections.sort(expenses, new Comparator<Expense>() {
                    public int compare(Expense e1, Expense e2) {
                        return Integer.compare(e2.getAmount(), e1.getAmount());
                    }
                });
            }

        }
        return expenses;
    }

    //------------------------LastModifications----------------------------

    public static List<String[]> lastBalanceModifications(int amount){
        List<String[]> result = new ArrayList<>();

        int incomeIndex = getIncomes().size()-1;
        int expenseIndex = getExpenses().size()-1;

        for (int i=0; i<amount; i++){

            if(incomeIndex > -1 && expenseIndex > -1) {

                if (getIncomes().get(incomeIndex).getDate().after(getExpenses().get(expenseIndex).getDate())) {
                    result.add(getIncomes().get(incomeIndex).toStringArray());
                    incomeIndex--;
                }

                else {
                    result.add(getExpenses().get(expenseIndex).toStringArray());
                    expenseIndex--;
                }
            }

            else if(incomeIndex > -1){
                result.add(getIncomes().get(incomeIndex).toStringArray());
                incomeIndex--;
            }

            else if(expenseIndex > -1){
                result.add(getExpenses().get(expenseIndex).toStringArray());
                expenseIndex--;
            }

            else {
                break;
            }
        }
        return result;
    }

}
