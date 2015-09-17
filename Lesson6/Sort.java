package Lesson6;

import java.util.Arrays;

/**
 * Created by Max on 17.09.2015.
 */
public class Sort {

    static void bubbleSort(int[] Array){
          for (int i = Array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Array[j] > Array[j + 1]) {
                    int temp = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array is " + Arrays.toString(Array)+" min of array is" + Array[0] +
                " and max is " + Array[Array.length - 1]);
    }
    static void selectionSort(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            int min = Array[i];
            int min_i = i;
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[j] < min) {
                    min = Array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int temp = Array[i];
                Array[i] = Array[min_i];
                Array[min_i] = temp;
            }
        }
        System.out.println("Sorted array is " + Arrays.toString(Array)+"min of array is" + Array[0] +
                " and max is " + Array[Array.length - 1]);
    }
}
