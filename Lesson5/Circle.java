package Lesson5;

/**
 * Created by Max on 10.09.2015.
 */
public class Circle extends Figure{
    double radius;
    double square;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double square() {
        square = radius * radius * Math.PI;
        return square;
    }
}
