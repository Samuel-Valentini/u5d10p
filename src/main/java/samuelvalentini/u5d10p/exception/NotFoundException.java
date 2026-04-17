package samuelvalentini.u5d10p.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super("Record not found in the database: " + message);
    }
}
