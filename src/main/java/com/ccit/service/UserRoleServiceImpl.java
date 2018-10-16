package com.ccit.service;

import com.alibaba.fastjson.JSONObject;
import com.ccit.dao.UserRoleMapper;
import com.ccit.dml.UserRole;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * UserRole的服务接口的实现类
 * 
 * @author 
 *
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {
	private final Logger LOG = LogManager.getLogger(this.getClass());

	@Autowired
	private UserRoleMapper userRoleDao;
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
	public String find(UserRole value) {
		//TODO这里可以做通过Assist做添加查询
		List<UserRole> result = userRoleDao.selectUserRole(null);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行获取UserRole数据集-->结果:", result);
		}
		return resultFormat(C200, result);
	}
	@Override
	public String findOne(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过UserRole的id获得UserRole对象-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		UserRole result = userRoleDao.selectUserRoleById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过UserRole的id获得UserRole对象-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	@Override
	public String saveNotNull(UserRole value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行将UserRole中属性值不为null的数据保存到数据库-->失败:对象不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = userRoleDao.insertNotNullUserRole(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行将UserRole中属性值不为null的数据保存到数据库-->结果:", result);
		}
		return resultFormat(C200, result);
	}
	@Override
	public String updateNotNullById(UserRole value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过UserRole的id更新UserRole中属性不为null的数据-->失败:对象为null");
			}
			return resultFormat(C412, null);
		}
		int result = userRoleDao.updateNotNullUserRoleById(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过UserRole的id更新UserRole中属性不为null的数据-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	@Override
	public String deleteById(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过UserRole的id删除UserRole-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = userRoleDao.deleteUserRoleById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过UserRole的id删除UserRole-->结果:", result);
		}
		return resultFormat(C200, result);
	}


}