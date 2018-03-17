/**
 * 
 */
package com.rocky.javamg.modules.cms.dao;

import com.rocky.javamg.common.persistence.CrudDao;
import com.rocky.javamg.common.persistence.annotation.MyBatisDao;
import com.rocky.javamg.modules.cms.entity.Comment;

/**
 * 评论DAO接口
 * 
 * @version 2013-8-23
 */
@MyBatisDao
public interface CommentDao extends CrudDao<Comment> {

}
