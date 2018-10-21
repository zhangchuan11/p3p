package com.ccit.service;
import java.util.List;

import com.ccit.service.ProductServiceImpl;
import com.common.Assist;
import com.ccit.dml.Product;

/**
 * Product的服务接口
 * 
 * @author 
 *
 */
public interface ProductService {
	/**
	 * 获得Product数据集,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @return
	 */
	String find(Product value);
	
	/**
	 * 通过Product的id获得Product对象
	 * 
	 * @param id
	 * @return
	 */
	String findOne(String id);
	
	/**
	 * 将Product中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	String saveNotNull(Product value);
	
	/**
	 * 通过Product的id更新Product中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	String updateNotNullById(Product enti);
	
	/**
	 * 通过Product的id删除Product
	 * 
	 * @param id
	 * @return
	 */
	String deleteById(String id);

}
