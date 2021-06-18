package com.omsu.patterns.behaviour.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Logger smsLogger = new SMSLogger(Level.Error);
        Logger fileLogger = new FileLogger(Level.Debug);
        Logger emailLogger = new EmailLogger(Level.Debug);

        smsLogger.setNext(fileLogger);
        fileLogger.setNext(emailLogger);
    }
}
