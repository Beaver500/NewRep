package Task11_Abstractions_AndInterfaces.HomeWork2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SavingsAccount savingsAccount = new SavingsAccount();
        CreditAccount creditAccount = new CreditAccount();
        CheckingAccount checkingAccount = new CheckingAccount();
        int amount = 0;
        savingsAccount.showBalance();
        checkingAccount.showBalance();
        creditAccount.showBalance();

        while (true) {

            System.out.println("Вводим сумму для пополнения кредитного счета");
            System.out.print("Ввод: ");
            int amountX = scanner.nextInt();
            creditAccount.addMoney(amountX);

            System.out.println("Какую сумму хотим опалтить с расчетного счета? ");
            System.out.print("Ввод: ");
            int amountX3 = scanner.nextInt();
            checkingAccount.pay(amountX3);

            System.out.println("Вводим сумму для перечисления с сберегательного счета на кредитный счет");
            System.out.print("Ввод: ");
            int amountX2 = scanner.nextInt();
            savingsAccount.transfer(creditAccount, amountX2);

        }
    }
}
