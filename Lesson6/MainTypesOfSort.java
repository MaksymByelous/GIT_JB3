package Lesson6;

import java.util.Arrays;

/**
 * Created by Max on 14.09.2015.
 */

public class MainTypesOfSort {

    public static void main(String[] args) {
        int[] arrayOne = {2, -45, 44, 23, 7, -3};

        System.out.println("Array One is " + Arrays.toString(arrayOne));
        System.out.println("Lets sort array One by bubble sort and find min-max");
        int [] arrayTwo=Sort.bubbleSort(arrayOne);
        System.out.println("Sorted array two is " + Arrays.toString(arrayTwo)+" min of array is " + arrayTwo[0] +
                " and max is " + arrayTwo[arrayTwo.length - 1]);
        System.out.println("Array One is the same " + Arrays.toString(arrayOne));

        System.out.println("Lets sort array One by selection sort and find min-max");
        int [] arrayThree=Sort.selectionSort(arrayOne);
        System.out.println("Sorted array three is " + Arrays.toString(arrayThree)+" min of array is " + arrayThree[0] +
                " and max is " + arrayThree[arrayTwo.length - 1]);
        System.out.println("Array One is the same " + Arrays.toString(arrayOne));

        Arrays.sort(arrayOne);
        System.out.println("Ooops, after sys method array.sort arrayOne changed "+ Arrays.toString(arrayOne));
    }
}

