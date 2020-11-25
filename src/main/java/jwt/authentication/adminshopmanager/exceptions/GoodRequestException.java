package jwt.authentication.adminshopmanager.exceptions;

public class GoodRequestException extends RuntimeException{
    public GoodRequestException(String message) {
        super(message);
    }

    public GoodRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
