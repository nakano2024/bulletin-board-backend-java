
package kotetsu.idp.adapter.responsebody;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import kotetsu.idp.adapter.resource.ThreadListResource;
import kotetsu.idp.application.dto.ThreadItem;
import lombok.Getter;

public class ThreadListResponseBody {
    @Getter
    @JsonProperty("result")
    List<ThreadListResource> result;

    public ThreadListResponseBody(List<ThreadItem> threadList) {
        result = new ArrayList<>();
        threadList.forEach((item) -> {
            result.add(new ThreadListResource(item.getTitle(), item.getImageUrl()));
        });
    }
}
