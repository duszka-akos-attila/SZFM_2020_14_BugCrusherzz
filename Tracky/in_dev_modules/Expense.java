import java.time.LocalDateTime;

public class Expense {

    private int id;
    private int amount;
    private Group group;
    private LocalDateTime date;

    public Expense(int id, int amount, Group group, LocalDateTime date){
        this.id = id;
        this.amount = amount;
        this.group = group;
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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
