/**
 * 
 */
package com.rocky.javamg.modules.act.dao;

import com.rocky.javamg.common.persistence.CrudDao;
import com.rocky.javamg.common.persistence.annotation.MyBatisDao;
import com.rocky.javamg.modules.act.entity.Act;

/**
 * 审批DAO接口
 * 
 * @version 2014-05-16
 */
@MyBatisDao
public interface ActDao extends CrudDao<Act> {

	public int updateProcInsIdByBusinessId(Act act);
	
}
