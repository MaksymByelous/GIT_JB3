package Lesson5;

/**
 * Created by Max on 10.09.2015.
 */
public class Triangle extends Figure {
    double square;
    double a;
    double b;
    double c;
    double p = ((a + b + c) / 2);

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double square() {
        square = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
        return square;
    }
}