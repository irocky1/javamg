/**
 * 
 */
package com.rocky.javamg.modules.cms.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rocky.javamg.common.service.CrudService;
import com.rocky.javamg.modules.cms.dao.ArticleDataDao;
import com.rocky.javamg.modules.cms.entity.ArticleData;

/**
 * 站点Service
 * 
 * @version 2013-01-15
 */
@Service
@Transactional(readOnly = true)
public class ArticleDataService extends CrudService<ArticleDataDao, ArticleData> {

}
