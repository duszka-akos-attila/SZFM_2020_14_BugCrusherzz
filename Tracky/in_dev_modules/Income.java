package adag;

import java.time.LocalDateTime;

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
    private LocalDateTime date;

    public Income(int id, int amount, LocalDateTime date){
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

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
