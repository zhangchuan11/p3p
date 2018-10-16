package com.ccit.service;
import java.util.List;

import com.ccit.service.BorrowproductServiceImpl;
import com.common.Assist;
import com.ccit.dml.Borrowproduct;

/**
 * Borrowproduct的服务接口
 * 
 * @author 
 *
 */
public interface BorrowproductService {
	/**
	 * 获得Borrowproduct数据集,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @return
	 */
	String find(Borrowproduct value);
	
	/**
	 * 通过Borrowproduct的id获得Borrowproduct对象
	 * 
	 * @param id
	 * @return
	 */
	String findOne(String id);
	
	/**
	 * 将Borrowproduct中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	String saveNotNull(Borrowproduct value);
	
	/**
	 * 通过Borrowproduct的id更新Borrowproduct中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	String updateNotNullById(Borrowproduct enti);
	
	/**
	 * 通过Borrowproduct的id删除Borrowproduct
	 * 
	 * @param id
	 * @return
	 */
	String deleteById(String id);
}
