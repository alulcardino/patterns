package com.omsu.patterns.behaviour.chainofresponsibility;

public class FileLogger extends Logger {
    public FileLogger(int priority) {
        super(priority);
    }

    @Override
    public void writeMessage(String message, int level) {
        if (level <= priority) {
            write(message);
        }
        if (next != null) {
            next.writeMessage(message, level);
        }
    }

    @Override
    void write(String message) {
        System.out.println("Write to file:" + message );
    }
}