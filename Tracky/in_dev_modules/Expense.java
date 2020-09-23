package adag;

import java.util.Date;

public class Expense {

    private int id;
    private int amount;
    private int groupId;
    private Date date;

    public Expense(int id, int amount, int groupId, Date date){
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

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", amount=" + amount +
                ", groupId=" + groupId +
                ", date=" + date +
                '}';
    }
}
