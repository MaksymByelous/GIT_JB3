package Lesson7;


import com.sun.org.apache.xml.internal.utils.StringToStringTable;

/**
 * Created by Max on 07.09.2015.
 */
public class TaxiPark {

    int Taxipark [];

    public static void main(String[] args){
        Taxi taxi=new Taxi(4,10,3458);
        Cabrio cabrio=new Cabrio(2,14,8264);
        Track track=new Track(2,25,0000);
        Minivan minivan=new Minivan(8,16,5861);

        System.out.println("Taxi park contains 4 cars:");
        System.out.println("Taxi number is "+taxi.number+" It takes "+taxi.passenger+" passengers and need "
                +taxi.fuelconsumption+" liters of gas per 100km");
        System.out.println("Cabrio number is "+cabrio.number+" It takes "+cabrio.passenger+" passengers and need "
                +cabrio.fuelconsumption+" liters of gas per 100km");
        System.out.println("Track number is " + track.number + " It takes " + track.passenger + " passengers and need "
                + track.fuelconsumption + " liters of gas per 100km");
        System.out.println("Minivan number is " + minivan.number + " It takes " + minivan.passenger + " passengers and need "
                + minivan.fuelconsumption + " liters of gas per 100km");
        System.out.print('\n');

        System.out.print("cabrio ");
        cabrio.ShowNumber();

        cabrio.removeRoof();
        try {
            minivan.removeRoof();
            throw new ParkException();
        } catch (ParkException e){
            e.printStackTrace();
        }
    }
}