package app.exception;

public class InvalidHealthException extends RuntimeException {
    public InvalidHealthException(String message) {
        super(message);
    }
}
