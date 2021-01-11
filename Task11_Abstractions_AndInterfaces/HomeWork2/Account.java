package Task11_Abstractions_AndInterfaces.HomeWork2;

abstract public class Account {
    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    protected Account(int money) {
        this.money = money;
    }

    abstract void pay(int amount);

    abstract void transfer(Account account, int amount);

    abstract boolean addMoney(int amount);

    abstract void showBalance();

}
