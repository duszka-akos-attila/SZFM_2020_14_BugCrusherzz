package com.tracky.data;

import java.util.Date;

public class Income {

    @Override
    public String toString() {
        return "Income{" +
                "id=" + id +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }

    private int id;
    private int amount;
    private Date date;

    public Income(int id, int amount, Date date){
        this.id = id;
        this.amount = amount;
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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

    public Date getDate() {
        return date;
    }
}
