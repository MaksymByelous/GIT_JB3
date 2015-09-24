package Lesson7;

import java.io.PrintStream;

/**
 * Created by Max on 24.09.2015.
 */
public class ParkException extends Exception {

    @Override
    public void printStackTrace(PrintStream s) {
        System.err.println("its no convertible");
    }
}
