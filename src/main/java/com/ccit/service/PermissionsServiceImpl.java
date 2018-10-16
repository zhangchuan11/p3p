package com.ccit.service;

import com.alibaba.fastjson.JSONObject;
import com.ccit.dao.PermissionsMapper;
import com.ccit.dml.Permissions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Permissions的服务接口的实现类
 * 
 * @author 
 *
 */
@Service
public class PermissionsServiceImpl implements PermissionsService {
	private final Logger LOG = LogManager.getLogger(this.getClass());

	@Autowired
	private PermissionsMapper permissionsDao;
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
	public String find(Permissions value) {
		//TODO这里可以做通过Assist做添加查询
		List<Permissions> result = permissionsDao.selectPermissions(null);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行获取Permissions数据集-->结果:", result);
		}
		return resultFormat(C200, result);
	}
	@Override
	public String findOne(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Permissions的id获得Permissions对象-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		Permissions result = permissionsDao.selectPermissionsById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Permissions的id获得Permissions对象-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	@Override
	public String saveNotNull(Permissions value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行将Permissions中属性值不为null的数据保存到数据库-->失败:对象不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = permissionsDao.insertNotNullPermissions(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行将Permissions中属性值不为null的数据保存到数据库-->结果:", result);
		}
		return resultFormat(C200, result);
	}
	@Override
	public String updateNotNullById(Permissions value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Permissions的id更新Permissions中属性不为null的数据-->失败:对象为null");
			}
			return resultFormat(C412, null);
		}
		int result = permissionsDao.updateNotNullPermissionsById(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Permissions的id更新Permissions中属性不为null的数据-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	@Override
	public String deleteById(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Permissions的id删除Permissions-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = permissionsDao.deletePermissionsById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Permissions的id删除Permissions-->结果:", result);
		}
		return resultFormat(C200, result);
	}


}