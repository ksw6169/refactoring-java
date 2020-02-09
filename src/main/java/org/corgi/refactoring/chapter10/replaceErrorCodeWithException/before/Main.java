package org.corgi.refactoring.chapter10.replaceErrorCodeWithException.before;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot("Andrew");
        System.out.println(robot.toString());

        robot.execute("forward right forward");
        System.out.println(robot.toString());

        robot.execute("left backward left forward");
        System.out.println(robot.toString());

        robot.execute("right forward forward farvard");
        System.out.println(robot.toString());
    }
}
