package org.corgi.refactoring.chapter10.replaceErrorCodeWithException.after;

public class InvalidCommandException extends Exception {

    public InvalidCommandException(String name) {
        super(name);
    }

    public InvalidCommandException() {

    }
}
