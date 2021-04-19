package Scribble.TEST;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class MainMergesort {
    /*public static void main(String[] args) {
        Boolean z = true;
        Scanner scanner = new Scanner(System.in);
        Test_test test_test = new Test_test();

        while (z) {
            System.out.print("ТЕСТ МЕТОДОВ\n" + " 1 - void\n" + " 2 - возврат int\n" + " 0 - выход\n" + "Ввод: ");
            String in = scanner.nextLine();

            switch (in) {
                case "1":
                    System.out.print("введи текст, будет лол: ");
                    String txt = scanner.nextLine();
                    test_test.add(txt);
                    break;

                case "2":
                    System.out.println(" введи число, умножу на 10:  ");
                    int integer = scanner.nextInt();
                    System.out.println(test_test.add(integer));
                    break;

                case "0":
                    System.out.println("END");
                    z = false;
                    break;
            }
        }


    }*/

    /*
     * пример
     *https://urvanov.ru/2017/08/19/%D0%B0%D0%BB%D0%B3%D0%BE%D1%80%D0%B8%D1%82%D0%BC-%D1%81%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B8-%D1%81%D0%BB%D0%B8%D1%8F%D0%BD%D0%B8%D0%B5%D0%BC-%D0%BD%D0%B0-java/
     *
     *
     * */
    public static void main(String[] args) {
//        Product product = new Product(null,0,null);

        Random random = new Random();
        int[] array1 = new int[4];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(20 + 1) - 5;
        }

        System.out.println(Arrays.toString(array1));
        System.out.println();

        int[] result = bubbleSort(array1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergesort(int[] array1) {
//        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer = new int[array1.length];
        return mergesortInner(array1, buffer, 0, array1.length);
    }

    /**
     * @param array1     Массив для сортировки.
     * @param buffer     Буфер. Размер должен быть равен размеру array1.
     * @param startIndex Начальный индекс в array1 для сортировки.
     * @param endIndex   Конечный индекс в array1 для сортировки.
     */
    public static int[] mergesortInner(int[] array1, int[] buffer, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return array1;
        }


        int middle = (startIndex + endIndex) / 2;

        int[] sorted1 = mergesortInner(array1, buffer, startIndex, middle);
        int[] sorted2 = mergesortInner(array1, buffer, middle, endIndex);


        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;

        int[] result = sorted1 == array1 ? buffer : array1;//?

        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2] ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }


    public static int[] bubbleSort(int[] array1) {
        int q;
        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = 1; j < array1.length; j++) {
                if (array1[i] > array1[j]) {

                    q = array1[i];
                    array1[i] = array1[j];
                    array1[j] = q;


                }
            }

        }


        return array1;
    }
}
