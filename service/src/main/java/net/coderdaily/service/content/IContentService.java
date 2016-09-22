package net.coderdaily.service.content;

import net.coderdaily.bean.content.ContentEntity;

import java.util.List;

/**
 * Author: sunyukun.china@gmail.com
 * Time: 2016/9/21 22:34
 * Blog: coderdaily.net
 */
public interface IContentService {
    List<ContentEntity> findAll();
}
