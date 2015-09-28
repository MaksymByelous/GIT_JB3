package Lesson7;

public class Car {
    private int passenger;
    private int fuelconsumption;
    private int number;
    public Car(int passenger, int fuelconsumption, int number) {
        this.passenger = passenger;
        this.fuelconsumption= fuelconsumption;
        this.number = number;
    }
    public Car() {
    }
    void carInfo() {
        System.out.println(Car.class.getName()+" number is " + number + " It takes " + passenger + " passengers and need "
                + fuelconsumption + " liters of gas per 100km");
    }
}
