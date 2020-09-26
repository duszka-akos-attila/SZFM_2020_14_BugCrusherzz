package com.tracky.data.manager;

import androidx.room.Room;

import com.tracky.MainActivity;
import com.tracky.data.Expense;
import com.tracky.data.Group;
import com.tracky.data.Income;
import com.tracky.data.Template;
import com.tracky.data.base.AppDatabase;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Manager{

    AppDatabase db = Room.databaseBuilder(MainActivity.context, AppDatabase.class, "TrackyDB").allowMainThreadQueries().build();

    List<Income> dbIncomes= new ArrayList<Income>();
    List<Expense> dbExpanses = new ArrayList<Expense>();
    List<Template> dbTemplates = new ArrayList<Template>();
    List<Group> dbGroups = new ArrayList<Group>();


    public void importDB() {
        dbIncomes = db.incomeDao().selectAllIncome();
        dbExpanses = db.expenseDao().selectAllExpense();
        dbTemplates = db.templateDao().selectAllTemplate();
        dbGroups = db.groupDao().selectAllGroup();
    }

    public List<Income> getDbIncomes() {
        return dbIncomes;
    }

    public List<Expense> getDbExpanses() {
        return dbExpanses;
    }

    public List<Template> getDbTemplates() {
        return dbTemplates;
    }

    public List<Group> getDbGroups() {
        return dbGroups;
    }

    //------------------------------------INCOMES----------------------------


    public void addIncome(int amount, String description){
        int id = dbIncomes.size();
        dbIncomes.add(new Income(id, amount, description, Calendar.getInstance().getTime() ));
        db.incomeDao().insertIncome(new Income(id, amount, description, Calendar.getInstance().getTime()));
    }

    public void deleteIncome(int id){

        db.incomeDao().deleteIncome(dbIncomes.get(id));
        dbIncomes.remove(id);


        for(int i = id; i < dbIncomes.size(); i++){
            dbIncomes.get(i).setId(dbIncomes.get(i).getId() - 1);
            db.incomeDao().updateIncome(dbIncomes.get(i));
        }
    }

    public void editIncome( Income income, int amount, String description, Date date){
        income.setAmount(amount);
        income.setDescription(description);
        income.setDate(date);
        db.incomeDao().updateIncome(income);
    }

    //--------------------------------EXPENSE-------------------------------


    public void addExpense(int amount, String description, int groupId){
        int id = dbExpanses.size();
        dbExpanses.add(new Expense(id, amount, description, groupId, Calendar.getInstance().getTime() ));
        db.expenseDao().insertExpense(new Expense(id, amount, description, groupId, Calendar.getInstance().getTime()));;
    }

    public void deleteExpense(int id){
        db.expenseDao().deleteExpense(dbExpanses.get(id));
        dbExpanses.remove(id);

        for(int i = id; i < dbExpanses.size(); i++){
            dbExpanses.get(i).setId(dbExpanses.get(i).getId() - 1);
            db.expenseDao().updateExpense(dbExpanses.get(i));
        }
    }

    public void editExpense( Expense expense, int amount, String description, Group group, Date date){
        expense.setAmount(amount);
        expense.setDescription(description);
        expense.setGroup(group);
        expense.setDate(date);
        db.expenseDao().updateExpense(expense);

    }

    //--------------------------------------GROUPS------------------------


    public void addGroup(String name, int color){
        int id = dbGroups.size();
        dbGroups.add(new Group(id, name, color));
        db.groupDao().insertGroup(new Group(id, name, color));
    }

    public void deleteGroup(int id){
        db.groupDao().deleteGroup(dbGroups.get(id));
        dbGroups.remove(id);


        for(int i = id; i < dbGroups.size(); i++){
            dbGroups.get(i).setId(dbGroups.get(i).getId() - 1);
            db.groupDao().updateGroup(dbGroups.get(i));
        }
    }

    public void editGroup(Group group, String name, int color){

        group.setName(name);
        group.setColor(color);
        db.groupDao().updateGroup(group);
    }

    //--------------------------------------Templates------------------------


    public void addTemplate(boolean isIncome, int amount, String description, int groupId){
        int id = dbTemplates.size();
        dbTemplates.add(new Template(isIncome, id, amount, description, groupId));
        db.templateDao().insertTemplate(new Template(isIncome, id, amount, description, groupId));
    }

    public void deleteTemplate(int id){
        db.templateDao().deleteTemplate(dbTemplates.get(id));
        dbTemplates.remove(id);

        for(int i = id; i < dbTemplates.size(); i++){
            dbTemplates.get(i).setId(dbTemplates.get(i).getId() - 1);
            db.templateDao().updateTemplate(dbTemplates.get(i));
        }
    }

    public void editTemplate(Template template, boolean isIncome, int amount, String description, Group group){
        template.setIncome(isIncome);
        template.setAmount(amount);
        template.setDescription(description);
        template.setGroup(group);
        db.templateDao().updateTemplate(template);
    }

    public void convertTemplate(Template template){
        if( template.isIncome() ){
            addIncome(template.getAmount(), template.getDescription());
        }
        else{
            addExpense(template.getAmount(), template.getDescription(), template.getGroupId());
        }
    }

    public List<Income> getIncomes() {
        return dbIncomes;
    }

    public List<Expense> getExpenses() {
        return dbExpanses;
    }

    public List<Template> getTemplates() {
        return dbTemplates;
    }

    public List<Group> getGroups() {
        return dbGroups;
    }
}