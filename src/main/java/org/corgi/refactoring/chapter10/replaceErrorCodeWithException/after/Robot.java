package org.corgi.refactoring.chapter10.replaceErrorCodeWithException.after;

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

        try {
            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                executeCommand(token);
            }
        } catch (InvalidCommandException e) {
            System.out.println("Invalid command: " + e.getMessage());
        }
    }


    public void executeCommand(String commandString) throws InvalidCommandException {

        Command command = Command.parseCommand(commandString);
        command.execute(this);
    }

    public void forward() {
        this.position.relativeMove(this.direction.x, this.direction.y);
    }

    public void backward() {
        this.position.relativeMove(-this.direction.x, -this.direction.y);
    }

    public void left() {
        this.direction.setDirection(-this.direction.y, this.direction.x);
    }

    public void right() {
        this.direction.setDirection(this.direction.y, -this.direction.x);
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
