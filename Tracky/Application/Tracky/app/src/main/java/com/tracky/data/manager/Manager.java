package com.tracky.data.manager;

import com.tracky.TemplateHandler.Template;
import com.tracky.data.Expense;
import com.tracky.data.Group;
import com.tracky.data.Income;

import java.util.Date;
import java.util.ArrayList;

public class Manager {

    ArrayList<Income> incomes=new ArrayList<>();
    ArrayList<Expense> expenses=new ArrayList<>();
    ArrayList<Template> templates=new ArrayList<>();
    ArrayList<Group> groups=new ArrayList<>();

    //------------------------------------INCOMES----------------------------
    public void addIncome(int amount){
        int id = incomes.size();
        incomes.add(new Income(id, amount, Calendar.getInstance().getTime() ));
    }

    public void deleteIncome(int id){
        int i = 0;

        for(; i< incomes.size(); i++){
            if( incomes.get(i).getId() == id){
                incomes.remove(i);
                break;
            }
        }

        for(; i < incomes.size(); i++){
            incomes.get(i).setId(incomes.get(i).getId() - 1);
        }
    }

    public void editIncome(int id, int amount, Date date){
        for (Income income : incomes) {
            if (income.getId() == id) {
                income.setAmount(amount);
                income.setDate(date);
            }
        }
    }

    //--------------------------------EXPANSE-------------------------------
    public void addExpense(int amount, int groupId){
        int id = expenses.size();
        expenses.add(new Expense(id, amount, groupId, Calendar.getInstance().getTime() ));
    }

    public void deleteExpense(int id){
        int i = 0;
        for(; i < expenses.size(); i++){
            if( expenses.get(i).getId() == id){
                expenses.remove(i);
                break;
            }
        }

        for(; i < expenses.size(); i++){
            expenses.get(i).setId(expenses.get(i).getId() - 1);
        }
    }

    public void editExpense(int id, int amount, Group group, Date date){
        for (Expense expense : expenses) {
            if (expense.getId() == id) {
                expense.setAmount(amount);
                expense.setGroup(group);
                expense.setDate(date);
            }
        }
    }

    //--------------------------------------GROUPS------------------------
    public void addGroup(String name){
        int id = groups.size();
        groups.add(new Group(id, name));
    }

    public void deleteGroup(int id){
        int i = 0;

        for(; i< groups.size(); i++){
            if( groups.get(i).getId() == id){
                groups.remove(i);
                break;
            }
        }


        for(; i < groups.size(); i++){
            groups.get(i).setId(groups.get(i).getId() - 1);
        }
    }

    public void editGroup(int id, String name){
        for (Group group : groups) {
            if (group.getId() == id) {
                group.setName(name);
            }
        }
    }

    //--------------------------------------SABLONOK------------------------
    public void addTemplate(boolean isIncome, int amount, int groupId){
        int id = templates.size();
        templates.add(new Template(isIncome, id, amount, groupId));
    }

    public void deleteTemplate(int id){
        int i = 0;

        for(; i< templates.size(); i++){
            if( templates.get(i).getId() == id){
                templates.remove(i);
                break;
            }
        }

        for(; i < templates.size(); i++){
            templates.get(i).setId(templates.get(i).getId() - 1);
        }
    }

    public void editTemplate(int id, boolean isIncome, int amount, Group group){
        for (Template template : templates) {
            if (template.getId() == id) {
                template.setIncome(isIncome);
                template.setAmount(amount);
                template.setGroup(group);
            }
        }
    }
}
