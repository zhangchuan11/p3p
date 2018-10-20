package com.ccit.dao;
import java.util.List;

import com.common.Assist;
import com.ccit.dml.Indexpage;

import org.apache.ibatis.annotations.Param;
/**
 * Indexpage的Dao接口
 * 
 * @author 
 *
 */
public interface IndexpageMapper {

	/**
	 * 获得Indexpage数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getIndexpageRowCount(Assist assist);
	
	/**
	 * 获得Indexpage数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<Indexpage> selectIndexpage(Assist assist);
	/**
	 * 通过Indexpage的id获得Indexpage对象
	 * 
	 * @param id
	 * @return
	 */
	Indexpage selectIndexpageById(String id);
	
	/**
	 * 获得一个Indexpage对象,以参数Indexpage对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	Indexpage selectIndexpageObjSingle(Indexpage obj);
	
	/**
	 * 获得一个Indexpage对象,以参数Indexpage对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<Indexpage> selectIndexpageByObj(Indexpage obj);

	/**
	 * 插入Indexpage到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertIndexpage(Indexpage value);
	
	/**
	 * 插入Indexpage中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullIndexpage(Indexpage value);
	
	/**
	 * 批量插入Indexpage到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertIndexpageByBatch(List<Indexpage> value);
	/**
	 * 通过Indexpage的id删除Indexpage
	 * 
	 * @param id
	 * @return
	 */
	int deleteIndexpageById(String id);
	
	/**
	 * 通过辅助工具Assist的条件删除Indexpage
	 * 
	 * @param assist
	 * @return
	 */
	int deleteIndexpageByAssist(Assist assist);
	
	/**
	 * 通过Indexpage的id更新Indexpage中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateIndexpageById(Indexpage enti);
	
	/**
	 * 通过Indexpage的id更新Indexpage中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullIndexpageById(Indexpage enti);
	
	/**
	 * 通过辅助工具Assist的条件更新Indexpage中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateIndexpage(@Param("enti") Indexpage value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新Indexpage中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullIndexpage(@Param("enti") Indexpage value, @Param("assist") Assist assist);
}