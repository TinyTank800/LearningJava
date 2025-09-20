package app;

import app.exception.InvalidHealthException;

public class Main {

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
            e.printStackTrace();
        } finally {
            System.out.println("Execution completed.");
        }

        try {
            setHealth(-5); // This will throw CUSTOM InvalidHealthException
        } catch (InvalidHealthException e) {
            System.err.println("Invalid health value: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void setHealth(int health) throws InvalidHealthException {
        if (health < 0) {
            throw new InvalidHealthException("Health cannot be negative");
        }
    }
}