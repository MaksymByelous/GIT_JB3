package Lesson10;

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

    public void carInfoTable() {
        System.out.println(this.getClass().getSimpleName() + "\t\t" + number + "\t\t\t" + passenger + "\t\t\t\t"
                + fuelConsumption + "\t\t\t" + fuelTank);
    }

    public String carInfoString() {
        return this.getClass().getSimpleName()+"\t" + number + "\t" + passenger + "\t"
                + fuelConsumption + "\t" + fuelTank + "\t";
    }

    public void drive() {
        System.out.println("you are driving " + this.getClass().getSimpleName() + "!");
    }

    public void gasToTank() {
        this.fuelTank = "full";
        System.out.println("fuel tank is full now, you can drive");
    }
}
