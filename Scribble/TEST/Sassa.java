package Scribble.TEST;

import java.util.Arrays;
import java.util.Random;

public class Sassa {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[4];
        int buf;
        boolean maas = false;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(20 + 1) - 5;
        }

        System.out.println("Было " + Arrays.toString(array1));
        System.out.println();
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

      /*  boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array1.length-1; i++) {
                if(array1[i] > array1[i+1]){
                    isSorted = false;

                    buf = array1[i];
                    array1[i] = array1[i+1];
                    array1[i+1] = buf;
                }
            }
        }*/
        System.out.println("СТало " + Arrays.toString(array1));
    }
}
