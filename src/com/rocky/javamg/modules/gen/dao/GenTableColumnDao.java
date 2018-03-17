/**
 * 
 */
package com.rocky.javamg.modules.gen.dao;

import com.rocky.javamg.common.persistence.CrudDao;
import com.rocky.javamg.common.persistence.annotation.MyBatisDao;
import com.rocky.javamg.modules.gen.entity.GenTable;
import com.rocky.javamg.modules.gen.entity.GenTableColumn;

/**
 * 业务表字段DAO接口
 * 
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenTableColumnDao extends CrudDao<GenTableColumn> {
	
	public void deleteByGenTableId(GenTable genTable);
}
