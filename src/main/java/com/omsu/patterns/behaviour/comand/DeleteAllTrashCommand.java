package com.omsu.patterns.behaviour.comand;

public class DeleteAllTrashCommand implements INetworkManagerCommand {
    Buffer buffer;

    DeleteAllTrashCommand(Buffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void execute() {
        buffer.resetBufferTrash();
    }
}
