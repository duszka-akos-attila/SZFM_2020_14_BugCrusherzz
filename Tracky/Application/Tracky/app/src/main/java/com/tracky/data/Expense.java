package com.tracky.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalDate;

@Entity
public class Expense {
    @PrimaryKey
    private int id;
    @ColumnInfo(name = "amount")
    private int amount;
    @ColumnInfo(name = "groupId")
    private int groupId;
    @ColumnInfo(name = "date")
    private LocalDate date;

    public Expense(int id, int amount, int groupId, LocalDate date){
        this.id = id;
        this.amount = amount;
        this.groupId = groupId;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getGroup() {
        return groupId;
    }

    public void setGroup(Group group) {
        this.groupId = group.getId();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}