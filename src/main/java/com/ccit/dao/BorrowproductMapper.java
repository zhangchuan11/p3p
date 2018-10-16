package com.ccit.dao;
import java.util.List;

import com.common.Assist;
import com.ccit.dml.Borrowproduct;

import org.apache.ibatis.annotations.Param;
/**
 * Borrowproduct的Dao接口
 * 
 * @author 
 *
 */
public interface BorrowproductMapper {

	/**
	 * 获得Borrowproduct数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getBorrowproductRowCount(Assist assist);
	
	/**
	 * 获得Borrowproduct数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<Borrowproduct> selectBorrowproduct(Assist assist);
	/**
	 * 通过Borrowproduct的id获得Borrowproduct对象
	 * 
	 * @param id
	 * @return
	 */
	Borrowproduct selectBorrowproductById(String id);
	
	/**
	 * 获得一个Borrowproduct对象,以参数Borrowproduct对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	Borrowproduct selectBorrowproductObjSingle(Borrowproduct obj);
	
	/**
	 * 获得一个Borrowproduct对象,以参数Borrowproduct对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<Borrowproduct> selectBorrowproductByObj(Borrowproduct obj);

	/**
	 * 插入Borrowproduct到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertBorrowproduct(Borrowproduct value);
	
	/**
	 * 插入Borrowproduct中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullBorrowproduct(Borrowproduct value);
	
	/**
	 * 批量插入Borrowproduct到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertBorrowproductByBatch(List<Borrowproduct> value);
	/**
	 * 通过Borrowproduct的id删除Borrowproduct
	 * 
	 * @param id
	 * @return
	 */
	int deleteBorrowproductById(String id);
	
	/**
	 * 通过辅助工具Assist的条件删除Borrowproduct
	 * 
	 * @param assist
	 * @return
	 */
	int deleteBorrowproductByAssist(Assist assist);
	
	/**
	 * 通过Borrowproduct的id更新Borrowproduct中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateBorrowproductById(Borrowproduct enti);
	
	/**
	 * 通过Borrowproduct的id更新Borrowproduct中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullBorrowproductById(Borrowproduct enti);
	
	/**
	 * 通过辅助工具Assist的条件更新Borrowproduct中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateBorrowproduct(@Param("enti") Borrowproduct value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新Borrowproduct中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullBorrowproduct(@Param("enti") Borrowproduct value, @Param("assist") Assist assist);
}