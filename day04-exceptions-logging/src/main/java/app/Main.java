package app;

import app.exception.InvalidHealthException;
import app.logging.*;

public class Main {

    public static void main(String[] args) {
        try {
            LoggerUtil.log(LogLevel.INFO, "Application started");
            int result = 10 / 0; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            LoggerUtil.log(LogLevel.SEVERE, "Arithmetic error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }

        try {
            setHealth(-5); // This will throw CUSTOM InvalidHealthException
        } catch (InvalidHealthException e) {
            LoggerUtil.log(LogLevel.SEVERE,"Invalid health value: " + e.getMessage());
        }

        LoggerUtil.log(LogLevel.INFO, "Application finished");
    }

    public static void setHealth(int health) throws InvalidHealthException {
        if (health < 0) {
            throw new InvalidHealthException("Health cannot be negative");
        }
    }
}