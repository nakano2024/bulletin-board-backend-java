package kotetsu.idp.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ThreadItem {
    @Getter
    private String title;

    @Getter
    private String imageUrl;
}
