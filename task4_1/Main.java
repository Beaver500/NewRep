package task4_1;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String result = "";
        while (true) {
            System.out.print("Введите ASCII код (end для вывода результата):");
            input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("результат: "+result);
                break;
            }

            int number = Integer.parseInt(input, 8);// перевод из 8 в (int)10 сис. счис.
            char symbol = (char) number;// перевод из 10 сис. в символьную
            String line = Character.toString(symbol); // из символьной в строку
            result += line;// склеивание строк

        }
    }
}