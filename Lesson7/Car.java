package Lesson7;

public class Car {

    int passenger;
    int fuelconsumption;
    int number;

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
}
