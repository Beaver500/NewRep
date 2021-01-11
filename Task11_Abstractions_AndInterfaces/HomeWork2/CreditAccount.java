package Task11_Abstractions_AndInterfaces.HomeWork2;

public class CreditAccount extends Account {
    private static int money = -200;

    public CreditAccount() {
        super(money);
    }
    //Кредитный не может иметь положительный баланс – если платить с него, то уходит в минус, чтобы вернуть в 0, надо пополнить его.


    @Override
    void pay(int amount) {
        money -= amount;
        showBalance();
    }

    @Override
    void transfer(Account account, int amount) {
        money -= amount;
        account.addMoney(amount);
        showBalance();

    }

    @Override
    boolean addMoney(int amount) {
        if (money + amount > 0) {
            System.out.println();
            System.out.println("Операция не может быть выполнена, Кредитный счет должен быть может 0 или ниже, необходимо пополнить на : " + money * -1 + " у.е.");
            System.out.println();
            return false;
        } else {
            money += amount;
        }
        showBalance();
        return true;
    }

    @Override
    void showBalance() {
        System.out.println();
        System.out.println("Балланс кредитного счета: " + money);
        System.out.println();
    }
}
