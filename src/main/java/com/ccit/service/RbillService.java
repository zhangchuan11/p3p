package com.ccit.service;
import java.util.List;

import com.ccit.service.RbillServiceImpl;
import com.common.Assist;
import com.ccit.dml.Rbill;

/**
 * Rbill的服务接口
 * 
 * @author 
 *
 */
public interface RbillService {
	/**
	 * 获得Rbill数据集,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @return
	 */
	String find(Rbill value);
	
	
	/**
	 * 将Rbill中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	String saveNotNull(Rbill value);
	
}
