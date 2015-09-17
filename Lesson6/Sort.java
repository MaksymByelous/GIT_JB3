package Lesson6;

import java.util.Arrays;

/**
 * Created by Max on 17.09.2015.
 */
public class Sort {

    static int[] bubbleSort(){
          for (int i = Arrays.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Arrays[j] > Arrays[j + 1]) {
                    int temp = Arrays[j];
                    Arrays[j] = Arrays[j + 1];
                    Arrays[j + 1] = temp;
                }
            }
        }
        return System.out.println("Sorted array is " + Arrays.toString(Arrays)+"min of array is" + Arrays[0] +
                " and max is " + Arrays[Arrays.length - 1]);
    }
    static int[] selectionSort() {
        for (int i = 0; i < Arrays.length; i++) {
            int min = Arrays[i];
            int min_i = i;
            for (int j = i + 1; j < Arrays.length; j++) {
                if (Arrays[j] < min) {
                    min = Arrays[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int temp = Arrays[i];
                Arrays[i] = Arrays[min_i];
                Arrays[min_i] = temp;
            }
        }
        return System.out.println("Sorted array is " + Arrays.toString(Arrays)+"min of array is" + Arrays[0] +
                " and max is " + Arrays[Arrays.length - 1]);
    }

}
