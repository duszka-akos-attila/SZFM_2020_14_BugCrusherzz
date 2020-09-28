package com.tracky.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.text.SimpleDateFormat;
import java.util.Date;
@Entity
public class Income {

    @Override
    public String toString() {
        return "Income{" +
                "id= " + id +
                ", amount= " + amount +
                ", description= " + description +
                ", date= " + date +
                '}';
    }
    @PrimaryKey
    private int id;
    @ColumnInfo(name = "amount")
    private int amount;
    @ColumnInfo(name = "description")
    private String description;
    @ColumnInfo(name = "date")
    private Date date;

    public Income(int id, int amount, String description, Date date){
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public String[] toStringArray(String noGroupSing, String dateFormat){
        return new String[]{
                String.valueOf(id),
                description,
                new SimpleDateFormat(dateFormat).format(date),
                noGroupSing,
                String.valueOf(amount),
                "t"
        };
    }
}
