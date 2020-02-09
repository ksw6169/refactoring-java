package org.corgi.refactoring.chapter9.replacetypecodewithstatestrategy.after_enum;

public class Logger {

    private State state;

    public Logger() {
        this.setState(State.STATE_STOPPED);
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void start() {
        this.getState().start();
        this.setState(State.STATE_LOGGING);
    }

    public void stop() {
        this.getState().stop();
        this.setState(State.STATE_STOPPED);
    }

    public void log(String info) {
        this.getState().log(info);
    }
}
