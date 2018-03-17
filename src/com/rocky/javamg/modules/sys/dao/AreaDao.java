/**
 * 
 */
package com.rocky.javamg.modules.sys.dao;

import com.rocky.javamg.common.persistence.TreeDao;
import com.rocky.javamg.common.persistence.annotation.MyBatisDao;
import com.rocky.javamg.modules.sys.entity.Area;

/**
 * 区域DAO接口
 * 
 * @version 2014-05-16
 */
@MyBatisDao
public interface AreaDao extends TreeDao<Area> {
	
}
