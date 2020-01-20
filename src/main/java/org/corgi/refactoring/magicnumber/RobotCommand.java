package org.corgi.refactoring.magicnumber;

public class RobotCommand {

    private final String name;

    public RobotCommand(String name) {
        this.name = name;
    }

    public String toString() {
        return "[RobotCommand : "+name+"]";
    }

}
