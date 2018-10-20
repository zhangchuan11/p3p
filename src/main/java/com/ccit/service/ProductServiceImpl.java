package com.ccit.service;

import com.alibaba.fastjson.JSONObject;
import com.ccit.dao.ProductMapper;
import com.ccit.dml.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Product的服务接口的实现类
 * 
 * @author 
 *
 */
@Service
public class ProductServiceImpl implements ProductService {
	private final Logger LOG = LogManager.getLogger(this.getClass());

	@Autowired
	private ProductMapper productDao;
	// TODO 当你看到这个方法时你应该创建一个工具类做通用的方法,定义自己的返回格式化
	private static final int C200 = 200;
	private static final int C412 = 412;
	public String resultFormat(int code, Object data) {
		JSONObject result = new JSONObject();
		result.put("code", code);
		if (data != null) {
			result.put("data", data);
		}
		return result.toJSONString();
	}

	@Override
	public String find(Product value) {
		//TODO这里可以做通过Assist做添加查询
		List<Product> result = productDao.selectProduct(null);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行获取Product数据集-->结果:", result);
		}
		return resultFormat(C200, result);
	}
	@Override
	public String findOne(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Product的id获得Product对象-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		Product result = productDao.selectProductById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Product的id获得Product对象-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	@Override
	public String saveNotNull(Product value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行将Product中属性值不为null的数据保存到数据库-->失败:对象不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = productDao.insertNotNullProduct(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行将Product中属性值不为null的数据保存到数据库-->结果:", result);
		}
		return resultFormat(C200, result);
	}
	@Override
	public String updateNotNullById(Product value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Product的id更新Product中属性不为null的数据-->失败:对象为null");
			}
			return resultFormat(C412, null);
		}
		int result = productDao.updateNotNullProductById(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Product的id更新Product中属性不为null的数据-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	@Override
	public String deleteById(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Product的id删除Product-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = productDao.deleteProductById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Product的id删除Product-->结果:", result);
		}
		return resultFormat(C200, result);
	}


}