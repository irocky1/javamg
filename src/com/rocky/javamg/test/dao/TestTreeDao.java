/**
 * 
 */
package com.rocky.javamg.test.dao;

import com.rocky.javamg.common.persistence.TreeDao;
import com.rocky.javamg.common.persistence.annotation.MyBatisDao;
import com.rocky.javamg.test.entity.TestTree;

/**
 * 树结构生成DAO接口
 * 
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestTreeDao extends TreeDao<TestTree> {
	
}