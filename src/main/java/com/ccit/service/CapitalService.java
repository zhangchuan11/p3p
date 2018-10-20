package com.ccit.service;

import com.ccit.dml.Capital;

/**
 * Capital的服务接口
 * 
 * @author 
 *
 */
public interface CapitalService {
	/**
	 * 获得Capital数据集,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @return
	 */
	String find(Capital value);
	
	/**
	 * 通过Capital的id获得Capital对象
	 * 
	 * @param id
	 * @return
	 */
	String findOne(String id);
	
	/**
	 * 将Capital中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	String saveNotNull(Capital value);
	
	/**
	 * 通过Capital的id更新Capital中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	String updateNotNullById(Capital enti);
	
	/**
	 * 通过Capital的id删除Capital
	 * 
	 * @param id
	 * @return
	 */
	String deleteById(String id);
}
