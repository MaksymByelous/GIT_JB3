package Lesson7;

import com.sun.org.apache.xpath.internal.SourceTree;
import java.io.IOException;

import static Lesson7.Car.*;

public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi(4, 10, 3458, "empty");
        Cabrio cabrio = new Cabrio(2, 14, 8264, "full");
        Track track = new Track(2, 25, 1111, "empty");
        Minivan minivan = new Minivan(8, 16, 5861, "empty");
        Car taxipark[] = new Car[100];
        taxipark[0] = taxi;
        taxipark[1] = cabrio;
        taxipark[2] = track;
        taxipark[3] = minivan;

        int count = 0;
        for (Car elementOfArray : taxipark) {
            if (elementOfArray != null) {
                count++;
            }
        }
        System.out.println("Taxi park contains " + count + " cars:");
        for (Car elementOfArray : taxipark) {
            if (elementOfArray != null) {
                elementOfArray.carInfo();
            } else break;
        }
        System.out.print('\n');
        try {

            for (Car elementOfArray : taxipark) {
                if (elementOfArray != null) {
                    if (elementOfArray.getFuelTank() == "full") {
                        elementOfArray.drive();
                    } else throw new ParkException();
                }
            }
        } catch(ParkException e){
                e.printStackTrace();
        }
    }
}

