package com.ccit.dao;
import java.util.List;

import com.ccit.dml.Borrowing;
import com.common.Assist;

import org.apache.ibatis.annotations.Param;
/**
 * Borrowing的Dao接口
 * 
 * @author 
 *
 */
public interface BorrowingMapper {

	/**
	 * 获得Borrowing数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getBorrowingRowCount(Assist assist);
	
	/**
	 * 获得Borrowing数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<Borrowing> selectBorrowing(Assist assist);
	/**
	 * 通过Borrowing的id获得Borrowing对象
	 * 
	 * @param id
	 * @return
	 */
	Borrowing selectBorrowingById(String id);
	
	/**
	 * 获得一个Borrowing对象,以参数Borrowing对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	Borrowing selectBorrowingObjSingle(Borrowing obj);
	
	/**
	 * 获得一个Borrowing对象,以参数Borrowing对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<Borrowing> selectBorrowingByObj(Borrowing obj);

	/**
	 * 插入Borrowing到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertBorrowing(Borrowing value);
	
	/**
	 * 插入Borrowing中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullBorrowing(Borrowing value);
	
	/**
	 * 批量插入Borrowing到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertBorrowingByBatch(List<Borrowing> value);
	/**
	 * 通过Borrowing的id删除Borrowing
	 * 
	 * @param id
	 * @return
	 */
	int deleteBorrowingById(String id);
	
	/**
	 * 通过辅助工具Assist的条件删除Borrowing
	 * 
	 * @param assist
	 * @return
	 */
	int deleteBorrowingByAssist(Assist assist);
	
	/**
	 * 通过Borrowing的id更新Borrowing中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateBorrowingById(Borrowing enti);
	
	/**
	 * 通过Borrowing的id更新Borrowing中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullBorrowingById(Borrowing enti);
	
	/**
	 * 通过辅助工具Assist的条件更新Borrowing中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateBorrowing(@Param("enti") Borrowing value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新Borrowing中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullBorrowing(@Param("enti") Borrowing value, @Param("assist") Assist assist);
}