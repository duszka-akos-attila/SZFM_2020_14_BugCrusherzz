package com.tracky2.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.tracky2.data.Income;

import java.util.Date;
import java.util.List;
@Dao
public interface IncomeDao {
    @Query("SELECT * FROM income")
    List<Income> selectAllIncome();

    @Insert
    void insertIncome(Income income);

    @Update
    void updateIncome(Income income);

    @Delete
    void deleteIncome(Income income);
    
    // Ordering normal queries by date

    @Query("SELECT * FROM income ORDER BY date ASC")
    List<Income> selectAllIncomeOBDA();

    @Query("SELECT * FROM income ORDER BY date DESC")
    List<Income> selectAllIncomeOBDD();

    // Ordering normal queries by amount

    @Query("SELECT * FROM income ORDER BY amount ASC")
    List<Income> selectAllIncomeOBAA();

    @Query("SELECT * FROM income ORDER BY amount DESC")
    List<Income> selectAllIncomeOBAD();


    // Ordering queries which amounts has limits by date

    @Query("SELECT * FROM income WHERE amount BETWEEN :min AND :max ORDER BY date ASC")
    List<Income> selectIncomeBetweenAmountOBDA(int min, int max);

    @Query("SELECT * FROM income WHERE amount BETWEEN :min AND :max ORDER BY date DESC")
    List<Income> selectIncomeBetweenAmountOBDD(int min, int max);

    // Ordering queries which amounts has limits by amount

    @Query("SELECT * FROM income WHERE amount BETWEEN :min AND :max ORDER BY amount ASC")
    List<Income> selectIncomeBetweenAmountOBAA(int min, int max);

    @Query("SELECT * FROM income WHERE amount BETWEEN :min AND :max ORDER BY amount DESC")
    List<Income> selectIncomeBetweenAmountOBAD(int min, int max);


    // Ordering queries which date has limits by date

    @Query("SELECT * FROM income WHERE date BETWEEN :min AND :max ORDER BY date ASC")
    List<Income> selectIncomeBetweenDateOBDA(int min, int max);

    @Query("SELECT * FROM income WHERE date BETWEEN :min AND :max ORDER BY date DESC")
    List<Income> selectIncomeBetweenDateOBDD(int min, int max);

    // Ordering queries which date has limits by amount

    @Query("SELECT * FROM income WHERE date BETWEEN :min AND :max ORDER BY amount ASC")
    List<Income> selectIncomeBetweenDateOBAA(Date min, Date max);

    @Query("SELECT * FROM income WHERE date BETWEEN :min AND :max ORDER BY amount DESC")
    List<Income> selectIncomeBetweenDateOBAD(Date min, Date max);

}
