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
        //как вывести количество элементов массива, не длинну
        //как вывести имя класса к которому применяется метод
        System.out.println("Taxi park contains 4 cars:");
        try {
            for (Car x : taxipark) {
                System.out.print(x);
                x.carInfo();
            }
        } catch (NullPointerException e) {
                System.err.println("taxipark isnt full") ;
        }
        System.out.print('\n');
        try {
            taxipark[122].toString();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("we have only 100 cars");
       }
    }
}
