package Lesson4;

import java.util.Scanner;

/**
 * Created by Max on 07.09.2015.
 */
public class TaxiPark {

    int Taxipark [];

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        Taxi taxi=new Taxi(4,10,3458);
        Cabrio cabrio=new Cabrio(2,14,8264);
        Track track=new Track(2,25,1125);
        Minivan minivan=new Minivan(8,16,5861);


        taxi.ShowNumber();
        cabrio.ShowNumber();
        track.ShowNumber();
        minivan.ShowNumber();





    }
}