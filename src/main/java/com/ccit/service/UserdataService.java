package com.ccit.service;
import java.util.List;

import com.ccit.service.UserdataServiceImpl;
import com.common.Assist;
import com.ccit.dml.Userdata;

/**
 * Userdata的服务接口
 * 
 * @author 
 *
 */
public interface UserdataService {
	/**
	 * 获得Userdata数据集,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @return
	 */
	String find(Userdata value);
	
	/**
	 * 通过Userdata的id获得Userdata对象
	 * 
	 * @param id
	 * @return
	 */
	String findOne(String id);
	
	/**
	 * 将Userdata中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	String saveNotNull(Userdata value);
	
	/**
	 * 通过Userdata的id更新Userdata中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	String updateNotNullById(Userdata enti);
	
	/**
	 * 通过Userdata的id删除Userdata
	 * 
	 * @param id
	 * @return
	 */
	String deleteById(String id);
}
