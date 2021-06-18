package com.omsu.patterns.behaviour.comand;

public class AddCommand implements INetworkManagerCommand {
    Buffer buffer;

    AddCommand(Buffer buffer) {
        this.buffer = buffer;
    }

    public void execute() {
        buffer.addString();
    }
}
