package adag;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Manager {

    ArrayList<Income> incomes=new ArrayList<>();
    ArrayList<Expense> expenses=new ArrayList<>();
    ArrayList<Template> templates=new ArrayList<>();
    ArrayList<Group> groups=new ArrayList<>();

    //------------------------------------BEVÉTELEK----------------------------
    public void addIncome(int amount){
        int id = incomes.size();
        incomes.add(new Income(id, amount, Calendar.getInstance().getTime() ));
        Log.i("Creation","Berakta");
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

    //--------------------------------KIADÁSOK-------------------------------
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

    public void editExpense(int id, int amount, int groupId, Date date){
        for (Expense expense : expenses) {
            if (expense.getId() == id) {
                expense.setAmount(amount);
                expense.setGroupId(groupId);
                expense.setDate(date);
            }
        }
    }

    //--------------------------------------CSOPORTOK------------------------
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

    public void editTemplate(int id, boolean isIncome, int amount, int groupId){
        for (Template template : templates) {
            if (template.getId() == id) {
                template.setIncome(isIncome);
                template.setAmount(amount);
                template.setGroupId(groupId);
            }
        }
    }
}

