package Lesson7;

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

    public Car() {
    }

    void ShowNumber() {
        System.out.println(" number is "+number);
    }

    void removeRoof () {
        System.out.println("roof is open");
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
