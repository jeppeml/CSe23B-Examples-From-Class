package dk.easv;

public class JeppeException extends Exception{
    public JeppeException() {
    }

    public JeppeException(String message) {
        super(message);
    }

    public JeppeException(String message, Throwable cause) {
        super(message, cause);
    }

    public JeppeException(Throwable cause) {
        super(cause);
    }

    public JeppeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
