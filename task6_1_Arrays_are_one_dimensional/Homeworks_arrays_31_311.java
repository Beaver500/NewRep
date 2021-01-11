package task6_1_Arrays_are_one_dimensional;

import java.util.Arrays;
import java.util.Scanner;


public class Homeworks_arrays_31_311 {


    public static void main(String[] args) {

        String[] products = new String[]{"#0. Хлеб", "#1. Яблоки", "#2. Молоко"};
        int[] prices = new int[]{100, 200, 300};

        int productNumber = 0;
        int productCount = 0;
        int sumTotal = 0;

        int[] numbers = new int[products.length];

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println(Arrays.toString(products));
            System.out.println(Arrays.toString(prices));
            System.out.println("Выберете продукт и нужное кол-во через пробел, нумерация продукта начинается с нуля.");
            System.out.println("Стоимость продукта указана в том порядке что и продукты.");
            System.out.println("Для завершения введите - end.");
            String input = scanner.nextLine();

            try {
                String[] parts = input.split(" ");
                productNumber = Integer.parseInt(parts[0]);
                productCount = Integer.parseInt(parts[1]);
                numbers[productNumber] = productCount;

            } catch (NumberFormatException e) {
                System.out.println("Введите целое число");
            }


            if (input.equals("end")) {
                System.out.println("Ваша корзина: ");
                System.out.println("Наименование товара   Количество  Цена/за.ед  Общая стоимость");
                System.out.println("-------------------------------------------------------------");

                for (int i = 0; i < products.length; i++) {
                    if (numbers[i] > 0) {
                        System.out.printf("%-22s%-12d%-12d%-15d", products[i], numbers[i], prices[i], prices[i] * numbers[i]);
                        System.out.println();

                        sumTotal = sumTotal + prices[i] * numbers[i];
                    }
                }

                System.out.println("Итого " + sumTotal);
                break;
            }

        }
    }
}
