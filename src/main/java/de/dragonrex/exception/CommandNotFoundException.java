package de.dragonrex.exception;

public class CommandNotFoundException extends RuntimeException {
    private final Throwable cause;

    public CommandNotFoundException(Throwable cause) {
        this.cause = cause;
    }

    public CommandNotFoundException(String message) {
        super(message);
        this.cause = null;
    }

    public CommandNotFoundException() {
        this.cause = null;
    }

    public CommandNotFoundException(String message, Throwable cause) {
        super(message);
        this.cause = cause;
    }

    @Override
    public Throwable getCause() {
        return cause;
    }
}
