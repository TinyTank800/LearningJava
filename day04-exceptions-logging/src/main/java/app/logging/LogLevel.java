package app.logging;

import java.util.logging.Level;

public enum LogLevel {
    INFO(Level.INFO),
    WARNING(Level.WARNING),
    SEVERE(Level.SEVERE),
    FINE(Level.FINE);

    private final Level javaLevel;

    LogLevel(Level javaLevel) {
        this.javaLevel = javaLevel;
    }

    public Level getJavaLevel() {
        return javaLevel;
    }
}
