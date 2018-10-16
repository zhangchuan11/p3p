package com.ccit.service;

import com.alibaba.fastjson.JSONObject;
import com.ccit.dao.UserdataMapper;
import com.ccit.dml.Userdata;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Userdata的服务接口的实现类
 * 
 * @author 
 *
 */
@Service
public class UserdataServiceImpl implements UserdataService {
	private final Logger LOG = LogManager.getLogger(this.getClass());

	@Autowired
	private UserdataMapper userdataDao;
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
	public String find(Userdata value) {
		//TODO这里可以做通过Assist做添加查询
		List<Userdata> result = userdataDao.selectUserdata(null);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行获取Userdata数据集-->结果:", result);
		}
		return resultFormat(C200, result);
	}
	@Override
	public String findOne(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Userdata的id获得Userdata对象-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		Userdata result = userdataDao.selectUserdataById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Userdata的id获得Userdata对象-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	@Override
	public String saveNotNull(Userdata value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行将Userdata中属性值不为null的数据保存到数据库-->失败:对象不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = userdataDao.insertNotNullUserdata(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行将Userdata中属性值不为null的数据保存到数据库-->结果:", result);
		}
		return resultFormat(C200, result);
	}
	@Override
	public String updateNotNullById(Userdata value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Userdata的id更新Userdata中属性不为null的数据-->失败:对象为null");
			}
			return resultFormat(C412, null);
		}
		int result = userdataDao.updateNotNullUserdataById(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Userdata的id更新Userdata中属性不为null的数据-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	@Override
	public String deleteById(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Userdata的id删除Userdata-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = userdataDao.deleteUserdataById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Userdata的id删除Userdata-->结果:", result);
		}
		return resultFormat(C200, result);
	}


}