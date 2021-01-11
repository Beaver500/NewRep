package Task11_Abstractions_AndInterfaces.HomeWork2;

public class SavingsAccount extends Account {
    private static int money = 1000;

    public SavingsAccount() {
        super(money);
    }


    @Override
    void pay(int amount) {
        System.out.println();
        System.out.println("Счет сберегательный, оплата через данный счет невозможна.");
        System.out.println();
    }

    @Override
    void transfer(Account account, int amount) {
        if (money - amount < 0) {
            System.out.println();
            System.out.println("Операция не может быть выполнена, сберегательный счет не может быть равен 0");
            System.out.println();
        } else {
            if (account.addMoney(amount) == false) {
                System.out.println("Введите верное число");
                System.out.println();
            } else
                money -= amount;

        }
        showBalance();

    }

    @Override
    boolean addMoney(int amount) {
        money += amount;
        showBalance();
        return true;
    }

    @Override
    void showBalance() {
        System.out.println();
        System.out.println("Балланс сберегательного счета: " + money);
        System.out.println();
    }


}
