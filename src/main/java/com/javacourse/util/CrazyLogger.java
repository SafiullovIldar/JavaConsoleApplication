package com.javacourse.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CrazyLogger {

    private StringBuilder logger = new StringBuilder();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY : hh-mm - ");

    public void addMessageToLogger(String message){
        logger.append(getFormatDateTime())
                .append(message)
                .append("\n");
    }

    public void printMessages(){
        System.out.println("All messages:" + "\n" + logger);
    }

    public void printMessages(String message){
        String[] strings = logger.toString().split("\n");
        if (logger.indexOf(message) == -1){
            System.out.println("There are no such messages with entry - " + message);
        }else {
            System.out.println("Messages with entry - " + message + ":");
            for (String string : strings) {
                if (string.contains(message)){
                    System.out.println(string);
                }
            }
        }
    }

    private String getFormatDateTime(){
        LocalDateTime now = LocalDateTime.now();
        return now.format(formatter);
    }
}