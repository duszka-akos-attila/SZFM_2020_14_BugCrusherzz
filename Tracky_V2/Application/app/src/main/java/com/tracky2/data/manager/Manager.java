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

    static AppDatabase db = Room.databaseBuilder(MainActivity.context , AppDatabase.class, "Tracky2DB").allowMainThreadQueries().build();


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
        //TODO Insert income into remote DB
    }

    public static void deleteIncome(Income income){
        db.incomeDao().deleteIncome(income);
        //TODO Remove income from remote DB
    }

    public static void editIncome(Income income){
        db.incomeDao().updateIncome(income);
        //TODO Edit income in remote DB
    }

    //--------------------------------EXPENSE-------------------------------


    public static void addExpense(int amount, String description, int groupId){
        db.expenseDao().insertExpense(new Expense(amount, description, groupId, Calendar.getInstance().getTime()));
        //TODO Insert Expense into remote DB
    }

    public static void deleteExpense(Expense expense){
        db.expenseDao().deleteExpense(expense);
        //TODO Delete expense from remote DB

    }

    public static void editExpense( Expense expense){
        db.expenseDao().updateExpense(expense);
        //TODO Edit Expense in remote DB
    }

    //--------------------------------------GROUPS------------------------


    public static void addGroup(String name, int color){
        db.groupDao().insertGroup(new Group( name, color));
        //TODO Insert Group into remote DB
    }

    public static void deleteGroup(Group group){
        db.groupDao().deleteGroup(group);
        //TODO Delete Group from remote DB
    }

    public static void editGroup(Group group){
        db.groupDao().updateGroup(group);
        //TODO Edit Group in remote DB
    }

    //--------------------------------------TEMPLATES------------------------

    public static void addTemplate(boolean isIncome, int amount, String desc, int groupId){
        db.templateDao().insertTemplate(new Template(isIncome, amount, desc, groupId));
    }

    public static void deleteTemplate(Template template){
        db.templateDao().deleteTemplate(template);
        //TODO Delete Group from remote DB
    }

    public static void editTemplate(Template template){
        db.templateDao().updateTemplate(template);
        //TODO Edit Group in remote DB
    }

}