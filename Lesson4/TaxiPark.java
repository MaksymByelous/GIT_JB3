package Lesson4;

/**
 * Created by Max on 07.09.2015.
 */
class TaxiPark {
}

class Car {
    int passenger, fuelneed;

    public Car(int passenger, int fuelneed) {
        this.passenger = passenger;
        this.fuelneed = fuelneed;
    }
}

class Minivan extends Car {
    public Minivan(int passenger, int fuelneed) {
        super(passenger, fuelneed);
    }
}

class Track extends Car {
    public Track(int passenger, int fuelneed) {
        super(passenger, fuelneed);
    }
}

class Cabrio extends Car {
    public Cabrio(int passenger, int fuelneed) {
        super(passenger, fuelneed);
    }
}