/**
 * 
 */
package com.thinkgem.javamg.test.dao;

import com.thinkgem.javamg.common.persistence.CrudDao;
import com.thinkgem.javamg.common.persistence.annotation.MyBatisDao;
import com.thinkgem.javamg.test.entity.TestDataMain;

/**
 * 主子表生成DAO接口
 * 
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestDataMainDao extends CrudDao<TestDataMain> {
	
}