package Scribble.TEST;

import java.util.Arrays;

public class MarcoPolo {
    public static void main(String[] args) {
// Задачки по книге "Грокаем алгоритмы"

        /*
        * Бинарный поиск, знаем что ищем, массив должен быть отсортирован.
        * Делим массив на 2, берем середину и сравнимае с тем что есть, > & < ?
        * в зависимости от условия движемся в определенную сторону.
         * */

        

    }


    private static int[] sort(int[] arrayA, int[] buffer, int p, int r) {
        int[] result = new int[arrayA.length];//?

        int q = 0;
        if (p <= r - 1) {
            q = (p + r) / 2;
//            System.out.println("I-" + p + " " + q + " " + r);

            int[] sorted1 = sort(arrayA, buffer, p, q);
//            System.out.println("II-" + p + " " + q + " " + r);
            int[] sorted2 = sort(arrayA, buffer, q + 1, r);
//            System.out.println("III-" + p + " " + q + " " + r);
            int[] merge = marge1(arrayA, buffer, sorted1, sorted2, p, q, r);

        }
        return result;
    }


    private static int[] marge1(int[] arrayA, int[] buffer, int[] sorted1, int[] sorted2,
                                int startIndex, int middle, int endIndex) {
//это нужно?
        if (startIndex >= endIndex - 1) {
            return arrayA;
        }

/*

        int middle = (startIndex + endIndex) / 2;
        int[] sorted1 = mergesortInner(arrayA, buffer, startIndex, middle);
        int[] sorted2 = mergesortInner(arrayA, buffer, middle, endIndex);
*/

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;

        int[] result = sorted1 == arrayA ? buffer : arrayA;

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


    private static int[] marge2(int[] arrayA, int startIndex, int middle, int endIndex) {


        return null;
    }


}
