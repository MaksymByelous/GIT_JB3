package Lesson10;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi(4, 10, 3458, "empty");
        Cabrio cabrio = new Cabrio(2, 14, 8264, "full");
        Track track = new Track(2, 25, 1111, "empty");
        Minivan minivan = new Minivan(8, 16, 5861, "empty");
        Taxi taxi2 = new Taxi(4, 10, 1258, "full");

        ArrayList<Car> taxiList = new ArrayList<>();
        taxiList.add(taxi);
        taxiList.add(cabrio);
        taxiList.add(track);
        taxiList.add(minivan);
        taxiList.add(taxi2);

        System.out.println("Taxi park contains " + taxiList.size() + " cars:");
        System.out.println(" Car \t\t" + "Number \t " + "Passengers \t" + "Liters/100km\t\t" + "Tank\t");
        taxiList.forEach(Car::carInfoTable);

        System.out.print('\n');
        for (Car elementOfList : taxiList) {
            try {
                if (elementOfList.getFuelTank().equals("full")) {
                    elementOfList.drive();
                } else {
                    throw new NoFuelException();
                }
            } catch (NoFuelException e) {
                System.out.print(elementOfList.getClass().getSimpleName());
                e.printStackTrace();
            }
        }
        System.out.print("\n");
        StringBuilder carTableString = new StringBuilder("");
        for (Car elementOfList : taxiList) {
            carTableString.append(elementOfList.carInfoString());
        }
        System.out.println("Initial string: " + carTableString);
        CaesarAlgorithm.encodeString(carTableString);
        CaesarAlgorithm.decodeString(carTableString);

    }
}
