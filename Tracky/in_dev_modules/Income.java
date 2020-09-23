package adag;

import java.time.LocalDate;

public class Income {

    private int id;
    private int amount;
    private LocalDate date;

    public Income(int id, int amount, LocalDate date){
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

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }


    @Override
    public String toString() {
        return "Income{" +
                "id=" + id +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
