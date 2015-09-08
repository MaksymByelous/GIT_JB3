package Lesson4;
import java.util.Scanner;
/**
 * Created by Max on 08.09.2015.
 */


public class Car {

    int passenger;
    int fuelconsumption;
    int number;
    int distance;
    int fuelneeded;

    public Car(int passenger, int fuelconsumption, int number) {
        this.passenger = passenger;
        this.fuelconsumption= fuelconsumption;
        this.number = number;
    }

    void ShowNumber() {
        System.out.println(" number is "+number);
    }

 //  public double FullNeeded() {
   //     Scanner sc = new Scanner(System.in);
   //     System.out.println("Input distance");
   //     distance = sc.NextInt();
   //     fuelneeded=(distance / 100) * fuelconsumption;
   //     System.out.println("You need " + fuelneeded + " liters of fuel");


   //     return fuelneeded;
   // }
}
