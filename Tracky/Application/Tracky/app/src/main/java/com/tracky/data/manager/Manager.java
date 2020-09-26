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

    AppDatabase db = Room.databaseBuilder(MainActivity.context, AppDatabase.class, "TrackyDB").build();

    List<Income> dbIncomes= db.incomeDao().selectAllIncome();
    List<Expense> dbExpanses = db.expenseDao().selectAllExpense();
    List<Template> dbTemplates = db.templateDao().selectAllTemplate();
    List<Group> dbGroups = db.groupDao().selectAllGroup();

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

    ArrayList<Income> incomes= new ArrayList<>(getDbIncomes());
    ArrayList<Expense> expenses= new ArrayList<>(getDbExpanses());
    ArrayList<Template> templates= new ArrayList<>(getDbTemplates());
    ArrayList<Group> groups= new ArrayList<>(getDbGroups());


    //------------------------------------INCOMES----------------------------


    public void addIncome(int amount, String description){
        int id = incomes.size();
        incomes.add(new Income(id, amount, description, Calendar.getInstance().getTime() ));
        db.incomeDao().insertIncome(new Income(id, amount, description, Calendar.getInstance().getTime()));
    }

    public void deleteIncome(int id){

        db.incomeDao().deleteIncome(incomes.get(id));
        incomes.remove(id);


        for(int i = id; i < incomes.size(); i++){
            incomes.get(i).setId(incomes.get(i).getId() - 1);
            db.incomeDao().updateIncome(incomes.get(i));
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
        int id = expenses.size();
        expenses.add(new Expense(id, amount, description, groupId, Calendar.getInstance().getTime() ));
        db.expenseDao().insertExpense(new Expense(id, amount, description, groupId, Calendar.getInstance().getTime()));;
    }

    public void deleteExpense(int id){
        db.expenseDao().deleteExpense(expenses.get(id));
        expenses.remove(id);

        for(int i = id; i < expenses.size(); i++){
            expenses.get(i).setId(expenses.get(i).getId() - 1);
            db.expenseDao().updateExpense(expenses.get(i));
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
        int id = groups.size();
        groups.add(new Group(id, name, color));
        db.groupDao().insertGroup(new Group(id, name, color));
    }

    public void deleteGroup(int id){
        db.groupDao().deleteGroup(groups.get(id));
        groups.remove(id);


        for(int i = id; i < groups.size(); i++){
            groups.get(i).setId(groups.get(i).getId() - 1);
            db.groupDao().updateGroup(groups.get(i));
        }
    }

    public void editGroup(Group group, String name, int color){

        group.setName(name);
        group.setColor(color);
        db.groupDao().updateGroup(group);
    }

    //--------------------------------------Templates------------------------


    public void addTemplate(boolean isIncome, int amount, String description, int groupId){
        int id = templates.size();
        templates.add(new Template(isIncome, id, amount, description, groupId));
        db.templateDao().insertTemplate(new Template(isIncome, id, amount, description, groupId));
    }

    public void deleteTemplate(int id){
        db.templateDao().deleteTemplate(templates.get(id));
        templates.remove(id);

        for(int i = id; i < templates.size(); i++){
            templates.get(i).setId(templates.get(i).getId() - 1);
            db.templateDao().updateTemplate(templates.get(i));
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
}