package Lesson7;

import com.sun.org.apache.xpath.internal.SourceTree;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Taxi taxi= new Taxi( 4, 10, 3458);
        Cabrio cabrio = new Cabrio(2, 14, 8264);
        Track track = new Track(2, 25, 1111);
        Minivan minivan = new Minivan(8, 16, 5861);
        Car taxipark[]=new Car[100];
        taxipark[0]=taxi;
        taxipark[1]=cabrio;
        taxipark[2]=track;
        taxipark[3]=minivan;
        int count=0;
        for (Car elementOfArray : taxipark) {
            if(elementOfArray != null){
                count++;
            }
        }
        System.out.println("Taxi park contains " + count + " cars:");
        try {
            for (Car  elementOfArray: taxipark) {
                if (elementOfArray != null) {
                    elementOfArray.carInfo();
                } else break;
            }
        } catch (NullPointerException e) {
                System.err.println("taxipark isnt full") ;
        }
        System.out.print('\n');
    }
}
