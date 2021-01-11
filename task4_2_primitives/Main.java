package task4_2_primitives;
/*Описание
Напишем программу для сравнения double, float и округления этих типов

Функционал программы
Ввод двух чисел double или float;
Ввод операции;
Вывод результата.
Пример
Операции над double/float
1. Сравнить
2. Округлить
3. Отбросить дробную часть

1 <enter>
Введите первое число:
0.33 <enter>
Введите второе число:
0.33 <enter>
Результат:
числа равны
Процесс реализации
При запуске программы выведем возможные операции над числами с помощью System.out.println

Выберем операцию:

для отброса дробной части — можно привести к типу long;
для сравнения — вычесть одно число из другого и проверить разницу;
для округления — воспользуемся Math.round(value).
Выведем результат.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("операции над float/double");
        System.out.println("1 сравнить  ");
        System.out.println("2 округлить  ");
        System.out.println("3 отбросить дробную часть  ");

        int choise = scanner.nextInt();

        System.out.println("Введите первое число");
        float num1 = scanner.nextFloat();
        System.out.println("Введите второе число");
        float num2 = scanner.nextFloat();

        switch (choise) {

            case (1): {
                String result = compare (num1, num2);
                System.out.println(result);
                break;
            }
            case (2): {
                round (num1, num2);
                break;
            }
            case (3): {
                leave(num1, num2);
                break;
            }
        }
    }

    static String compare(float num1, float num2) {

        float diff = num1 - num2;
        if (diff == 0) {
            return "Числа равны";
        } else if (diff<0){
            return "первое число меньше второго";
        } else {
            return "второе число меньше первого";
        }
    }
    static void round(float num1, float num2) {
        System.out.println( "первое число: "+ Math.round(num1));// Msth.round  - округление числа
        System.out.println( "второе число: "+ Math.round(num2));
    }

    static void leave (float num1, float num2){
        System.out.println("первое число: "+(long)num1);
        System.out.println("второе число: "+(long)num2);
    }
}

