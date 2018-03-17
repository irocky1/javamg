/**
 * 
 */
package com.rocky.javamg.test.dao;

import com.rocky.javamg.common.persistence.CrudDao;
import com.rocky.javamg.common.persistence.annotation.MyBatisDao;
import com.rocky.javamg.test.entity.TestDataMain;

/**
 * 主子表生成DAO接口
 * 
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestDataMainDao extends CrudDao<TestDataMain> {
	
}