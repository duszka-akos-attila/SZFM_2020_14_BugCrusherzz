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
public class Expense {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "amount")
    private int amount;
    @ColumnInfo(name = "description")
    private String description;
    @ColumnInfo(name = "groupId")
    private int groupId;
    @ColumnInfo(name = "date")
    private Date date;

    public Expense( int amount, String description, int groupId, Date date){
        this.amount = amount;
        this.id = 0;
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

    public int getGroupId() {
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

    public String[] toStringArray(){
        return new String[]{
                DateConverter.formatDateGetMonth(date),
                new DecimalFormat("- ###,###,### "+context.getString(R.string.currency))
                        .format(amount),
                description,
        };
    }
}