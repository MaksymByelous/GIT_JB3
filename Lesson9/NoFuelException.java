package Lesson9;

import java.io.PrintStream;

public class NoFuelException extends Exception {
    @Override
    public void printStackTrace(PrintStream s) {
        System.out.println(" tank is empty, put gas to tank!");
    }
}



