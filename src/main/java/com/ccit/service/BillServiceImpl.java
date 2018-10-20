package com.ccit.service;

import com.alibaba.fastjson.JSONObject;
import com.ccit.dao.BillMapper;
import com.ccit.dml.Bill;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Bill的服务接口的实现类
 * 
 * @author 
 *
 */
@Service
public class BillServiceImpl implements BillService {
	private final Logger LOG = LogManager.getLogger(this.getClass());

	@Autowired
	private BillMapper billDao;
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
	public String find(Bill value) {
		//TODO这里可以做通过Assist做添加查询
		List<Bill> result = billDao.selectBill(null);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行获取Bill数据集-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	@Override
	public String saveNotNull(Bill value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行将Bill中属性值不为null的数据保存到数据库-->失败:对象不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = billDao.insertNotNullBill(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行将Bill中属性值不为null的数据保存到数据库-->结果:", result);
		}
		return resultFormat(C200, result);
	}


}