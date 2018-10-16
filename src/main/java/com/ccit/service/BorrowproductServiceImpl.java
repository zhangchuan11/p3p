package com.ccit.service;
import java.util.List;

import com.ccit.dao.BorrowproductMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.ccit.dml.Borrowproduct;
/**
 * Borrowproduct的服务接口的实现类
 * 
 * @author 
 *
 */
@Service
public class BorrowproductServiceImpl implements BorrowproductService {
	private final Logger LOG = LogManager.getLogger(this.getClass());

	@Autowired
	private BorrowproductMapper borrowproductDao;
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
	public String find(Borrowproduct value) {
		//TODO这里可以做通过Assist做添加查询
		List<Borrowproduct> result = borrowproductDao.selectBorrowproduct(null);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行获取Borrowproduct数据集-->结果:", result);
		}
		return resultFormat(C200, result);
	}
	@Override
	public String findOne(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Borrowproduct的id获得Borrowproduct对象-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		Borrowproduct result = borrowproductDao.selectBorrowproductById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Borrowproduct的id获得Borrowproduct对象-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	@Override
	public String saveNotNull(Borrowproduct value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行将Borrowproduct中属性值不为null的数据保存到数据库-->失败:对象不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = borrowproductDao.insertNotNullBorrowproduct(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行将Borrowproduct中属性值不为null的数据保存到数据库-->结果:", result);
		}
		return resultFormat(C200, result);
	}
	@Override
	public String updateNotNullById(Borrowproduct value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Borrowproduct的id更新Borrowproduct中属性不为null的数据-->失败:对象为null");
			}
			return resultFormat(C412, null);
		}
		int result = borrowproductDao.updateNotNullBorrowproductById(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Borrowproduct的id更新Borrowproduct中属性不为null的数据-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	@Override
	public String deleteById(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Borrowproduct的id删除Borrowproduct-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = borrowproductDao.deleteBorrowproductById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Borrowproduct的id删除Borrowproduct-->结果:", result);
		}
		return resultFormat(C200, result);
	}


}