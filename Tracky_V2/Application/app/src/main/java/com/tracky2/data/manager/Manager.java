package com.tracky2.data.manager;

import androidx.room.Room;

import com.tracky2.data.Expense;
import com.tracky2.data.Income;
import com.tracky2.MainActivity;
import com.tracky2.data.Group;
import com.tracky2.data.Template;
import com.tracky2.data.base.AppDatabase;

import org.jetbrains.annotations.NotNull;

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

    //----------------------------  ORDERED LISTS -------------------------------

    public static List<Expense> getExpensesDescDate(){
        return db.expenseDao().selectAllExpenseOBDD();
    }

    public static List<Income> getIncomesDescDate() {
        return db.incomeDao().selectAllIncomeOBDD();
    }

    //------------------------------------INCOMES----------------------------


    public static void addIncome(int amount, String description){
        db.incomeDao().insertIncome(new Income( amount, description, Calendar.getInstance().getTime()));
        //TODO Insert income into remote DB
    }


    public static void addIncome(Income income) {
        db.incomeDao().insertIncome(income);
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

    public static void addExpense(Expense expense){
        db.expenseDao().insertExpense(expense);
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

    public static Group findGroupById(int id){
        for(Group group : getGroups()){
            if(group.getId()==id){
                return group;
            }
        }
        return null;
    }

    public static Group findGroupByName(String name){
        for(Group group : getGroups()){
            if(group.getName().equals(name)){
                return group;
            }
        }
        return null;
    }

    //--------------------------------------TEMPLATES------------------------

    public static void addTemplate(boolean isIncome, int amount, String desc, int groupId){
        db.templateDao().insertTemplate(new Template(isIncome, amount, desc, groupId));
        //TODO Insert Group into remote DB
    }

    public static void deleteTemplate(Template template){
        db.templateDao().deleteTemplate(template);
        //TODO Delete Group from remote DB
    }

    public static void editTemplate(Template template){
        db.templateDao().updateTemplate(template);
        //TODO Edit Group in remote DB
    }

    public static void convertTemplate(@NotNull Template template){
        if(template.isIncome()){
            addIncome(template.getAmount(), template.getDescription());
        }
        else{
            addExpense(template.getAmount(), template.getDescription(), template.getGroupId());
        }
    }



}