package Lesson7;

import java.io.PrintStream;

public class ParkException extends Exception {

    @Override
    public void printStackTrace(PrintStream s) {
        System.err.println("some tank is empty, put gas to tank!");
    }
}