
package kotetsu.idp.adapter.queryservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Tuple;
import jakarta.persistence.TypedQuery;
import kotetsu.idp.application.dto.ThreadItem;
import kotetsu.idp.application.queryservice.IGetThreadListQueryService;

@Component
public class GetThreadListQueryService implements IGetThreadListQueryService {
    EntityManager entityManager;

    public GetThreadListQueryService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<ThreadItem> getThreadListOrderByCreatedAtDescLimit100() {
        String sql = """
            select title, files.url as image_url from threads 
            left outer join files on threads.image_file_code = files.code 
            order by threads.created_at desc limit 100
        """;

        List<Tuple> resultList = entityManager.createNativeQuery(sql, Tuple.class)
            .getResultList();

        List<ThreadItem> threadList = new ArrayList<>();
        resultList.forEach(item -> {
            threadList.add(new ThreadItem(item.get("title", String.class), item.get("image_url", String.class)));
        });
        return threadList;
    }
}
