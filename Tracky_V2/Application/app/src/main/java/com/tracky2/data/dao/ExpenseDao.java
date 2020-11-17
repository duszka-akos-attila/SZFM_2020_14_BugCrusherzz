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

    // Ordering normal queries by date

    @Query("SELECT * FROM expense ORDER BY date ASC")
    List<Expense> selectAllExpenseOBDA();

    @Query("SELECT * FROM expense ORDER BY date DESC")
    List<Expense> selectAllExpenseOBDD();

    // Ordering normal queries by amount

    @Query("SELECT * FROM expense ORDER BY amount ASC")
    List<Expense> selectAllExpenseOBAA();

    @Query("SELECT * FROM expense ORDER BY amount DESC")
    List<Expense> selectAllExpenseOBAD();


    // Ordering queries which amounts has limits by date

    @Query("SELECT * FROM expense WHERE amount BETWEEN :min AND :max ORDER BY date ASC")
    List<Expense> selectExpenseBetweenAmountOBDA(int min, int max);

    @Query("SELECT * FROM expense WHERE amount BETWEEN :min AND :max ORDER BY date DESC")
    List<Expense> selectExpenseBetweenAmountOBDD(int min, int max);

    // Ordering queries which amounts has limits by amount

    @Query("SELECT * FROM expense WHERE amount BETWEEN :min AND :max ORDER BY amount ASC")
    List<Expense> selectExpenseBetweenAmountOBAA(int min, int max);

    @Query("SELECT * FROM expense WHERE amount BETWEEN :min AND :max ORDER BY amount DESC")
    List<Expense> selectExpenseBetweenAmountOBAD(int min, int max);
}
