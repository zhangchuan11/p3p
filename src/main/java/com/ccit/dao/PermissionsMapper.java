package com.ccit.dao;
import java.util.List;

import com.ccit.dml.Permissions;
import com.common.Assist;

import org.apache.ibatis.annotations.Param;
/**
 * Permissions的Dao接口
 * 
 * @author 
 *
 */
public interface PermissionsMapper {
    /**
     * 查询权限
     */
    List<Permissions> selectrole(@Param(value = "ID") String ID);



	/**
	 * 获得Permissions数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getPermissionsRowCount(Assist assist);
	
	/**
	 * 获得Permissions数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<Permissions> selectPermissions(Assist assist);
	/**
	 * 通过Permissions的id获得Permissions对象
	 * 
	 * @param id
	 * @return
	 */
	Permissions selectPermissionsById(String id);
	
	/**
	 * 获得一个Permissions对象,以参数Permissions对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	Permissions selectPermissionsObjSingle(Permissions obj);
	
	/**
	 * 获得一个Permissions对象,以参数Permissions对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<Permissions> selectPermissionsByObj(Permissions obj);

	/**
	 * 插入Permissions到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertPermissions(Permissions value);
	
	/**
	 * 插入Permissions中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullPermissions(Permissions value);
	
	/**
	 * 批量插入Permissions到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertPermissionsByBatch(List<Permissions> value);
	/**
	 * 通过Permissions的id删除Permissions
	 * 
	 * @param id
	 * @return
	 */
	int deletePermissionsById(String id);
	
	/**
	 * 通过辅助工具Assist的条件删除Permissions
	 * 
	 * @param assist
	 * @return
	 */
	int deletePermissionsByAssist(Assist assist);
	
	/**
	 * 通过Permissions的id更新Permissions中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updatePermissionsById(Permissions enti);
	
	/**
	 * 通过Permissions的id更新Permissions中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullPermissionsById(Permissions enti);
	
	/**
	 * 通过辅助工具Assist的条件更新Permissions中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updatePermissions(@Param("enti") Permissions value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新Permissions中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullPermissions(@Param("enti") Permissions value, @Param("assist") Assist assist);
}