package org.corgi.refactoring.chapter1.magicnumber;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot("Andrew");
        robot.order(Robot.COMMAND_WALK);
        robot.order(Robot.COMMAND_STOP);
        robot.order(Robot.COMMAND_JUMP);
    }
}