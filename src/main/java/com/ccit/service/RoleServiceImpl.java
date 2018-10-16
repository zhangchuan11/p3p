package com.ccit.service;

import com.alibaba.fastjson.JSONObject;
import com.ccit.dao.RoleMapper;
import com.ccit.dml.Role;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Role的服务接口的实现类
 * 
 * @author 
 *
 */
@Service
public class RoleServiceImpl implements RoleService {
	private final Logger LOG = LogManager.getLogger(this.getClass());

	@Autowired
	private RoleMapper roleDao;
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
	public String find(Role value) {
		//TODO这里可以做通过Assist做添加查询
		List<Role> result = roleDao.selectRole(null);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行获取Role数据集-->结果:", result);
		}
		return resultFormat(C200, result);
	}
	@Override
	public String findOne(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Role的id获得Role对象-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		Role result = roleDao.selectRoleById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Role的id获得Role对象-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	@Override
	public String saveNotNull(Role value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行将Role中属性值不为null的数据保存到数据库-->失败:对象不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = roleDao.insertNotNullRole(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行将Role中属性值不为null的数据保存到数据库-->结果:", result);
		}
		return resultFormat(C200, result);
	}
	@Override
	public String updateNotNullById(Role value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Role的id更新Role中属性不为null的数据-->失败:对象为null");
			}
			return resultFormat(C412, null);
		}
		int result = roleDao.updateNotNullRoleById(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Role的id更新Role中属性不为null的数据-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	@Override
	public String deleteById(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Role的id删除Role-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = roleDao.deleteRoleById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Role的id删除Role-->结果:", result);
		}
		return resultFormat(C200, result);
	}


}