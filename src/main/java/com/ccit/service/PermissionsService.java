package com.ccit.service;

import com.ccit.dml.Permissions;

/**
 * Permissions的服务接口
 * 
 * @author 
 *
 */
public interface PermissionsService {
	/**
	 * 获得Permissions数据集,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @return
	 */
	String find(Permissions value);
	
	/**
	 * 通过Permissions的id获得Permissions对象
	 * 
	 * @param id
	 * @return
	 */
	String findOne(String id);
	
	/**
	 * 将Permissions中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	String saveNotNull(Permissions value);
	
	/**
	 * 通过Permissions的id更新Permissions中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	String updateNotNullById(Permissions enti);
	
	/**
	 * 通过Permissions的id删除Permissions
	 * 
	 * @param id
	 * @return
	 */
	String deleteById(String id);

    /**
     * 查询角色权限
     */
    String Selectpermissions(String id);
}
