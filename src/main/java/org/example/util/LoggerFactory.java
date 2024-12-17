package org.example.util;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * The purpose of this factory class is to ensure that we never create
 * 2 loggers that have the exact same parameters (the class that it came from, the filename)
 */
public class LoggerFactory {
    private LoggerFactory() {

    }
    private static Map<String, CustomLogger> existingLoggers = new HashMap<>();

    /**
     * This method returns the logger associates with that className or creates a new one (if none exists for the class)
     * @param className - the className with which the logger is associated
     * @return - the desired logger object
     */
    public static CustomLogger getLogger(String className) {
        // if this className already has a corresponding logger, just return that logger
        if(existingLoggers.containsKey(className)) return existingLoggers.get(className);
        else {
            CustomLogger logger = new CustomLogger(className);
            existingLoggers.put(className, logger);
            return logger;
        }
    }

    // TODO: Implement a method that takes in a className and a fileName
    // Ensure that no two loggers can have the same className and fileName
    // but for a given class, there could be multiple loggers as long as the point to different data sources
}
