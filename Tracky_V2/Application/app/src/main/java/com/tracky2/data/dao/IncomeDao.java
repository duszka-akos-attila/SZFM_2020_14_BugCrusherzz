package com.tracky2.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.tracky2.data.Income;

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
}
