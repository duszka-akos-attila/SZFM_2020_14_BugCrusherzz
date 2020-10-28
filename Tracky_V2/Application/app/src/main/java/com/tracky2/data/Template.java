package com.tracky2.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.tracky2.data.Group;

@Entity
public class Template {
    @ColumnInfo(name = "isIncome")
    private boolean isIncome;
    @PrimaryKey
    private int id;
    @ColumnInfo(name = "amount")
    private int amount;
    @ColumnInfo(name = "description")
    private String description;
    @ColumnInfo(name = "groupId")
    private int groupId;

    public Template(boolean isIncome, int id, int amount, String description, int groupId ) {
        this.isIncome = isIncome;
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.groupId = groupId;
    }

    public boolean isIncome() {
        return isIncome;
    }

    public void setIncome(boolean income) {
        isIncome = income;
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

    public int getGroupId() {
        return groupId;
    }

    public void setGroup(Group group) {
        this.groupId = group.getId();
    }

    @Override
    public String toString() {
        return "Template{" +
                "isIncome= " + isIncome +
                ", id= " + id +
                ", amount= " + amount +
                ", description= " + description +
                ", groupId= " + groupId +
                '}';
    }
}