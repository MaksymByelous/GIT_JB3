package Lesson6;

import java.util.Arrays;

/**
 * Created by Max on 14.09.2015.
 */

public class MainTypesOfSort {

    public static void main(String[] args) {
        int[] arrayOne = {2, -45, 44, 23, 7, -3};

        System.out.println("Array One is " + Arrays.toString(arrayOne) + ". lets sort array One with Sys method");
        Arrays.sort(arrayOne);
        System.out.println("Sorted array One is " + Arrays.toString(arrayOne));
        System.out.println("min of arrayone is" + arrayOne[0] + " and max is " + arrayOne[arrayOne.length - 1]);
        System.out.println();

        int [] arrayTwo= arrayOne.bubbleSort(arrayOne);

    }
}

