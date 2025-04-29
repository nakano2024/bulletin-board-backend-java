
package kotetsu.idp.application.usecase;

import java.util.List;

import org.springframework.stereotype.Service;

import kotetsu.idp.application.dto.ThreadItem;
import kotetsu.idp.application.queryservice.IGetThreadListQueryService;

@Service
public class GetThreadListUsecase {
    IGetThreadListQueryService getThreadListQueryService;

    public GetThreadListUsecase(IGetThreadListQueryService getThreadListQueryService) {
        this.getThreadListQueryService = getThreadListQueryService;
    }

    public List<ThreadItem> getThreadList() {
        List<ThreadItem> threadList = getThreadListQueryService.getThreadListOrderByCreatedAtDescLimit100();
        return threadList;
    }
}
