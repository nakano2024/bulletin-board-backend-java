package kotetsu.idp.adapter.web.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommonResponse<T> {
    @JsonProperty("status_code")
    int statusCode;

    @JsonProperty("result")
    T result;
}
