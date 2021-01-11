package task7_Arrays_are_multidimensional;
/*
* Описание
Научимся поворачивать матрицу с равными сторонами. Этот алгоритм мог бы быть использован в графических редакторах вроде Photoshop для поворота изображений.

Дано: двумерная матрица 8 на 8 из случайных чисел от 0 до 255 (спектр цветов GrayScale). Напишите алгоритм "поворота" такой матрицы на 90 градусов по часовой стрелке.

Функционал программы
Создание матрицы в программе;
Вывод матрицы до поворота;
Разворот матрицы;
Вывод матрицы после поворота на 90 градусов.
Пример
Дана следующая матрица:

114 112 148  83 204  22 125  31
192 231 245 128  63 246 139  17
 61 128 224  45  91  57 239  34
219 237 167 191 236 146 144 117
 35 199 102 124 208 195  21 147
 52 229 126  32  24 145  19  39
107  43 190  43  47 172  18  19
 62 221   6 208 241 198 187  85
Вывод:

 62 107  52  35 219  61 192 114
221  43 229 199 237 128 231 112
  6 190 126 102 167 224 245 148
208  43  32 124 191  45 128  83
241  47  24 208 236  91  63 204
198 172 145 195 146  57 246  22
187  18  19  21 144 239 139 125
 85  19  39 147 117  34  17  31
Пример реализации
Итак, у нас есть матрица с размерами 8x8, которую нужно повернуть на 90 градусов по часовой стрелке. Для начала создадим матрицу (размерность матрицы сохраним в переменной filedSize).
  int SIZE = 8;
  int[][] colors = new int[SIZE][SIZE];
Теперь заполним матрицу случайными значениями в диапазоне от 0 до 255:
  Random random = new Random();
  for (int i = 0; i< SIZE; i++) {
    for (int j = 0; j< SIZE; j++) {
    // для случайных значений воспользуемся готовым решением из библиотеки java.util.Random
      colors[i][j] = random.nextInt(256);
    }
  }
Выводим матрицу на экран:
  for (int i = 0; i< SIZE; i++) {
    for (int j = 0; j< SIZE; j++) {
      // %4d означает, что мы под каждый номер резервируем 4 знака
      // (незанятые будут заполнены пробелами)
      // таким образом, у нас получится ровная таблица
      System.out.format("%4d", colors[i][j]);
    }
    // Переход на следующую строку
    System.out.println();
  }
Для повернутой матрицы создадим пустой массив той же размерности:
  int[][] rotatedColors = new int[SIZE][SIZE];
Новая матрица должна принять значения ячеек первой матрицы, но с поворотом на 90 градусов по часовой стрелке. Это значит, что значение первой ячейки rotatedColors[0][0] (первая строка, первое значение) новой матрицы должно быть равно первому значению ячейки последней строки матрицы colors (colors[SIZE-1][0]).
Исходя из вышесказанного нужно:
написать циклы, при помощи которых можно пробежаться по матрицам,
каждому элементу новой матрицы rotatedColors присвоить соответствующее значение из имеющейся colors матрицы.
Перебор элементов матрицы можно организовать встроенными циклами так же, как вы вывели значения на экран colors матрицы.

Задача 1*. Поворот матрицы на 90/180/270 градусов
Добавьте в задачу #1 возможность вводить угол поворота (кратный 90) с клавиатуры.*/
import java.util.Random;
import java.util.Scanner;


public class Main {
    static int[][] result = new int[8][8];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int SIZE = 8;
        int[][] colors = new int[SIZE][SIZE];


        //создание рандомной матрицы 8х8 i - столбец  ,j- строка
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

        //вывод рандомной матрицы 8х8
        print(colors);
        System.out.println();
        System.out.println("На сколько градусов повернуть матрицу: №1 на 90, №2 на 180, №3 на 270.");
        System.out.print("Введите номер: ");
        int input = scanner.nextInt();

        switch (input) {

            case 1:
                int[][] rotatedColors = new int[SIZE][SIZE];
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
//                rotatedColors[i][j] = colors[SIZE - 1 - j][i];//90

                        rotatedColors[i][j] = colors[SIZE - 1 - j][i];//90
//что сделать чтоб повернуть на 270, почему в 90 и 180 меняли местами  i и j ??

                        /*print(rotatedColors);
                        System.out.println();// тест*/
                    }
                    /*print(rotatedColors);
                    System.out.println();// тест*/
                }
                System.out.println();
                print(rotatedColors);
                break;

            case 2:
                int[][] rotatedColors2 = new int[SIZE][SIZE];
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {

                        rotatedColors2[i][j] = colors[SIZE - 1 - i][j];//180
                    }
                }
                System.out.println();
                print(rotatedColors2);
                break;


            case 3:
                int[][] rotatedColors3 = new int[SIZE][SIZE];
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {

                        rotatedColors3[i][j] = colors[i][SIZE - 1 - j];//270
                    }
                }
                System.out.println();
                print(rotatedColors3);
                break;

        }

    }

    static void print(int[][] colors) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                System.out.format("%4d", colors[i][j]);
            }

            System.out.println();
        }
    }



    static int[][] rotate(int[][] colors) {
        int[][] rotatedColors = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                result[i][j] = colors[8 - 1 - j][i];// 90 rotatedColors[i][j] = colors[8 - 1-i][j] - 180
            }
        }
        return result;
    }
}



