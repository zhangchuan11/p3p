package com.ccit.dao;
import java.util.List;

import com.common.Assist;
import com.ccit.dml.Creditgrade;

import org.apache.ibatis.annotations.Param;
/**
 * Creditgrade的Dao接口
 * 
 * @author 
 *
 */
public interface CreditgradeMapper {

	/**
	 * 获得Creditgrade数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getCreditgradeRowCount(Assist assist);
	
	/**
	 * 获得Creditgrade数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<Creditgrade> selectCreditgrade(Assist assist);
	/**
	 * 通过Creditgrade的id获得Creditgrade对象
	 * 
	 * @param id
	 * @return
	 */
	Creditgrade selectCreditgradeById(String id);
	
	/**
	 * 获得一个Creditgrade对象,以参数Creditgrade对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	Creditgrade selectCreditgradeObjSingle(Creditgrade obj);
	
	/**
	 * 获得一个Creditgrade对象,以参数Creditgrade对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<Creditgrade> selectCreditgradeByObj(Creditgrade obj);

	/**
	 * 插入Creditgrade到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertCreditgrade(Creditgrade value);
	
	/**
	 * 插入Creditgrade中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullCreditgrade(Creditgrade value);
	
	/**
	 * 批量插入Creditgrade到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertCreditgradeByBatch(List<Creditgrade> value);
	/**
	 * 通过Creditgrade的id删除Creditgrade
	 * 
	 * @param id
	 * @return
	 */
	int deleteCreditgradeById(String id);
	
	/**
	 * 通过辅助工具Assist的条件删除Creditgrade
	 * 
	 * @param assist
	 * @return
	 */
	int deleteCreditgradeByAssist(Assist assist);
	
	/**
	 * 通过Creditgrade的id更新Creditgrade中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateCreditgradeById(Creditgrade enti);
	
	/**
	 * 通过Creditgrade的id更新Creditgrade中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullCreditgradeById(Creditgrade enti);
	
	/**
	 * 通过辅助工具Assist的条件更新Creditgrade中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateCreditgrade(@Param("enti") Creditgrade value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新Creditgrade中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullCreditgrade(@Param("enti") Creditgrade value, @Param("assist") Assist assist);
}