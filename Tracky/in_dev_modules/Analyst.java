package elemzo;

import adag.Expense;
import adag.Income;

import java.util.ArrayList;

public class Analyst {

//---------------------------------Balance----------------------------------
    public int getBalance(ArrayList<Income> incomes, ArrayList<Expense> expenses){
        int balance = 0;

        for (Income i : incomes){
            balance += i.getAmount();
        }

        for (Expense e : expenses){
            balance -= e.getAmount();
        }

        return balance;
    }


//-----------------------------INCOMES---------------------------------
    public ArrayList<Income> getIncomeByDay(ArrayList<Income> incomes, int day){
        ArrayList<Income> results = new ArrayList<>();

        for( Income i : incomes ){
            if( i.getDate().getDayOfMonth() == day ){
                results.add(i);
            }
        }
        return results;
    }

    public ArrayList<Income> getIncomeByMonth(ArrayList<Income> incomes, int month){
        ArrayList<Income> results = new ArrayList<>();

        for( Income i : incomes ){
            if( i.getDate().getMonthValue() == month ){
                results.add(i);
            }
        }
        return results;
    }

    public ArrayList<Income> getIncomeByMonthAndDay(ArrayList<Income> incomes, int month, int day){
        ArrayList<Income> results = new ArrayList<>();

        for( Income i : incomes ){
            if( i.getDate().getMonthValue() == month && i.getDate().getDayOfMonth() == day ){
                results.add(i);
            }
        }
        return results;
    }


//--------------------------------EXPENSES---------------------------------------
    public ArrayList<Expense> getExpenseByDay(ArrayList<Expense> expenses, int day){
        ArrayList<Expense> results = new ArrayList<>();

        for( Expense e : expenses ){
            if( e.getDate().getDayOfMonth() == day ){
                results.add(e);
            }
        }
        return results;
    }

    public ArrayList<Expense> getExpenseByMonth(ArrayList<Expense> expenses, int month){
        ArrayList<Expense> results = new ArrayList<>();

        for( Expense e : expenses ){
            if( e.getDate().getMonthValue() == month ){
                results.add(e);
            }
        }
        return results;
    }

    public ArrayList<Expense> getExpenseByMonthAndDay(ArrayList<Expense> expenses, int month, int day){
        ArrayList<Expense> results = new ArrayList<>();

        for( Expense e : expenses ){
            if( e.getDate().getMonthValue() == month && e.getDate().getDayOfMonth() == day ){
                results.add(e);
            }
        }
        return results;
    }

    public ArrayList<Expense> getExpenseByGroup(ArrayList<Expense> expenses, int groupId){
        ArrayList<Expense> results = new ArrayList<>();

        for( Expense e : expenses ){
            if( e.getGroupId() == groupId ){
                results.add(e);
            }
        }
        return results;
    }
}
