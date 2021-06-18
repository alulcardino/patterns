package com.omsu.patterns.behaviour.state;

public class TV {
    Channel channel;

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    void nextChannel() {
        if (channel instanceof Russia24) {
            setChannel(new TNT());
        } else if (channel instanceof TNT) {
            setChannel(new STS());
        } else if (channel instanceof STS) {
            setChannel(new Russia24());
        }
    }

    void play() {
        channel.play();
    }
}
