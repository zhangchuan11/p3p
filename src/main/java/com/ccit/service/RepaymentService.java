package com.ccit.service;

import com.ccit.dml.Repayment;

/**
 * Repayment的服务接口
 * 
 * @author 
 *
 */
public interface RepaymentService {
	/**
	 * 获得Repayment数据集,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @return
	 */
	String find(Repayment value);
	
	/**
	 * 通过Repayment的id获得Repayment对象
	 * 
	 * @param id
	 * @return
	 */
	String findOne(String id);
	
	/**
	 * 将Repayment中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	String saveNotNull(Repayment value);
	
	/**
	 * 通过Repayment的id更新Repayment中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	String updateNotNullById(Repayment enti);
	
	/**
	 * 通过Repayment的id删除Repayment
	 * 
	 * @param id
	 * @return
	 */
	String deleteById(String id);
}
