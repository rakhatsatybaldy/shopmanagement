package jwt.authentication.adminshopmanager.exceptions;

public class UserRequestException extends RuntimeException{
    public UserRequestException(String message) {
        super(message);
    }

    public UserRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
