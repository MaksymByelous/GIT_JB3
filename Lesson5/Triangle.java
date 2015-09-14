package Lesson5;

/**
 * Created by Max on 10.09.2015.
 */
public class Triangle extends Figure {
    double square;
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double square() {
        square = (base* height)/2;
        return square;
    }
}