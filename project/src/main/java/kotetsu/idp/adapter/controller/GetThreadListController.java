package kotetsu.idp.adapter.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kotetsu.idp.adapter.responsebody.ThreadListResponseBody;
import kotetsu.idp.application.dto.ThreadItem;
import kotetsu.idp.application.usecase.GetThreadListUsecase;

@RestController
public class GetThreadListController {
    private GetThreadListUsecase getThreadListUsecase;

    public GetThreadListController(GetThreadListUsecase getThreadListUsecase) {
        this.getThreadListUsecase = getThreadListUsecase;
    }

    @GetMapping("/api/thread")
    public ResponseEntity<ThreadListResponseBody> handle() {
        List<ThreadItem> threadList = this.getThreadListUsecase.getThreadList();
        return ResponseEntity.ok(new ThreadListResponseBody(threadList));
    }
}
