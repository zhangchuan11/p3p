package com.ccit.dao;
import java.util.List;

import com.common.Assist;
import com.ccit.dml.Bill;

import org.apache.ibatis.annotations.Param;
/**
 * Bill的Dao接口
 * 
 * @author 
 *
 */
public interface BillMapper {

	/**
	 * 获得Bill数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getBillRowCount(Assist assist);
	
	/**
	 * 获得Bill数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<Bill> selectBill(Assist assist);
	
	/**
	 * 获得一个Bill对象,以参数Bill对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	Bill selectBillObjSingle(Bill obj);
	
	/**
	 * 获得一个Bill对象,以参数Bill对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<Bill> selectBillByObj(Bill obj);

	/**
	 * 插入Bill到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertBill(Bill value);
	
	/**
	 * 插入Bill中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullBill(Bill value);
	
	/**
	 * 批量插入Bill到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertBillByBatch(List<Bill> value);
	
	/**
	 * 通过辅助工具Assist的条件删除Bill
	 * 
	 * @param assist
	 * @return
	 */
	int deleteBillByAssist(Assist assist);
	
	
	/**
	 * 通过辅助工具Assist的条件更新Bill中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateBill(@Param("enti") Bill value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新Bill中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullBill(@Param("enti") Bill value, @Param("assist") Assist assist);
}