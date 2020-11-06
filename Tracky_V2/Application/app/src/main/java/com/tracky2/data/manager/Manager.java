package com.tracky2.data.manager;

import androidx.room.Room;

import com.tracky2.data.Expense;
import com.tracky2.data.Income;
import com.tracky2.MainActivity;
import com.tracky2.data.Group;
import com.tracky2.data.Template;
import com.tracky2.data.base.AppDatabase;
import java.util.Calendar;
import java.util.List;

public class Manager{

    static AppDatabase db = Room.databaseBuilder(MainActivity.context , AppDatabase.class, "TrackyDB").allowMainThreadQueries().build();


    //---------------------------LIST MANAGEMENT----------------------------

    public static List<Income> getIncomes() {
        return db.incomeDao().selectAllIncome();
    }

    public static List<Expense> getExpenses() {
        return db.expenseDao().selectAllExpense();
    }

    public static List<Template> getTemplates() {
        return db.templateDao().selectAllTemplate();
    }

    public static List<Group> getGroups() {
        return db.groupDao().selectAllGroup();
    }

    //------------------------------------INCOMES----------------------------


    public static void addIncome(int amount, String description){
        db.incomeDao().insertIncome(new Income( amount, description, Calendar.getInstance().getTime()));
        //Insert income into remote DB
    }

    public static void deleteIncome(Income income){
        db.incomeDao().deleteIncome(income);
        //Remove income from remote DB
    }

    public static void editIncome(Income income){
        db.incomeDao().updateIncome(income);
        //Edit income in remote DB
    }

    //--------------------------------EXPENSE-------------------------------


    public static void addExpense(int amount, String description, int groupId){
        db.expenseDao().insertExpense(new Expense(amount, description, groupId, Calendar.getInstance().getTime()));
        //Insert Expense into remote DB
    }

    public static void deleteExpense(Expense expense){
        db.expenseDao().deleteExpense(expense);
        //Delete expense from remote DB

    }

    public static void editExpense( Expense expense){
        db.expenseDao().updateExpense(expense);
        //Edit Expense in remote DB
    }

    //--------------------------------------GROUPS------------------------


    public static void addGroup(String name, int color){
        db.groupDao().insertGroup(new Group( name, color));
        //Insert Group into remote DB
    }

    public static void deleteGroup(Group group){
        db.groupDao().deleteGroup(group);
        //Delete Group from remote DB


    }

    public static void editGroup(Group group){
        db.groupDao().updateGroup(group);
        //Edit Group in remote DB
    }

}