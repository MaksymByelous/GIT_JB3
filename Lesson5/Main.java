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
        Triangle triangle = new Triangle(3, 5);
        Rectangle rectangle = new Rectangle(2.89, 8);

        System.out.println(circle);
        System.out.println(triangle);
        System.out.println(rectangle);
    }
}