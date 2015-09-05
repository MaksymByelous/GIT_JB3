package Lesson1;

import java.util.Scanner;

/**
 * Created by Max on 04.09.2015.
 */
public class HW1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int nums[]={1,5,13,8,6,7,12,19,7};
        int valtofound=5;

        System.out.println("Hi, Taras! this is example with Sysprint and Scanner");

        System.out.println("checking git");
        for(int x: nums){
            System.out.println("input val from 0 to 20 to be found");
            valtofound=sc.nextInt();
            if(valtofound==5)
                System.out.println("val is found!!!");
            break;
        }

    }
}

