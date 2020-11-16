package com.tracky2.data.base;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.tracky2.data.DateConverter;
import com.tracky2.data.Expense;
import com.tracky2.data.Group;
import com.tracky2.data.Income;
import com.tracky2.data.Template;
import com.tracky2.data.dao.ExpenseDao;
import com.tracky2.data.dao.GroupDao;
import com.tracky2.data.dao.IncomeDao;
import com.tracky2.data.dao.TemplateDao;

@Database(entities = {Expense.class, Income.class, Group.class, Template.class}, version = 1)
@TypeConverters({DateConverter.class})
public abstract class AppDatabase extends RoomDatabase {
    public abstract ExpenseDao expenseDao();
    public abstract IncomeDao incomeDao();
    public abstract GroupDao groupDao();
    public abstract TemplateDao templateDao();
}