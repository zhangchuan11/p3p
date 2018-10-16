package com.ccit.dao;
import java.util.List;

import com.common.Assist;
import com.ccit.dml.Repayment;

import org.apache.ibatis.annotations.Param;
/**
 * Repayment的Dao接口
 * 
 * @author 
 *
 */
public interface RepaymentMapper {

	/**
	 * 获得Repayment数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getRepaymentRowCount(Assist assist);
	
	/**
	 * 获得Repayment数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<Repayment> selectRepayment(Assist assist);
	/**
	 * 通过Repayment的id获得Repayment对象
	 * 
	 * @param id
	 * @return
	 */
	Repayment selectRepaymentById(String id);
	
	/**
	 * 获得一个Repayment对象,以参数Repayment对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	Repayment selectRepaymentObjSingle(Repayment obj);
	
	/**
	 * 获得一个Repayment对象,以参数Repayment对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<Repayment> selectRepaymentByObj(Repayment obj);

	/**
	 * 插入Repayment到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertRepayment(Repayment value);
	
	/**
	 * 插入Repayment中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullRepayment(Repayment value);
	
	/**
	 * 批量插入Repayment到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertRepaymentByBatch(List<Repayment> value);
	/**
	 * 通过Repayment的id删除Repayment
	 * 
	 * @param id
	 * @return
	 */
	int deleteRepaymentById(String id);
	
	/**
	 * 通过辅助工具Assist的条件删除Repayment
	 * 
	 * @param assist
	 * @return
	 */
	int deleteRepaymentByAssist(Assist assist);
	
	/**
	 * 通过Repayment的id更新Repayment中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateRepaymentById(Repayment enti);
	
	/**
	 * 通过Repayment的id更新Repayment中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullRepaymentById(Repayment enti);
	
	/**
	 * 通过辅助工具Assist的条件更新Repayment中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateRepayment(@Param("enti") Repayment value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新Repayment中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullRepayment(@Param("enti") Repayment value, @Param("assist") Assist assist);
}