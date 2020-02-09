package org.corgi.refactoring.chapter9.replaceTypeCodeWithStateStrategy.before;

public class Logger {

    public static final int STATE_STOPPED = 0;
    public static final int STATE_LOGGING = 1;
    private int state;

    public Logger() {
        this.state = Logger.STATE_STOPPED;
    }

    public void start() {

        switch (this.state) {
            case STATE_STOPPED:
                System.out.println("** START LOGGING **");
                this.state = STATE_LOGGING;
                break;
            case STATE_LOGGING:
                /* 아무것도 하지 않음 */
                break;
            default:
                System.out.println("Invalid state: " + state);
        }
    }


    public void stop() {

        switch (this.state) {
            case STATE_STOPPED:
                /* 아무것도 하지 않음 */
                break;
            case STATE_LOGGING:
                System.out.println("** STOP LOGGING **");
                this.state = STATE_STOPPED;
                break;
            default:
                System.out.println("Invalid state: " + state);
        }
    }


    public void log(String info) {

        switch (this.state) {
            case STATE_STOPPED:
                System.out.println("Ignoring: " + info);
                break;
            case STATE_LOGGING:
                System.out.println("Logging: " + info);
                break;
            default:
                System.out.println("Invalid state: " + this.state);
        }
    }
}
