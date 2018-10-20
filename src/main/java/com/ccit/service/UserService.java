package com.ccit.service;

import com.ccit.dml.User;

/**
 * User的服务接口
 * 
 * @author 
 *
 */
public interface UserService {
	/**
	 * 获得User数据集,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @return
	 */
	String find(User value);
	
	/**
	 * 通过User的id获得User对象
	 * 
	 * @param id
	 * @return
	 */
	String findOne(String id);
	
	/**
	 * 将User中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	String saveNotNull(User value);
	
	/**
	 * 通过User的id更新User中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	String updateNotNullById(User enti);
	
	/**
	 * 通过User的id删除User
	 * 
	 * @param id
	 * @return
	 */
	String deleteById(String id);
}
