package Lesson4;

/**
 * Created by Max on 07.09.2015.
 */
class TaxiPark {
    int cars[];
}

class Car {
    int passenger;
    int fuelneed;
    int number;

    public Car(int passenger, int fuelneed, int number) {
        this.passenger = passenger;
        this.fuelneed = fuelneed;
        this.number = number;
    }
}

class Taxi extends Car {
    public Taxi(int passenger, int fuelneed, int number) {
        super(passenger, fuelneed, number);
    }
}

class Minivan extends Car {
    public Minivan(int passenger, int fuelneed, int number) {
        super(passenger, fuelneed, number);
    }
}

class Track extends Car {
    public Track(int passenger, int fuelneed, int number) {
        super(passenger, fuelneed, number);
    }
}

class Cabrio extends Car {
    public Cabrio(int passenger, int fuelneed, int number) {
        super(passenger, fuelneed, number);
    }
}