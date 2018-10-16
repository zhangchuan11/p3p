package com.ccit.service;
import java.util.List;

import com.ccit.service.IndexpageServiceImpl;
import com.common.Assist;
import com.ccit.dml.Indexpage;

/**
 * Indexpage的服务接口
 * 
 * @author 
 *
 */
public interface IndexpageService {
	/**
	 * 获得Indexpage数据集,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @return
	 */
	String find(Indexpage value);
	Indexpage find();
	/**
	 * 通过Indexpage的id获得Indexpage对象
	 * 
	 * @param id
	 * @return
	 */
	String findOne(String id);
	
	/**
	 * 将Indexpage中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	String saveNotNull(Indexpage value);
	
	/**
	 * 通过Indexpage的id更新Indexpage中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	String updateNotNullById(Indexpage enti);
	
	/**
	 * 通过Indexpage的id删除Indexpage
	 * 
	 * @param id
	 * @return
	 */
	String deleteById(String id);
}
