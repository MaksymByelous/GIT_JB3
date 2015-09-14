package Lesson5;

/**
 * Created by Max on 10.09.2015.
 */
public class Rectangle extends Figure{
    double square;
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double square() {
        square = a * b;
        return square;
    }
}