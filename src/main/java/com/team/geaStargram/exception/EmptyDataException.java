package com.team.geaStargram.exception;

public class EmptyDataException extends RuntimeException {
    public EmptyDataException() {
        super();
    }

    public EmptyDataException(String message) {
        super(message);
    }

    public EmptyDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyDataException(Throwable cause) {
        super(cause);
    }

    protected EmptyDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
