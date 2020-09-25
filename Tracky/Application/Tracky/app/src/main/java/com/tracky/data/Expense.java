package com.tracky.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Expense {
    @PrimaryKey
    private int id;
    @ColumnInfo(name = "amount")
    private int amount;
    @ColumnInfo(name = "description")
    private String description;
    @ColumnInfo(name = "groupId")
    private int groupId;
    @ColumnInfo(name = "date")
    private Date date;

    public Expense(int id, int amount, String description, int groupId, Date date){
        this.id = id;
        this.amount = amount;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getGroup() {
        return groupId;
    }

    public void setGroup(Group group) {
        this.groupId = group.getId();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
