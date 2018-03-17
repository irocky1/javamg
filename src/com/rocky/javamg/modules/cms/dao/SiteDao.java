/**
 * 
 */
package com.rocky.javamg.modules.cms.dao;

import com.rocky.javamg.common.persistence.CrudDao;
import com.rocky.javamg.common.persistence.annotation.MyBatisDao;
import com.rocky.javamg.modules.cms.entity.Site;

/**
 * 站点DAO接口
 * 
 * @version 2013-8-23
 */
@MyBatisDao
public interface SiteDao extends CrudDao<Site> {

}
