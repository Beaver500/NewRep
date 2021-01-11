package task6_1_Arrays_are_one_dimensional;
/*
* Описание
Вы пишете программу, планирующую продуктовую корзину.
У вас есть список доступных продуктов в одном массиве и соответствующая им цена в другом массиве. Пользователь вводит номер продукта из первого списка и количество продуктов этого вида, которое хочет купить. Программа добавляет стоимость продукта, умноженную на его количество, в итоговую сумму продуктовой корзины. Действие повторяется до тех пор, пока пользователь не введет команду "end".

Функционал программы
Создание массива продуктов внутри программы (без пользовательского ввода);
Создание массива цен на продукты (без пользовательского ввода);
Вывод списка доступных для покупки продуктов на экран;
Возможность ввода пользователем номера продукта и количества для добавления в корзину;
Вывод всех покупок, их общую стоимость и количество на экран.
Пример
Список возможных товаров для покупки
1. Молоко
2. Хлеб
3. Гречневая крупа
Выберите товар и количество или введите `end`
1 10 <enter>
Выберите товар и количество или введите `end`
3 1 <enter>
Выберите товар и количество или введите `end`
end <enter>
Ваша корзина:
Наименование товара   Количество  Цена/за.ед  Общая стоимость
Молоко                10          60          600
Гречневая крупа       1           50          50
                                  Итого       650
Пример реализации
Итак, у нас есть список доступных продуктов в одном массиве:

String[] products = new String[]{"Хлеб", "Яблоки", "Молоко"};
и соответствующие цены в другом массиве:

int[] prices = new int[]{100, 200, 300};
При запуске программы необходимо вывести продукты и цены на экран пользователя:
System.out.println(Arrays.toString(products));
System.out.println(Arrays.toString(prices));
Нужно создать переменную, в которой сохранятся значения, вводимые пользователем. Допустим, что:
для номера продукта — это переменная: int productNumber = 0;

для количества это — переменная: int productCount = 0;

По номеру нужно найти цену продукта в массиве цен.

 int currentPrice = prices[productNumber];
Ввод данных нужно организовать, используя цикл while. Для проверки на ввод end использовать inputString.equals("end"), оператор == со строками не работает.

Необходимо вывести понятные пользователю приглашения на ввод требуемых данных.

Нужно привести введенное значение к числовому типу. Integer.parseInt(inputString);

И добавить проверку на ввод целых чисел для номера продукта при помощи try{}catch{}.

try {
  int result = Integer.parseInt(inputString);
} catch (NumberFormatException e) {
  System.out.println("Введите целое число");
}
Далее нужно создать переменную, которая будет хранить в себе итоговою сумму. int sumProducts = 0; К сумме переменной надо добавлять сумму желаемого товара после каждого ввода.
После того как пользователь введет end, программа выйдет из цикла. На экран нужно вывести итоговую сумму продуктовой корзины.
* */
import java.util.Arrays;
import java.util.Scanner;

class Korz{
   // String productNumber = null;//номер продукта ??????
    String productCount = null;//Количество+
    String sumProducts = null;//итоговая сумма+
    String totalСost=null; // общая стоимость за конкретный товар+
    String nameProduct =null;//Наименование товара+
    //String currentPrice = null;//??????

    public Korz(String productCount, String sumProducts, String totalСost, String nameProduct) {
        //this.productNumber = productNumber;
        this.productCount = productCount;
        this.sumProducts = sumProducts;
        this.totalСost = totalСost;
        this.nameProduct = nameProduct;
        //this.currentPrice = currentPrice;
    }

   /* void toBasket(){
        // String input;
        String[] parts = productNumber.split(" ");//создали массив из веденный данных, разбили по пробелу
        int productNumber =Integer.parseInt(parts[0]);// первый элементы массива, номер продукта. по номеру продкукта нужно найти его название.
        int productCount =Integer.parseInt(parts[1]);// второй эл массива, цена продукта.

    }*/

    @Override
    public String toString() {
        return String.format("%-22s%-12d%-12d%-15d", nameProduct, productCount, sumProducts);
    }

}

public class Homework2 {

    public static void main(String[] args) {

        String[] products = new String[]{"#0. Хлеб", "#1. Яблоки", "#2. Молоко"};
        int[] prices = new int[]{100, 200, 300};


        int productNumber = 0;//номер продукта
        int productCount = 0;//кол-во
        int sumProducts = 0;//итоговая сумма
        int totalСost=0;
        int currentPrice = 0; // цена за 1
        String nameProduct =null;



        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(Arrays.toString(products));
            System.out.println(Arrays.toString(prices));
            String input = scanner.nextLine();
            int counter=0;

            try {

                Korz [] korz=new Korz[counter];


                String[] parts = input.split(" ");//создали массив из веденный данных, разбили по пробелу
                productNumber =Integer.parseInt(parts[0]);// первый элементы массива, номер продукта. по номеру продкукта нужно найти его название.
                productCount =Integer.parseInt(parts[1]);// второй эл массива, цена продукта.

                currentPrice = prices[productNumber];
                totalСost= currentPrice*productCount;
                sumProducts=sumProducts+totalСost;
                nameProduct= products[productNumber];

            } catch (NumberFormatException e) {
                System.out.println("Введите целое число");
            }
            counter++;

            if (input.equals("end")) {
                System.out.println("Ваша корзина: ");
                System.out.println("Наименование товара   Количество  Цена/за.ед  Общая стоимость");
                System.out.println("-------------------------------------------------------------");

                /*for (int i = 0; i <counter ; i++) {
                    System.out.printf("%-22s%-12d%-12d%-15d", nameProduct, productCount, currentPrice, sumProducts);
                    System.out.println();
                }*/


               System.out.printf("%-22s%-12d%-12d%-15d", nameProduct, productCount, currentPrice, sumProducts);
                break;
            }
        }
    }
}
