package com.tracky.data.base;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.tracky.data.DateConverter;
import com.tracky.data.Expense;
import com.tracky.data.Group;
import com.tracky.data.Income;
import com.tracky.data.Template;
import com.tracky.data.dao.ExpenseDao;
import com.tracky.data.dao.GroupDao;
import com.tracky.data.dao.IncomeDao;
import com.tracky.data.dao.TemplateDao;

@Database(entities = {Expense.class, Income.class, Group.class, Template.class}, version = 1)
@TypeConverters({DateConverter.class})
public abstract class AppDatabase extends RoomDatabase {
    public abstract ExpenseDao expenseDao();
    public abstract IncomeDao incomeDao();
    public abstract GroupDao groupDao();
    public abstract TemplateDao templateDao();
}