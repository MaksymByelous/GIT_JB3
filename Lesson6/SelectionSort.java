package Lesson6;

/**
 * Created by Max on 17.09.2015.
 */
public class SelectionSort {
    int[] arrayTwo = {59, 5, -22, -25, 61, 2, 150};

    void selectionSort() {
        for (int i = 0; i < arrayTwo.length; i++) {
            int min = arrayTwo[i];
            int min_i = i;
            for (int j = i + 1; j < arrayTwo.length; j++) {
                if (arrayTwo[j] < min) {
                    min = arrayTwo[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int temp = arrayTwo[i];
                arrayTwo[i] = arrayTwo[min_i];
                arrayTwo[min_i] = temp;
            }
        }
    }

}
