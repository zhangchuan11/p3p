package com.ccit.service;
import java.util.List;

import com.ccit.service.BorrowingServiceImpl;
import com.common.Assist;
import com.ccit.dml.Borrowing;

/**
 * Borrowing的服务接口
 * 
 * @author 
 *
 */
public interface BorrowingService {
	/**
	 * 获得Borrowing数据集,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @return
	 */
	String find(Borrowing value);
	
	/**
	 * 通过Borrowing的id获得Borrowing对象
	 * 
	 * @param id
	 * @return
	 */
	String findOne(String id);
	
	/**
	 * 将Borrowing中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	String saveNotNull(Borrowing value);
	
	/**
	 * 通过Borrowing的id更新Borrowing中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	String updateNotNullById(Borrowing enti);
	
	/**
	 * 通过Borrowing的id删除Borrowing
	 * 
	 * @param id
	 * @return
	 */
	String deleteById(String id);
}
