package com.ccit.service;

import com.alibaba.fastjson.JSONObject;
import com.ccit.dao.BorrowingMapper;
import com.ccit.dml.Borrowing;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Borrowing的服务接口的实现类
 * 
 * @author 
 *
 */
@Service
public class BorrowingServiceImpl implements BorrowingService {
	private final Logger LOG = LogManager.getLogger(this.getClass());

	@Autowired
	private BorrowingMapper borrowingDao;
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
	public String find(Borrowing value) {
		//TODO这里可以做通过Assist做添加查询
		List<Borrowing> result = borrowingDao.selectBorrowing(null);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行获取Borrowing数据集-->结果:", result);
		}
		return resultFormat(C200, result);
	}
	@Override
	public String findOne(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Borrowing的id获得Borrowing对象-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		Borrowing result = borrowingDao.selectBorrowingById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Borrowing的id获得Borrowing对象-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	@Override
	public String saveNotNull(Borrowing value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行将Borrowing中属性值不为null的数据保存到数据库-->失败:对象不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = borrowingDao.insertNotNullBorrowing(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行将Borrowing中属性值不为null的数据保存到数据库-->结果:", result);
		}
		return resultFormat(C200, result);
	}
	@Override
	public String updateNotNullById(Borrowing value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Borrowing的id更新Borrowing中属性不为null的数据-->失败:对象为null");
			}
			return resultFormat(C412, null);
		}
		int result = borrowingDao.updateNotNullBorrowingById(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Borrowing的id更新Borrowing中属性不为null的数据-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	@Override
	public String deleteById(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Borrowing的id删除Borrowing-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = borrowingDao.deleteBorrowingById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Borrowing的id删除Borrowing-->结果:", result);
		}
		return resultFormat(C200, result);
	}


}