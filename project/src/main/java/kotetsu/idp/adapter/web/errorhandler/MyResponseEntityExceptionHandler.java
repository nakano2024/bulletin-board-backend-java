package kotetsu.idp.adapter.web.errorhandler;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import kotetsu.idp.adapter.web.response.CommonErrorResponse;


@RestControllerAdvice
@Order(1)
public class MyResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @Override
    @Nullable
    protected ResponseEntity<Object> handleExceptionInternal(
        Exception exception,
        @Nullable Object body,
        HttpHeaders headers,
        HttpStatusCode status,
        WebRequest request) {
        HttpStatus httpStatus = (HttpStatus)status;
        CommonErrorResponse response = new CommonErrorResponse(
            httpStatus.value(), 
            httpStatus.getReasonPhrase(), 
            exception.getMessage());
        return super.handleExceptionInternal(exception, response, headers, status, request);
    }
}
