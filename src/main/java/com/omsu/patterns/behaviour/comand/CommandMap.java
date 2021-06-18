package com.omsu.patterns.behaviour.comand;

import java.util.HashMap;
import java.util.Map;

public class CommandMap {
    Map<String, INetworkManagerCommand> hashMap;
    IgnoreCommand ignoreCommand;

    public CommandMap(Buffer buffer) {
        ignoreCommand = new IgnoreCommand(buffer);
        hashMap = new HashMap<>();
        hashMap.put("MESSAGE", new AddCommand(buffer));
        hashMap.put("TRASH", ignoreCommand);
        hashMap.put("SUPER_TRASH", new DeleteAllTrashCommand(buffer));
        hashMap.put("MESSAGE_START", new StartCommand(buffer));
        hashMap.put("MESSAGE_FINISH", new StopCommand(buffer));
    }

    public INetworkManagerCommand getCommand(String type, String state) {
        if (state.equals("TRASH_SUSPICION") && type.equals("TRASH")) {
            return hashMap.get("MESSAGE_FINISH");
        }
        return hashMap.getOrDefault(type, ignoreCommand);
    }
}
