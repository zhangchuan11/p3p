package com.ccit.service;

import com.alibaba.fastjson.JSONObject;
import com.ccit.dao.CreditgradeMapper;
import com.ccit.dml.Creditgrade;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Creditgrade的服务接口的实现类
 * 
 * @author 
 *
 */
@Service
public class CreditgradeServiceImpl implements CreditgradeService {
	private final Logger LOG = LogManager.getLogger(this.getClass());

	@Autowired
	private CreditgradeMapper creditgradeDao;
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
    public String find(Creditgrade value) {
        return null;
    }



    @Override
	public String findOne(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Creditgrade的id获得Creditgrade对象-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		Creditgrade result = creditgradeDao.selectCreditgradeById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Creditgrade的id获得Creditgrade对象-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	@Override
	public String saveNotNull(Creditgrade value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行将Creditgrade中属性值不为null的数据保存到数据库-->失败:对象不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = creditgradeDao.insertNotNullCreditgrade(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行将Creditgrade中属性值不为null的数据保存到数据库-->结果:", result);
		}
		return resultFormat(C200, result);
	}
	@Override
	public String updateNotNullById(Creditgrade value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Creditgrade的id更新Creditgrade中属性不为null的数据-->失败:对象为null");
			}
			return resultFormat(C412, null);
		}
		int result = creditgradeDao.updateNotNullCreditgradeById(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Creditgrade的id更新Creditgrade中属性不为null的数据-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	@Override
	public String deleteById(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Creditgrade的id删除Creditgrade-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = creditgradeDao.deleteCreditgradeById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Creditgrade的id删除Creditgrade-->结果:", result);
		}
		return resultFormat(C200, result);
	}


}