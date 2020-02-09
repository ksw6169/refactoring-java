package org.corgi.refactoring.chapter10.replaceErrorCodeWithException.after;

import java.util.HashMap;
import java.util.Map;

public abstract class Command {

    public static final Command FORWARD = new Command("forward") {
        @Override
        public void execute(Robot robot) {
            robot.forward();
        }
    };

    public static final Command BACKWARD = new Command("backward") {
        @Override
        public void execute(Robot robot) {
            robot.backward();
        }
    };

    public static final Command TURN_LEFT = new Command("left") {
        @Override
        public void execute(Robot robot) {
            robot.left();
        }
    };

    public static final Command TURN_RIGHT = new Command("right") {
        @Override
        public void execute(Robot robot) {
            robot.right();
        }
    };


    private static final Map<String, Command> commandNameMap = new HashMap<>();
    private final String name;

    static {
        commandNameMap.put(FORWARD.name, FORWARD);      // ["forward", new Command("forward")]
        commandNameMap.put(BACKWARD.name, BACKWARD);
        commandNameMap.put(TURN_LEFT.name, TURN_LEFT);
        commandNameMap.put(TURN_RIGHT.name, TURN_RIGHT);
    }

    protected Command(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Command parseCommand(String name) throws InvalidCommandException {

        if (!commandNameMap.containsKey(name)) {
            throw new InvalidCommandException(name);
        }

        return commandNameMap.get(name);
    }


    public abstract void execute(Robot robot);
}
