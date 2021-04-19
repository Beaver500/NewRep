package Scribble.TEST;

import java.util.Arrays;
import java.util.Random;

public class MainSort {
    public static void main(String[] args) {
        //        Product product = new Product(null,0,null);

        Random random = new Random();
        int[] array1 = new int[4];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(20 + 1) - 5;
        }

        System.out.println("Было " + Arrays.toString(array1));
        System.out.println();
        int[] result = babbleSort(array1);
//        int[] result = trainingSort(array1, 0, array1.length);
        System.out.println("СТало " + Arrays.toString(result));
    }

    //можно ли сделать разбивку и объядинение в один метод?
    public static int[] trainingSort(int[] array, int startIndex, int endIndex) {
//        int[] result
        if (startIndex >= endIndex - 1) {
            return array;
        }
        int middle = (startIndex + endIndex) / 2;

        int[] arrayA = trainingSort(array, startIndex, middle);
        System.out.println(Arrays.toString(arrayA));

        int[] arrayB = trainingSort(array, middle, endIndex);
        System.out.println(Arrays.toString(arrayB));

        return array;
    }

    public static int[] merge(int[] array, int startIndex, int middle, int endIndex) {
        int[] buffer = new int[array.length];

        return null;
    }

    public static int[]babbleSort(int [] array1){


        int buf;
        boolean maas = false;
        while (!maas) {
            maas = true;
            for (int i = 0; i < array1.length - 1; i++) {

                if (array1[i] > array1[i + 1]) {
                    maas = false;

                    buf = array1[i];
                    array1[i] = array1[i + 1];
                    array1[i + 1] = buf;

                }


            }
        }

        return array1;
    }

}
