package com.tracky2.data.analysis;

import com.tracky2.data.Income;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class SearchAndFilter {

    // ------------------------- VARIABLES -------------------------

    // ------------------------- INCOME FILTERING -------------------------

    public ArrayList<Income> incomesBetweenAmounts(int min, int max){

    }

    public ArrayList<Income> incomesBetweenDates(Date min, Date max){

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

}