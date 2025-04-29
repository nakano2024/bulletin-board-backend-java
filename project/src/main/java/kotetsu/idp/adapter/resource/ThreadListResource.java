
package kotetsu.idp.adapter.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ThreadListResource {
    @Getter
    @JsonProperty("title")
    String title;

    @Getter
    @JsonProperty("image_url")
    String imageUrl;
}
