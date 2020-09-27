package com.tracky.data.manager;

import android.util.Log;

import androidx.room.Room;

import com.tracky.data.Expense;
import com.tracky.data.Income;
import com.tracky.MainActivity;
import com.tracky.data.Group;
import com.tracky.data.Template;
import com.tracky.data.base.AppDatabase;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Manager{

    static AppDatabase db = Room.databaseBuilder(MainActivity.context , AppDatabase.class, "TrackyDB").allowMainThreadQueries().build();

    public static List<Income> dbIncomes = new ArrayList<Income>();
    public static List<Expense> dbExpenses = new ArrayList<Expense>();
    public static List<Template> dbTemplates = new ArrayList<Template>();
    public static List<Group> dbGroups = new ArrayList<Group>();

    public static void importDB(){
        dbIncomes = db.incomeDao().selectAllIncome();
        dbExpenses = db.expenseDao().selectAllExpense();
        dbTemplates = db.templateDao().selectAllTemplate();
        dbGroups = db.groupDao().selectAllGroup();
    }

    public static List<Income> getIncomes() {
        return dbIncomes;
    }

    public static List<Expense> getExpenses() {
        return dbExpenses;
    }

    public static List<Template> getTemplates() {
        return dbTemplates;
    }

    public static List<Group> getGroups() {
        return dbGroups;
    }


    //------------------------------------INCOMES----------------------------


    public static void addIncome(int amount, String description){
        int id = dbIncomes.size();
        dbIncomes.add(new Income(id, amount, description, Calendar.getInstance().getTime() ));
        db.incomeDao().insertIncome(new Income(id, amount, description, Calendar.getInstance().getTime()));
        for( Income i : dbIncomes){
            Log.i("adatb",i.toString());
        }
    }

    public static void deleteIncome(int id){
        db.incomeDao().deleteIncome(dbIncomes.get(id));
        dbIncomes.remove(id);


        for(int i = id; i < dbIncomes.size(); i++){
            dbIncomes.get(i).setId(dbIncomes.get(i).getId() - 1);
            db.incomeDao().updateIncome(dbIncomes.get(i));
        }
    }

    public static void editIncome( Income income, int amount, String description, Date date){
        income.setAmount(amount);
        income.setDescription(description);
        income.setDate(date);
        db.incomeDao().updateIncome(income);
    }

    //--------------------------------EXPENSE-------------------------------


    public static void addExpense(int amount, String description, int groupId){
        int id = dbExpenses.size();
        dbExpenses.add(new Expense(id, amount, description, groupId, Calendar.getInstance().getTime() ));
        db.expenseDao().insertExpense(new Expense(id, amount, description, groupId, Calendar.getInstance().getTime()));;
    }

    public static void deleteExpense(int id){
        db.expenseDao().deleteExpense(dbExpenses.get(id));
        dbExpenses.remove(id);

        for(int i = id; i < dbExpenses.size(); i++){
            dbExpenses.get(i).setId(dbExpenses.get(i).getId() - 1);
            db.expenseDao().updateExpense(dbExpenses.get(i));
        }
    }

    public static void editExpense( Expense expense, int amount, String description, Group group, Date date){
        expense.setAmount(amount);
        expense.setDescription(description);
        expense.setGroup(group);
        expense.setDate(date);
        db.expenseDao().updateExpense(expense);

    }

    //--------------------------------------GROUPS------------------------


    public static void addGroup(String name, int color){
        int id = dbGroups.size();
        dbGroups.add(new Group(id, name, color));
        db.groupDao().insertGroup(new Group(id, name, color));
    }

    public static void deleteGroup(int id){
        db.groupDao().deleteGroup(dbGroups.get(id));
        dbGroups.remove(id);


        for(int i = id; i < dbGroups.size(); i++){
            dbGroups.get(i).setId(dbGroups.get(i).getId() - 1);
            db.groupDao().updateGroup(dbGroups.get(i));
        }
    }

    public static void editGroup(Group group, String name, int color){

        group.setName(name);
        group.setColor(color);
        db.groupDao().updateGroup(group);
    }

    //--------------------------------------Templates------------------------


    public static void addTemplate(boolean isIncome, int amount, String description, int groupId){
        int id = dbTemplates.size();
        dbTemplates.add(new Template(isIncome, id, amount, description, groupId));
        db.templateDao().insertTemplate(new Template(isIncome, id, amount, description, groupId));
    }

    public static void deleteTemplate(int id){
        db.templateDao().deleteTemplate(dbTemplates.get(id));
        dbTemplates.remove(id);

        for(int i = id; i < dbTemplates.size(); i++){
            dbTemplates.get(i).setId(dbTemplates.get(i).getId() - 1);
            db.templateDao().updateTemplate(dbTemplates.get(i));
        }
    }

    public static void editTemplate(Template template, boolean isIncome, int amount, String description, Group group){
        template.setIncome(isIncome);
        template.setAmount(amount);
        template.setDescription(description);
        template.setGroup(group);
        db.templateDao().updateTemplate(template);
    }

    public static void convertTemplate(Template template){
        if( template.isIncome() ){
            addIncome(template.getAmount(), template.getDescription());
        }
        else{
            addExpense(template.getAmount(), template.getDescription(), template.getGroupId());
        }
    }

    public static int getBalance(){
        int balance = 0;

        for (Income i : dbIncomes){
            balance += i.getAmount();
        }

        for (Expense e : dbExpenses){
            balance -= e.getAmount();
        }

        return balance;
    }

    public static List<Income> getIncomeResults( int day, int month, int amount) {
        ArrayList<Income> results = new ArrayList<>();

        if( day == 0 && month == 0 && amount == 0){
            return dbIncomes;
        }
        else if( day != 0 && month != 0 && amount != 0){
            for( Income i : dbIncomes ){
                if( i.getDate().getMonth() == month && i.getDate().getDate() == day && i.getAmount() == amount ){
                    results.add(i);
                }
            }
            return results;
        }
        else if( day != 0 && month != 0 ){
            for( Income i : dbIncomes ){
                if( i.getDate().getMonth() == month && i.getDate().getDate() == day){
                    results.add(i);
                }
            }
            return results;
        }
        else if( day != 0 && amount != 0 ){
            for( Income i : dbIncomes ){
                if( i.getDate().getDate() == day && i.getAmount() == amount ){
                    results.add(i);
                }
            }
            return results;
        }
        else if( amount != 0 && month != 0 ){
            for( Income i : dbIncomes ){
                if( i.getDate().getMonth() == month && i.getAmount() == amount ){
                    results.add(i);
                }
            }
            return results;
        }

        else if( amount !=0 ){
            for( Income i : dbIncomes ){
                if( i.getAmount() == amount ){
                    results.add(i);
                }
            }
            return results;
        }

        else if( month !=0 ){
            for( Income i : dbIncomes ){
                if( i.getDate().getMonth() == month){
                    results.add(i);
                }
            }
            return results;
        }

        else if( day !=0 ){
            for( Income i : dbIncomes ){
                if( i.getDate().getDate() == day ){
                    results.add(i);
                }
            }
            return results;
        }

        return results;
    }

    public static List<Expense> getExpenseResults(int day, int month, int amount) {
        ArrayList<Expense> results = new ArrayList<>();

        if( day == 0 && month == 0 && amount == 0){
            return dbExpenses;
        }
        else if( day != 0 && month != 0 && amount != 0){
            for( Expense e : dbExpenses ){
                if( e.getDate().getMonth() == month && e.getDate().getDate() == day && e.getAmount() == amount ){
                    results.add(e);
                }
            }
            return results;
        }
        else if( day != 0 && month != 0 ){
            for( Expense e : dbExpenses ){
                if( e.getDate().getMonth() == month && e.getDate().getDate() == day){
                    results.add(e);
                }
            }
            return results;
        }
        else if( day != 0 && amount != 0 ){
            for( Expense e : dbExpenses ){
                if( e.getDate().getDate() == day && e.getAmount() == amount ){
                    results.add(e);
                }
            }
            return results;
        }
        else if( amount != 0 && month != 0 ){
            for( Expense e : dbExpenses ){
                if( e.getDate().getMonth() == month && e.getAmount() == amount ){
                    results.add(e);
                }
            }
            return results;
        }

        else if( amount !=0 ){
            for( Expense e : dbExpenses ){
                if( e.getAmount() == amount ){
                    results.add(e);
                }
            }
            return results;
        }

        else if( month !=0 ){
            for( Expense e : dbExpenses ){
                if( e.getDate().getMonth() == month){
                    results.add(e);
                }
            }
            return results;
        }

        else if( day !=0 ){
            for( Expense e : dbExpenses ){
                if( e.getDate().getDate() == day ){
                    results.add(e);
                }
            }
            return results;
        }

        return results;
    }


}