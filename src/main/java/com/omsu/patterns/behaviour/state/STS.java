package com.omsu.patterns.behaviour.state;

public class STS implements Channel{
    @Override
    public void play() {
        System.out.println("STS is now");
    }
}
