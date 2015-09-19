package Lesson6;

import java.util.Arrays;

/**
 * Created by Max on 17.09.2015.
 */
public class Sort {

    static int[] bubbleSort(int[] Array){
        int[] clone = Array.clone();
        for (int i = clone.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (clone[j] > clone[j + 1]) {
                    int temp = clone[j];
                    clone[j] = clone[j + 1];
                    clone[j + 1] = temp;
                }
            }
        }
        return clone;
    }
    static int[] selectionSort(int[] Array) {
        int[] clone = Array.clone();
        for (int i = 0; i < clone.length; i++) {
            int min = clone[i];
            int min_i = i;
            for (int j = i + 1; j < clone.length; j++) {
                if (clone[j] < min) {
                    min = clone[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int temp = clone[i];
                clone[i] = clone[min_i];
                clone[min_i] = temp;
            }
        }
        return clone;
    }
}
