package com.omsu.patterns.behaviour.comand;

public class IgnoreCommand implements INetworkManagerCommand {
    Buffer buffer;

    IgnoreCommand(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void execute() {
        buffer.setNull();
    }
}
