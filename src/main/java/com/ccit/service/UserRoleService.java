package com.ccit.service;

import com.ccit.dml.UserRole;

/**
 * UserRole的服务接口
 * 
 * @author 
 *
 */
public interface UserRoleService {
	/**
	 * 获得UserRole数据集,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @return
	 */
	String find(UserRole value);
	
	/**
	 * 通过UserRole的id获得UserRole对象
	 * 
	 * @param id
	 * @return
	 */
	String findOne(String id);
	
	/**
	 * 将UserRole中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	String saveNotNull(UserRole value);
	
	/**
	 * 通过UserRole的id更新UserRole中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	String updateNotNullById(UserRole enti);
	
	/**
	 * 通过UserRole的id删除UserRole
	 * 
	 * @param id
	 * @return
	 */
	String deleteById(String id);
}
