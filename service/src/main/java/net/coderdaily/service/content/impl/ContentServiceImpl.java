package net.coderdaily.service.content.impl;

import net.coderdaily.bean.content.ContentEntity;
import net.coderdaily.persistence.content.ContentRepository;
import net.coderdaily.service.content.IContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: sunyukun.china@gmail.com
 * Time: 2016/9/22 23:09
 * Blog: coderdaily.net
 */
@Service
public class ContentServiceImpl implements IContentService {
    @Autowired
    private ContentRepository contentRepository;

    @Override
    public List<ContentEntity> findAll() {
        return contentRepository.findAll();
    }
}
