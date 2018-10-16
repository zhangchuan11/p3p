package com.ccit.dao;
import java.util.List;

import com.common.Assist;
import com.ccit.dml.Capital;

import org.apache.ibatis.annotations.Param;
/**
 * Capital的Dao接口
 * 
 * @author 
 *
 */
public interface CapitalMapper {

	/**
	 * 获得Capital数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getCapitalRowCount(Assist assist);
	
	/**
	 * 获得Capital数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<Capital> selectCapital(Assist assist);
	/**
	 * 通过Capital的id获得Capital对象
	 * 
	 * @param id
	 * @return
	 */
	Capital selectCapitalById(String id);
	
	/**
	 * 获得一个Capital对象,以参数Capital对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	Capital selectCapitalObjSingle(Capital obj);
	
	/**
	 * 获得一个Capital对象,以参数Capital对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<Capital> selectCapitalByObj(Capital obj);

	/**
	 * 插入Capital到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertCapital(Capital value);
	
	/**
	 * 插入Capital中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullCapital(Capital value);
	
	/**
	 * 批量插入Capital到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertCapitalByBatch(List<Capital> value);
	/**
	 * 通过Capital的id删除Capital
	 * 
	 * @param id
	 * @return
	 */
	int deleteCapitalById(String id);
	
	/**
	 * 通过辅助工具Assist的条件删除Capital
	 * 
	 * @param assist
	 * @return
	 */
	int deleteCapitalByAssist(Assist assist);
	
	/**
	 * 通过Capital的id更新Capital中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateCapitalById(Capital enti);
	
	/**
	 * 通过Capital的id更新Capital中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullCapitalById(Capital enti);
	
	/**
	 * 通过辅助工具Assist的条件更新Capital中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateCapital(@Param("enti") Capital value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新Capital中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullCapital(@Param("enti") Capital value, @Param("assist") Assist assist);
}