package adag;

public class Template {

    private boolean isIncome;
    private int id;
    private int amount;
    private int groupId;

    public Template(boolean isIncome, int id, int amount, int groupId ) {
        this.isIncome = isIncome;
        this.id = id;
        this.amount = amount;
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

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(Group group) {
        this.groupId = group.getId();
    }

    @Override
    public String toString() {
        return "Template{" +
                "isIncome=" + isIncome +
                ", id=" + id +
                ", amount=" + amount +
                ", groupId=" + groupId +
                '}';
    }
}
