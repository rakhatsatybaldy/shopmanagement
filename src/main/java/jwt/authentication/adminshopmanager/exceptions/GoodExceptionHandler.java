package jwt.authentication.adminshopmanager.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class GoodExceptionHandler {
    @ExceptionHandler(value = {GoodRequestException.class})
    public ResponseEntity<Object> handleApiRequestException(GoodRequestException e){
        HttpStatus notFound = HttpStatus.NOT_FOUND;
        GoodException goodException = new GoodException(
                e.getMessage(),
                notFound,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(goodException, notFound);
    }
}
