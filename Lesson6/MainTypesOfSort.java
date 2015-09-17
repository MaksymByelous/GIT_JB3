package Lesson6;

import java.util.Arrays;

/**
 * Created by Max on 14.09.2015.
 */

public class MainTypesOfSort {

    public static void main(String[] args) {
        int[] arrayOne = {2, -45, 44, 23, 7, -3};

        System.out.println("sort array One with Sys method");
        Arrays.sort(arrayOne);
        for (int x : arrayOne) System.out.print(x + " ");
        System.out.println();

        System.out.println("sort array One with Selection method");

        System.out.println();

        System.out.println("sort array One with Bubble method");

    }
}

