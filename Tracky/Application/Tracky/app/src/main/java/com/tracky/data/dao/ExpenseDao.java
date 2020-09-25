package com.tracky.data.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.tracky.data.Expense;

import java.util.ArrayList;

public interface ExpenseDao {
    @Query("SELECT * FROM expense")
    ArrayList<Expense> selectAllExpense();

    @Insert
    void insertExpense(Expense expense);

    @Update
    void updateExpense(Expense expense);

    @Delete
    void deleteExpense(Expense expense);
}
