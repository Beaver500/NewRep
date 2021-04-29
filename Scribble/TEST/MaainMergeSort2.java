package Scribble.TEST;
/*
* Сортировка слиянием, тестовое задание
*
* */
import java.util.Random;
import java.util.Arrays;

public class MaainMergeSort2 {
    public static class MainMergesort {
        public static void main(String[] args) {
            int[] array = new int[]{5, 2, 4, 6, 1, 3, 2, 6};
            System.out.println(Arrays.toString(array));
            System.out.println();
            int[] result = sort(array, 0, array.length);
            System.out.println(Arrays.toString(result));

        }

        public static int[] sort(int[] array, int startIndex, int endIndex) {

            if (startIndex == endIndex - 1) {
                return array;
            }

            int middle = (startIndex + endIndex) / 2;
            int[] leftArray = sort(array, startIndex, middle);
            int[] rightArray = sort(array, middle, endIndex);
            return merge(array, leftArray, rightArray, startIndex, middle, endIndex);


        }


        public static int[] merge(int[] array, int[] leftArray, int[] rightArray, int startIndex, int middle, int endIndex) {
            int[] buffer1 = Arrays.copyOf(array, array.length);
            int[] buffer2 = new int[array.length];

            int index1 = startIndex;
            int index2 = middle;
            int resultIndex = startIndex;

            int[] result = leftArray == buffer1 ? buffer2 : buffer1;

            while (index1 < middle && index2 < endIndex) {
                result[resultIndex++] = leftArray[index1] < rightArray[index2] ? leftArray[index1++] : rightArray[index2++];
            }
            while (index1 < middle) {
                result[resultIndex++] = leftArray[index1++];
            }
            while (index2 < endIndex) {
                result[resultIndex++] = rightArray[index2++];
            }

            return result;
        }
    }
}
