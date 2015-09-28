package Lesson7;

import java.io.PrintStream;

public class ParkException extends Exception {

    @Override
    public void printStackTrace(PrintStream s) {
        System.err.println("we cars");
    }
}
