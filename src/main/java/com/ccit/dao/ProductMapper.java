package com.ccit.dao;
import java.util.List;

import com.common.Assist;
import com.ccit.dml.Product;

import org.apache.ibatis.annotations.Param;
/**
 * Product的Dao接口
 * 
 * @author 
 *
 */
public interface ProductMapper {

	/**
	 * 获得Product数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getProductRowCount(Assist assist);
	
	/**
	 * 获得Product数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<Product> selectProduct(Assist assist);
	/**
	 * 通过Product的id获得Product对象
	 * 
	 * @param id
	 * @return
	 */
	Product selectProductById(String id);
	
	/**
	 * 获得一个Product对象,以参数Product对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	Product selectProductObjSingle(Product obj);
	
	/**
	 * 获得一个Product对象,以参数Product对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<Product> selectProductByObj(Product obj);

	/**
	 * 插入Product到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertProduct(Product value);
	
	/**
	 * 插入Product中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullProduct(Product value);
	
	/**
	 * 批量插入Product到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertProductByBatch(List<Product> value);
	/**
	 * 通过Product的id删除Product
	 * 
	 * @param id
	 * @return
	 */
	int deleteProductById(String id);
	
	/**
	 * 通过辅助工具Assist的条件删除Product
	 * 
	 * @param assist
	 * @return
	 */
	int deleteProductByAssist(Assist assist);
	
	/**
	 * 通过Product的id更新Product中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateProductById(Product enti);
	
	/**
	 * 通过Product的id更新Product中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullProductById(Product enti);
	
	/**
	 * 通过辅助工具Assist的条件更新Product中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateProduct(@Param("enti") Product value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新Product中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullProduct(@Param("enti") Product value, @Param("assist") Assist assist);
}