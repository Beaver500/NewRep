package Task11_Abstractions_AndInterfaces.HomeWork2;

public class CheckingAccount extends Account {
    private static int money = 500;

    public CheckingAccount() {
        super(money);
    }
    //    Расчетный может выполнять все три операции, но не может уходить в минус.


    @Override
    void pay(int amount) {
        if (money - amount < 0) {
            System.out.println();
            System.out.println("Операция не может быть выполнена, Расчетный счет не может быть меньше 0");
            System.out.println();
        } else {
            money -= amount;
        }
        showBalance();
    }

    @Override
    void transfer(Account account, int amount) {
        if (money - amount < 0) {
            System.out.println();
            System.out.println("Операция не может быть выполнена, Расчетный счет не может быть меньше 0");
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
        System.out.println("Балланс расчетного счета: " + money);
        System.out.println();
    }
}
