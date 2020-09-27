package com.tracky.data.manager;

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

    private static int LAST_INCOME_ID;
    private static int LAST_EXPENSE_ID;
    private static int LAST_TEMPLATE_ID;
    private static int LAST_GROUP_ID;

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

        refactorAllIDs();

        LAST_INCOME_ID = maxIncomeID();
        LAST_EXPENSE_ID = maxExpenseID();
        LAST_TEMPLATE_ID = maxTemplateID();
        LAST_GROUP_ID = maxGroupID();
    }


    //---------------------------LIST MANAGEMENT----------------------------

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

    private static int maxIncomeID(){
        if(getIncomes().size()==0){
            return -1;
        }

        List<Income> incomes = getIncomes();
        int maxID = 0;
        for (Income income : incomes) {
            if(income.getId()>maxID){
                maxID = income.getId();
            }
        }
        return maxID;
    }

    private static int maxExpenseID(){
        if(getExpenses().size()==0){
            return -1;
        }

        List<Expense> expenses = getExpenses();
        int maxID = 0;
        for (Expense expense : expenses) {
            if(expense.getId()>maxID){
                maxID = expense.getId();
            }
        }
        return maxID;
    }

    private static int maxTemplateID(){
        if(getTemplates().size()==0){
            return -1;
        }

        List<Template> templates = getTemplates();
        int maxID = 0;
        for (Template template : templates) {
            if(template.getId()>maxID){
                maxID = template.getId();
            }
        }
        return maxID;
    }

    private static int maxGroupID(){
        if(getGroups().size()==0){
            return -1;
        }

        List<Group> groups = getGroups();
        int maxID = 0;
        for (Group group : groups) {
            if(group.getId()>maxID){
                maxID = group.getId();
            }
        }
        return maxID;
    }

    private static void refactorAllIDs(){

        List<Income> incomes = getIncomes();
        List<Expense> expenses = getExpenses();
        List<Group> groups = getGroups();
        List<Template> templates = getTemplates();

        int maxSize = incomes.size();

        if (expenses.size()> maxSize){
            maxSize = expenses.size();
        }

        if (groups.size()> maxSize){
            maxSize = groups.size();
        }

        if (templates.size()> maxSize){
            maxSize = templates.size();
        }

        for(int i =0; i<maxSize; i++){

            if(incomes.size()!=0 && i < incomes.size()){
                incomes.get(i).setId(i);
            }

            if(expenses.size()!=0 && i < expenses.size()){
                expenses.get(i).setId(i);
            }

            if(groups.size()!=0 && i < groups.size()){
                groups.get(i).setId(i);
            }

            if(templates.size()!=0 && i < templates.size()){
                templates.get(i).setId(i);
            }
        }
    }

    public static void deleteAll(){

        if(dbIncomes.size()!=0) {
            for (int i = dbIncomes.size()-1; i>=0 ;i--) {
                deleteIncome(dbIncomes.get(i).getId());
            }
        }

        if(dbExpenses.size()!=0) {
            for (int i = dbExpenses.size()-1; i>=0 ;i--) {
                deleteExpense(dbExpenses.get(i).getId());
            }
        }

        if(dbGroups.size()!=0) {
            for (int i = dbGroups.size()-1; i>=0 ;i--) {
                deleteGroup(dbGroups.get(i).getId());
            }
        }

        if(dbTemplates.size()!=0) {
            for (int i = dbTemplates.size()-1; i>=0 ;i--) {
                deleteTemplate(dbTemplates.get(i).getId());
            }
        }

    }

    public static void deleteAllIncomes(){
        if(dbIncomes.size()!=0) {
            for (int i = dbIncomes.size()-1; i>=0 ;i--) {
                deleteIncome(dbIncomes.get(i).getId());
            }
        }

    }

    public static void deleteAllExpenses(){
        if(dbExpenses.size()!=0) {
            for (int i = dbExpenses.size()-1; i>=0 ;i--) {
                deleteExpense(dbExpenses.get(i).getId());
            }
        }
    }

    public static void deleteAllGroups(){
        if(dbGroups.size()!=0) {
            for (int i = dbGroups.size()-1; i>=0 ;i--) {
                deleteGroup(dbGroups.get(i).getId());
            }
        }
    }

    public static void deleteAllTemplates(){
        if(dbTemplates.size()!=0) {
            for (int i = dbTemplates.size()-1; i>=0 ;i--) {
                deleteTemplate(dbTemplates.get(i).getId());
            }
        }

    }

    //------------------------------------INCOMES----------------------------


    public static void addIncome(int amount, String description){
        LAST_INCOME_ID++;
        int id = LAST_INCOME_ID;
        dbIncomes.add(new Income(id, amount, description, Calendar.getInstance().getTime() ));
        db.incomeDao().insertIncome(new Income(id, amount, description, Calendar.getInstance().getTime()));
    }

    public static void deleteIncome(int id){
        db.incomeDao().deleteIncome(dbIncomes.get(id));
        if(id>=dbIncomes.size()/2){
            for(int i = dbIncomes.size()-1;i>-1;i--){
                if(dbIncomes.get(i).getId()==id){
                    dbIncomes.remove(i);
                    break;
                }
            }
        }
        else{
            for (int i =0;i<dbIncomes.size();i++){
                if(dbIncomes.get(i).getId()==id){
                    dbIncomes.remove(i);
                    break;
                }
            }
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
        LAST_EXPENSE_ID++;
        int id = LAST_EXPENSE_ID;
        dbExpenses.add(new Expense(id, amount, description, groupId, Calendar.getInstance().getTime() ));
        db.expenseDao().insertExpense(new Expense(id, amount, description, groupId, Calendar.getInstance().getTime()));;
    }

    public static void deleteExpense(int id){
        db.expenseDao().deleteExpense(dbExpenses.get(id));
        if(id>=dbExpenses.size()/2){
            for(int i = dbExpenses.size()-1;i>-1;i--){
                if(dbExpenses.get(i).getId()==id){
                    dbExpenses.remove(i);
                    break;
                }
            }
        }
        else{
            for (int i =0;i<dbExpenses.size();i++){
                if(dbExpenses.get(i).getId()==id){
                    dbExpenses.remove(i);
                    break;
                }
            }
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
        LAST_GROUP_ID++;
        int id = LAST_GROUP_ID;
        dbGroups.add(new Group(id, name, color));
        db.groupDao().insertGroup(new Group(id, name, color));
    }

    public static void deleteGroup(int id){
        db.groupDao().deleteGroup(dbGroups.get(id));
        if(id>=dbGroups.size()/2){
            for(int i = dbGroups.size()-1;i>-1;i--){
                if(dbGroups.get(i).getId()==id){
                    dbGroups.remove(i);
                    break;
                }
            }
        }
        else{
            for (int i =0;i<dbGroups.size();i++){
                if(dbGroups.get(i).getId()==id){
                    dbGroups.remove(i);
                    break;
                }
            }
        }
    }

    public static void editGroup(Group group, String name, int color){

        group.setName(name);
        group.setColor(color);
        db.groupDao().updateGroup(group);
    }

    //--------------------------------------Templates------------------------


    public static void addTemplate(boolean isIncome, int amount, String description, int groupId){
        LAST_TEMPLATE_ID++;
        int id = LAST_TEMPLATE_ID;
        dbTemplates.add(new Template(isIncome, id, amount, description, groupId));
        db.templateDao().insertTemplate(new Template(isIncome, id, amount, description, groupId));
    }

    public static void deleteTemplate(int id){
        db.templateDao().deleteTemplate(dbTemplates.get(id));
        if(id>=dbTemplates.size()/2){
            for(int i = dbTemplates.size()-1;i>-1;i--){
                if(dbTemplates.get(i).getId()==id){
                    dbTemplates.remove(i);
                    break;
                }
            }
        }
        else{
            for (int i =0;i<dbTemplates.size();i++){
                if(dbTemplates.get(i).getId()==id){
                    dbTemplates.remove(i);
                    break;
                }
            }
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