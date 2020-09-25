package com.tracky.data.manager;

import androidx.room.Room;

import com.tracky.MainActivity;
import com.tracky.data.Template;
import com.tracky.data.Expense;
import com.tracky.data.Group;
import com.tracky.data.Income;
import com.tracky.data.base.AppDatabase;

import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

public abstract class Manager{

    AppDatabase db = Room.databaseBuilder(MainActivity.context,
            AppDatabase.class, "TrackyDB").build();

    ArrayList<Income> incomes= db.incomeDao().selectAllIncome();
    ArrayList<Expense> expenses= db.expenseDao().selectAllExpense();
    ArrayList<Template> templates= db.templateDao().selectAllTemplate();
    ArrayList<Group> groups= db.groupDao().selectAllGroup();


    //------------------------------------INCOMES----------------------------


    public void addIncome(int amount, String description){
        int id = incomes.size();
        incomes.add(new Income(id, amount, description, Calendar.getInstance().getTime() ));
        db.incomeDao().insertIncome(new Income(id, amount, description, Calendar.getInstance().getTime()));
    }

    public void deleteIncome(int id){
        int i = 0;

        for(; i< incomes.size(); i++){
            if( incomes.get(i).getId() == id){
                db.incomeDao().deleteIncome(incomes.get(i));
                incomes.remove(i);
                break;
            }
        }

        for(; i < incomes.size(); i++){
            incomes.get(i).setId(incomes.get(i).getId() - 1);
            db.incomeDao().updateIncome(incomes.get(i));
        }
    }

    public void editIncome(int id, int amount, String description, Date date){
        for (Income income : incomes) {
            if (income.getId() == id) {
                income.setAmount(amount);
                income.setDescription(description);
                income.setDate(date);
                db.incomeDao().updateIncome(income);
            }
        }
    }

    //--------------------------------EXPENSE-------------------------------


    public void addExpense(int amount, String description, int groupId){
        int id = expenses.size();
        expenses.add(new Expense(id, amount, description, groupId, Calendar.getInstance().getTime() ));
        db.expenseDao().insertExpense(new Expense(id, amount, description, groupId, Calendar.getInstance().getTime()));;
    }

    public void deleteExpense(int id){
        int i = 0;
        for(; i < expenses.size(); i++){
            if( expenses.get(i).getId() == id){
                db.expenseDao().deleteExpense(expenses.get(i));
                expenses.remove(i);
                break;
            }
        }

        for(; i < expenses.size(); i++){
            expenses.get(i).setId(expenses.get(i).getId() - 1);
            db.expenseDao().updateExpense(expenses.get(i));
        }
    }

    public void editExpense(int id, int amount, String description, Group group, Date date){
        for (Expense expense : expenses) {
            if (expense.getId() == id) {
                expense.setAmount(amount);
                expense.setDescription(description);
                expense.setGroup(group);
                expense.setDate(date);
                db.expenseDao().updateExpense(expense);
            }
        }
    }

    //--------------------------------------GROUPS------------------------


    public void addGroup(String name, int color){
        int id = groups.size();
        groups.add(new Group(id, name, color));
        db.groupDao().insertGroup(new Group(id, name, color));
    }

    public void deleteGroup(int id){
        int i = 0;

        for(; i< groups.size(); i++){
            if( groups.get(i).getId() == id){
                db.groupDao().deleteGroup(groups.get(i));
                groups.remove(i);
                break;
            }
        }


        for(; i < groups.size(); i++){
            groups.get(i).setId(groups.get(i).getId() - 1);
            db.groupDao().updateGroup(groups.get(i));
        }
    }

    public void editGroup(int id, String name, int color){
        for (Group group : groups) {
            if (group.getId() == id) {
                group.setName(name);
                group.setColor(color);
                db.groupDao().updateGroup(group);
            }
        }
    }

    //--------------------------------------Templates------------------------


    public void addTemplate(boolean isIncome, int amount, String description, int groupId){
        int id = templates.size();
        templates.add(new Template(isIncome, id, amount, description, groupId));
        db.templateDao().insertTemplate(new Template(isIncome, id, amount, description, groupId));
    }

    public void deleteTemplate(int id){
        int i = 0;

        for(; i< templates.size(); i++){
            if( templates.get(i).getId() == id){
                db.templateDao().deleteTemplate(templates.get(i));
                templates.remove(i);
                break;
            }
        }

        for(; i < templates.size(); i++){
            templates.get(i).setId(templates.get(i).getId() - 1);
            db.templateDao().updateTemplate(templates.get(i));
        }
    }

    public void editTemplate(int id, boolean isIncome, int amount, String description, Group group){
        for (Template template : templates) {
            if (template.getId() == id) {
                template.setIncome(isIncome);
                template.setAmount(amount);
                template.setGroup(group);
                template.setDescription(description);
                db.templateDao().updateTemplate(template);
            }
        }
    }
}