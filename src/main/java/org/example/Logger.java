package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    protected int num = 1;

    public void log(String msg) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        String formattedLocalDateTime = localDateTime.format(myFormat);
        System.out.println("[" + formattedLocalDateTime + " " + num++ + "] " + msg);
    }

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
}
