package org.example.util;

import java.util.HashSet;
import java.util.Set;

/**
 * The purpose of this factory class is to ensure that we never create
 * 2 loggers that have the exact same parameters (the class that it came from, the filename)
 */
public class LoggerFactory {
    private LoggerFactory() {

    }
    private static Set<CustomLogger> existingLoggers = new HashSet<>();

    /**
     * This method returns the logger associates with that className or creates a new one (if none exists for the class)
     * @param className - the className with which the logger is associated
     * @return - the desired logger object
     */
    public static CustomLogger getLogger(String className, String fileName) {
        // create a "dummy" logger to use in matching against the set of existing loggers
        // TODO: ensure this logger gets cleaned up
        CustomLogger customLogger = new CustomLogger(className, fileName);
        if(!existingLoggers.contains(customLogger)) existingLoggers.add(customLogger);

        // return logic
        for(CustomLogger customLoggerItr: existingLoggers) {
            if(customLoggerItr.equals(customLogger)) return customLoggerItr;
        }
        return null;
    }

    // TODO: Implement a method that takes in a className and a fileName
    // Ensure that no two loggers can have the same className and fileName
    // but for a given class, there could be multiple loggers as long as the point to different data sources
}
