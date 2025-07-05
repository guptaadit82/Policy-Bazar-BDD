package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class LoggerHandler {
    private static final Logger logger = Logger.getLogger(LoggerHandler.class);

    static {
        try {
            String logFileName = "logs/logfile_" + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()) + ".log";
            logger.addAppender(new FileAppender(new PatternLayout("%d{ISO8601} %-5p %c - %m%n"), logFileName, true));
        } catch (Exception e) {
            System.err.println("Logger initialization failed: " + e.getMessage());
        }
    }

    /*
     * MethodName: trace
     * AuthorName: Aditya
     * Description: Logs a trace level message.
     * Return Type: void
     * Parameter: String message - the message to be logged.
     */
    public static void trace(String message) {
        logger.trace(message);
    }

    /*
     * MethodName: debug
     * AuthorName: Aditya
     * Description: Logs a debug level message.
     * Return Type: void
     * Parameter: String message - the message to be logged.
     */
    public static void debug(String message) {
        logger.debug(message);
    }

    /*
     * MethodName: info
     * AuthorName: Aditya
     * Description: Logs an info level message.
     * Return Type: void
     * Parameter: String message - the message to be logged.
     */
    public static void info(String message) {
        logger.info(message);
    }

    /**
     * MethodName: warn
     * AuthorName: Aditya
     * Description: Logs a warn level message.
     * Return Type: void
     * Parameter: String message - the message to be logged.
     */
    public static void warn(String message) {
        logger.warn(message);
    }

    /*
     * MethodName: error
     * AuthorName: Aditya
     * Description: Logs an error level message.
     * Return Type: void
     * Parameter: String message - the message to be logged.
     */
    public static void error(String message) {
        logger.error(message);
    }

    /*
     * MethodName: fatal
     * AuthorName: Aditya
     * Description: Logs a fatal level message.
     * Return Type: void
     * Parameter: String message - the message to be logged.
     */
    public static void fatal(String message) {
        logger.fatal(message);
    }
}
