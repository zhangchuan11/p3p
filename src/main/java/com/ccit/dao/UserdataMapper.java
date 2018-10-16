package com.ccit.dao;
import java.util.List;

import com.common.Assist;
import com.ccit.dml.Userdata;

import org.apache.ibatis.annotations.Param;
/**
 * Userdata的Dao接口
 * 
 * @author 
 *
 */
public interface UserdataMapper {

	/**
	 * 获得Userdata数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getUserdataRowCount(Assist assist);
	
	/**
	 * 获得Userdata数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<Userdata> selectUserdata(Assist assist);
	/**
	 * 通过Userdata的id获得Userdata对象
	 * 
	 * @param id
	 * @return
	 */
	Userdata selectUserdataById(String id);
	
	/**
	 * 获得一个Userdata对象,以参数Userdata对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	Userdata selectUserdataObjSingle(Userdata obj);
	
	/**
	 * 获得一个Userdata对象,以参数Userdata对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<Userdata> selectUserdataByObj(Userdata obj);

	/**
	 * 插入Userdata到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertUserdata(Userdata value);
	
	/**
	 * 插入Userdata中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullUserdata(Userdata value);
	
	/**
	 * 批量插入Userdata到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertUserdataByBatch(List<Userdata> value);
	/**
	 * 通过Userdata的id删除Userdata
	 * 
	 * @param id
	 * @return
	 */
	int deleteUserdataById(String id);
	
	/**
	 * 通过辅助工具Assist的条件删除Userdata
	 * 
	 * @param assist
	 * @return
	 */
	int deleteUserdataByAssist(Assist assist);
	
	/**
	 * 通过Userdata的id更新Userdata中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateUserdataById(Userdata enti);
	
	/**
	 * 通过Userdata的id更新Userdata中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullUserdataById(Userdata enti);
	
	/**
	 * 通过辅助工具Assist的条件更新Userdata中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateUserdata(@Param("enti") Userdata value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新Userdata中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullUserdata(@Param("enti") Userdata value, @Param("assist") Assist assist);
}