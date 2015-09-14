package Lesson5;

/**
 * Created by Max on 10.09.2015.
 */
public class Triangle extends Figure {
    double square, base, height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double square() {
        square = (base* height)/2;
        return square;
    }
    @Override
    public String toString() {
        return "Triangle base side is "+base+" and height is "+height+", square is " + square();
    }
}