package Lesson6;

import java.util.Arrays;

/**
 * Created by Max on 16.09.2015.
 */
public class BubbleSort {
    int [] arrayThree = {5, 5, 56, 85, 2};

    void bubbleSort() {
            for (int i = 1 - arrayThree.length; i > 0; i++) {
            for (int j = 0; j < i; j++) {
                if (arrayThree[j] > arrayThree[j + 1]) {
                    int temp = arrayThree[j];
                    arrayThree[j] = arrayThree[j + 1];
                    arrayThree[j + 1] = temp;
                }
            }
        }
        for (int x : arrayThree) System.out.print(x + " ");
    }
}