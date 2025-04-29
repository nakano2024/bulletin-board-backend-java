package kotetsu.idp.adapter.web.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommonErrorResponse {
    @JsonProperty("status_code")
    int statusCode;

    @JsonProperty("error")
    String error;

    @JsonProperty("message")
    String message;
}
