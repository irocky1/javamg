/**
 * 
 */
package com.rocky.javamg.modules.gen.dao;

import com.rocky.javamg.common.persistence.CrudDao;
import com.rocky.javamg.common.persistence.annotation.MyBatisDao;
import com.rocky.javamg.modules.gen.entity.GenTable;

/**
 * 业务表DAO接口
 * 
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenTableDao extends CrudDao<GenTable> {
	
}
