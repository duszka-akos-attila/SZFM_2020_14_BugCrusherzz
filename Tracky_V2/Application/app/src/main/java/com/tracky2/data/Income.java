package com.tracky2.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.tracky2.R;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.tracky2.MainActivity.context;

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
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "amount")
    private int amount;
    @ColumnInfo(name = "description")
    private String description;
    @ColumnInfo(name = "date")
    private Date date;

    public Income( int amount, String description, Date date){
        this.amount = amount;
        this.id = 0;
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

    public String[] toStringArray(){
        return new String[]{
                DateConverter.formatDateGetMonth(date),
                new DecimalFormat("+ ###,###,### "+context.getString(R.string.currency))
                        .format(amount),
                description,
        };
    }
}
