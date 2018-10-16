package com.ccit.service;

import com.alibaba.fastjson.JSONObject;
import com.ccit.dao.UserMapper;
import com.ccit.dml.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User&#x7684;&#x670d;&#x52a1;&#x63a5;&#x53e3;&#x7684;&#x5b9e;&#x73b0;&#x7c7b;
 *
 * @author
 *
 */
@Service
public class UserServiceImpl implements UserService {
	private final Logger LOG = LogManager.getLogger(this.getClass());

	@Autowired
	private UserMapper userDao;
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

	/**
	 * 获得一个User对象,以参数User对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param
	 * @return
	 */
	public String find(User user) {
		// TODO这里可以做通过Assist做添加查询
		List<User> result = userDao.selectUserByObj(user);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行获取User数据集-->结果:", result);
		}
		if(result.size() == 0){
			return resultFormat(C200, "没有结果集");
		}else {
			return resultFormat(C412,result.get(0));
		}
		
	  
    }

	public String findOne(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过User的id获得User对象-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		User result = userDao.selectUserById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过User的id获得User对象-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	public String saveNotNull(User value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行将User中属性值不为null的数据保存到数据库-->失败:对象不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = userDao.insertNotNullUser(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行将User中属性值不为null的数据保存到数据库-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	public String updateNotNullById(User value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过User的id更新User中属性不为null的数据-->失败:对象为null");
			}
			return resultFormat(C412, null);
		}
		int result = userDao.updateNotNullUserById(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过User的id更新User中属性不为null的数据-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	public String deleteById(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过User的id删除User-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = userDao.deleteUserById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过User的id删除User-->结果:", result);
		}
		return resultFormat(C200, result);
	}

}