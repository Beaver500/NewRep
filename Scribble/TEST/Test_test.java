package Scribble.TEST;

import java.util.Arrays;

public class Test_test {
    public static void main(String[] args) {
//лол
        int[] arrayA = {5, 2, 4, 6, 1, 3, 2, 6};
        int p = 1;
        int r = arrayA.length;
        int[] result = sort(arrayA, p, r);
        System.out.println(Arrays.toString(result));
    }

    private static int[] sort(int[] arrayA, int p, int r) {
        int q;
        int[] result = new int[0];
        if (p <= r - 1) {
            q = (p + r) / 2;

            sort(arrayA, p, q);

            sort(arrayA, q +1, r);

            result = marge(arrayA, p, q, r);
        }
        return result;
    }


    private static int[] marge(int[] arrayA, int p, int q, int r) {
        // вычисляем длину
//        ??? чот не-то
        int lengthLeft = q - p;
        int lengthRight = r - q;

        int index1 = p;
        int index2 = q;
        int destIndex = p;

        int[] result = new int[arrayA.length];
        // создаем временные подмассивы
        int[] firstArray = new int[lengthLeft];
        int[] secondArray = new int[lengthRight];
        // копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++) {
            firstArray[i] = arrayA[p + i];
        }
        for (int i = 0; i < lengthRight; i++) {

            secondArray[i] = arrayA[q + i];
        }

        // итераторы содержат текущий индекс временного подмассива
        int startIndex = 0;
        int endtIndex = 0;
        // копируем из firstArray и secondArray обратно в массив
        for (int i = p; i < r + 1; i++) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (startIndex < lengthLeft && lengthRight < index2) {
                if (firstArray[startIndex] < secondArray[endtIndex]) {
                    result[i] = firstArray[startIndex++];
                } else {
                    result[i] = secondArray[endtIndex++];
                }
            } else if (startIndex < lengthLeft) {
                result[i] = firstArray[startIndex++];

            } else if (endtIndex < lengthRight) {
                result[i] = secondArray[endtIndex++];

            }
        }
/*

        while (startIndex < lengthLeft && lengthRight < index2) {
            result[destIndex++] = firstArray[index1] < secondArray[index2] ? firstArray[index1++] : secondArray[index2++];
        }
        while (index1 < lengthLeft) {
            result[destIndex++] = firstArray[index1++];
        }
        while (index2 < lengthRight) {
            result[destIndex++] = secondArray[index2++];
        }
*/





        return arrayA;

    }
}