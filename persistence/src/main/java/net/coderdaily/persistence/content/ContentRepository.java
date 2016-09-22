package net.coderdaily.persistence.content;

import net.coderdaily.bean.content.ContentEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Author: sunyukun.china@gmail.com
 * Time: 2016/9/21 22:34
 * Blog: coderdaily.net
 */
public interface ContentRepository extends CrudRepository<ContentEntity,Long>{
    List<ContentEntity> findAll();
}
