package com.ccit.service;
import java.util.List;

import com.ccit.service.BillServiceImpl;
import com.common.Assist;
import com.ccit.dml.Bill;

/**
 * Bill的服务接口
 * 
 * @author 
 *
 */
public interface BillService {
	/**
	 * 获得Bill数据集,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @return
	 */
	String find(Bill value);
	
	
	/**
	 * 将Bill中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	String saveNotNull(Bill value);
	
}
