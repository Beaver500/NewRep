package Task16_TreeMap.HomeWorkTreeMap;

import java.util.Scanner;

public class MainHomeWorkTreeMapTreeSet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();
        Contacts contacts = new Contacts();
        MissedCalls missedCalls = new MissedCalls();
        boolean menu = true;

        while (menu) {
            System.out.println("Программа: пропущенные вызовы.\n" +
                    "\n" +
                    "Меню:\n" +
                    "1. Добавить контакт\n" +
                    "2. Добавить пропущенный вызов\n" +
                    "3. Вывести все пропущенные вызовы\n" +
                    "4. Очистить пропущенные вызовы\n" +
                    "5. Выход\n" +
                    "Выберите пункт из меню (1-4): ");
            int menuIn = scanner.nextInt();
            switch (menuIn) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    menu = false;
                    System.out.println("END");
                    break;
            }

        }
    }
}
