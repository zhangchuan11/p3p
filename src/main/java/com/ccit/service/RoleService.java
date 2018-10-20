package com.ccit.service;

import com.ccit.dml.Role;

/**
 * Role的服务接口
 * 
 * @author 
 *
 */
public interface RoleService {
	/**
	 * 获得Role数据集,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @return
	 */
	String find(Role value);
	
	/**
	 * 通过Role的id获得Role对象
	 * 
	 * @param id
	 * @return
	 */
	String findOne(String id);
	
	/**
	 * 将Role中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	String saveNotNull(Role value);
	
	/**
	 * 通过Role的id更新Role中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	String updateNotNullById(Role enti);
	
	/**
	 * 通过Role的id删除Role
	 * 
	 * @param id
	 * @return
	 */
	String deleteById(String id);
}
