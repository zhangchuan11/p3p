package com.ccit.dao;
import java.util.List;

import com.common.Assist;
import com.ccit.dml.Rbill;

import org.apache.ibatis.annotations.Param;
/**
 * Rbill的Dao接口
 * 
 * @author 
 *
 */
public interface RbillMapper {

	/**
	 * 获得Rbill数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getRbillRowCount(Assist assist);
	
	/**
	 * 获得Rbill数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<Rbill> selectRbill(Assist assist);
	
	/**
	 * 获得一个Rbill对象,以参数Rbill对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	Rbill selectRbillObjSingle(Rbill obj);
	
	/**
	 * 获得一个Rbill对象,以参数Rbill对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<Rbill> selectRbillByObj(Rbill obj);

	/**
	 * 插入Rbill到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertRbill(Rbill value);
	
	/**
	 * 插入Rbill中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullRbill(Rbill value);
	
	/**
	 * 批量插入Rbill到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertRbillByBatch(List<Rbill> value);
	
	/**
	 * 通过辅助工具Assist的条件删除Rbill
	 * 
	 * @param assist
	 * @return
	 */
	int deleteRbillByAssist(Assist assist);
	
	
	/**
	 * 通过辅助工具Assist的条件更新Rbill中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateRbill(@Param("enti") Rbill value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新Rbill中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullRbill(@Param("enti") Rbill value, @Param("assist") Assist assist);
}