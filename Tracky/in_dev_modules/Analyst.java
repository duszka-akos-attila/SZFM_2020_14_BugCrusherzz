import Expense;
import Income;

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
            if( i.getDate().getDate() == day ){
                results.add(i);
            }
        }
        return results;
    }

    public ArrayList<Income> getIncomeByMonth(ArrayList<Income> incomes, int month){
        ArrayList<Income> results = new ArrayList<>();

        for( Income i : incomes ){
            if( i.getDate().getMonth() == month ){
                results.add(i);
            }
        }
        return results;
    }

    public ArrayList<Income> getIncomeByMonthAndDay(ArrayList<Income> incomes, int month, int day){
        ArrayList<Income> results = new ArrayList<>();

        for( Income i : incomes ){
            if( i.getDate().getMonth() == month && i.getDate().getDate() == day ){
                results.add(i);
            }
        }
        return results;
    }


    //--------------------------------EXPENSES---------------------------------------
    public ArrayList<Expense> getExpenseByDay(ArrayList<Expense> expenses, int day){
        ArrayList<Expense> results = new ArrayList<>();

        for( Expense e : expenses ){
            if( e.getDate().getDate() == day ){
                results.add(e);
            }
        }
        return results;
    }

    public ArrayList<Expense> getExpenseByMonth(ArrayList<Expense> expenses, int month){
        ArrayList<Expense> results = new ArrayList<>();

        for( Expense e : expenses ){
            if( e.getDate().getMonth() == month ){
                results.add(e);
            }
        }
        return results;
    }

    public ArrayList<Expense> getExpenseByMonthAndDay(ArrayList<Expense> expenses, int month, int day){
        ArrayList<Expense> results = new ArrayList<>();

        for( Expense e : expenses ){
            if( e.getDate().getMonth() == month && e.getDate().getDate() == day ){
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
