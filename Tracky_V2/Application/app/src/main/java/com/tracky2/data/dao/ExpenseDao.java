package com.tracky2.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.tracky2.data.Expense;
import java.util.List;
@Dao
public interface ExpenseDao {
    @Query("SELECT * FROM expense")
    List<Expense> selectAllExpense();

    @Insert
    void insertExpense(Expense expense);

    @Update
    void updateExpense(Expense expense);

    @Delete
    void deleteExpense(Expense expense);
}
