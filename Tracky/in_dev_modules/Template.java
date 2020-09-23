public class Template {

    private boolean isIncome;
    private int id;
    private int amount;
    private Group group;

    public Template(boolean isIncome, int id, int amount, Group group) {
        this.isIncome = isIncome;
        this.id = id;
        this.amount = amount;
        this.group = group;
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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
