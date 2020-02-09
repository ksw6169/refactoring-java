package org.corgi.refactoring.chapter10.replaceErrorCodeWithException.before;

import org.corgi.refactoring.chapter10.replaceErrorCodeWithException.after.InvalidCommandException;

import java.util.HashMap;
import java.util.Map;

public class Command {

    public static final Command FORWARD = new Command("forward");
    public static final Command BACKWARD = new Command("backward");
    public static final Command TURN_LEFT = new Command("left");
    public static final Command TURN_RIGHT = new Command("right");

    private static final Map<String, Command> commandNameMap = new HashMap<>();
    private final String name;

    static {
        commandNameMap.put(FORWARD.name, FORWARD);      // ["forward", new Command("forward")]
        commandNameMap.put(BACKWARD.name, BACKWARD);
        commandNameMap.put(TURN_LEFT.name, TURN_LEFT);
        commandNameMap.put(TURN_RIGHT.name, TURN_RIGHT);
    }

    private Command(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Command parseCommand(String name) {

        if (!commandNameMap.containsKey(name)) {
            return null;
        }

        return commandNameMap.get(name);
    }
}
