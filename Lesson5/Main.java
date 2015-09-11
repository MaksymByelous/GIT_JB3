package Lesson5;

import java.util.Scanner;

/**
 * Created by Max on 10.09.2015.
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Circle circle = new Circle(0);
        System.out.println("input circle radius");
        circle.radius=sc.nextDouble();
        Triangle triangle = new Triangle(3, 4, 5);
        Rectangle rectangle = new Rectangle(2.89, 8);

        System.out.println("Circle radius is " + circle.radius+" and square is  "+circle.square());
        System.out.println("Triangle sides are " + triangle.a+", "+triangle.b+", "+triangle.c+" and square is  "+triangle.square());
        System.out.println("Rectangle sides are " + rectangle.a+", "+rectangle.b+" and square is  "+rectangle.square());

    }
}