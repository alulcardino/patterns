package com.omsu.patterns.behaviour.comand;

public class StartCommand implements INetworkManagerCommand {
    Buffer buffer;

    StartCommand(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void execute() {
        buffer.addStartString();
    }
}
