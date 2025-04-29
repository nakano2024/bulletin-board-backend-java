package kotetsu.idp.adapter.web.errorhandler;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import kotetsu.idp.adapter.web.response.CommonErrorResponse;

@RestControllerAdvice
@Order(2)
public class InternalServerErrorHandler {
    @ExceptionHandler({Exception.class}) 
    public ResponseEntity<?> handleAll(Exception exception) {
        exception.printStackTrace();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new CommonErrorResponse(
            HttpStatus.INTERNAL_SERVER_ERROR.value(),
            HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),
            exception.getMessage()));
    }
}
