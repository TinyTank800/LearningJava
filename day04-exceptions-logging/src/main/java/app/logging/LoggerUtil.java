package app.logging;

import java.util.logging.Logger;

public class LoggerUtil {
    private static final Logger LOGGER = Logger.getLogger("LearningLogger");

    public static void log(LogLevel level, String message) {
        LOGGER.log(level.getJavaLevel(), message);
    }
}
