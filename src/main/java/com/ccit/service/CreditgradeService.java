package com.ccit.service;
import java.util.List;

import com.ccit.service.CreditgradeServiceImpl;
import com.common.Assist;
import com.ccit.dml.Creditgrade;

/**
 * Creditgrade的服务接口
 * 
 * @author 
 *
 */
public interface CreditgradeService {
	/**
	 * 获得Creditgrade数据集,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @return
	 */
	String find(Creditgrade value);
	
	/**
	 * 通过Creditgrade的id获得Creditgrade对象
	 * 
	 * @param id
	 * @return
	 */
	String findOne(String id);
	
	/**
	 * 将Creditgrade中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	String saveNotNull(Creditgrade value);
	
	/**
	 * 通过Creditgrade的id更新Creditgrade中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	String updateNotNullById(Creditgrade enti);
	
	/**
	 * 通过Creditgrade的id删除Creditgrade
	 * 
	 * @param id
	 * @return
	 */
	String deleteById(String id);
}
