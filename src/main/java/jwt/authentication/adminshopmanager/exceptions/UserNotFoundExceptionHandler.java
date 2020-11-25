package jwt.authentication.adminshopmanager.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class UserNotFoundExceptionHandler {
    @ExceptionHandler(value = {UserRequestException.class})
    public ResponseEntity<Object> handleApiRequestException(UserRequestException e){
        HttpStatus notFound = HttpStatus.NOT_FOUND;
        GoodException goodException = new GoodException(
                e.getMessage(),
                notFound,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(goodException, notFound);
    }
}
