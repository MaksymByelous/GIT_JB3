package Lesson9;

public class Car {
    private int passenger;
    private int fuelConsumption;
    private int number;
    private String fuelTank;

    public Car(int passenger, int fuelConsumption, int number, String fuelTank) {
        this.passenger = passenger;
        this.fuelConsumption = fuelConsumption;
        this.number = number;
        this.fuelTank = fuelTank;
    }

    public String getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(String fuelTank) {
        this.fuelTank = fuelTank;
    }

    public void carInfo() {
        System.out.println(this.getClass().getSimpleName() + "       " + number + "           " + passenger + "              "
                + fuelConsumption + "          " + fuelTank);
    }

    void drive() {
        System.out.println("you are driving " + this.getClass().getSimpleName() + "!");
    }

    void gasToTank() {
        this.fuelTank = "full";
        System.out.println("fuel tank is full now, you can drive");
    }
}
