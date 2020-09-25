package com.tracky.data.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.tracky.data.Income;

import java.util.ArrayList;

public interface IncomeDao {
    @Query("SELECT * FROM income")
    ArrayList<Income> selectAllIncome();

    @Insert
    void insertIncome(Income income);

    @Update
    void updateIncome(Income income);

    @Delete
    void deleteIncome(Income income);
}

