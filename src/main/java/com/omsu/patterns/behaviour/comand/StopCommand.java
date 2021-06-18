package com.omsu.patterns.behaviour.comand;

public class StopCommand implements INetworkManagerCommand {
    Buffer buffer;

    StopCommand(Buffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void execute() {
       buffer.resetBuffer();
    }
}
