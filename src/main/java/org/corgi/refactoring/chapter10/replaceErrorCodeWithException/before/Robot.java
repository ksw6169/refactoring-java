package org.corgi.refactoring.chapter10.replaceErrorCodeWithException.before;

import java.util.StringTokenizer;

public class Robot {

    private final String name;
    private final Position position = new Position(0, 0);
    private final Direction direction = new Direction(0, 1);


    public Robot(String name) {
        this.name = name;
    }


    public void execute(String commandSequence) {

        StringTokenizer tokenizer = new StringTokenizer(commandSequence);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();

            if (!executeCommand(token)) {
                System.out.println("Invalid command: " + token);
                break;
            }
        }
    }


    public boolean executeCommand(String commandString) {

        Command command = Command.parseCommand(commandString);

        if (command == null) {
            return false;
        }

        return executeCommand(command);
    }


    public boolean executeCommand(Command command) {

        if (command == Command.FORWARD) {
            this.position.relativeMove(this.direction.x, this.direction.y);
        } else if (command == Command.BACKWARD) {
            this.position.relativeMove(-this.direction.x, -this.direction.y);
        } else if (command == Command.TURN_LEFT) {
            this.direction.setDirection(-this.direction.y, this.direction.x);
        } else if (command == Command.TURN_RIGHT) {
            this.direction.setDirection(this.direction.y, -this.direction.x);
        } else {
            return false;   // 에러 전파
        }

        return true;
    }


    public String toString() {

        StringBuffer strBuf = new StringBuffer();
        strBuf.append("[Robot : ");
        strBuf.append(this.name);
        strBuf.append(" position(");
        strBuf.append(this.position.x);
        strBuf.append(", ");
        strBuf.append(this.position.y);
        strBuf.append("), direction(");
        strBuf.append(this.direction.x);
        strBuf.append(", ");
        strBuf.append(this.direction.y);
        strBuf.append(")]");

        return strBuf.toString();
    }
}
