package com.ccit.service;

import com.alibaba.fastjson.JSONObject;
import com.ccit.dao.IndexpageMapper;
import com.ccit.dml.Indexpage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Indexpage的服务接口的实现类
 * 
 * @author 
 *
 */
@Service
public class IndexpageServiceImpl implements IndexpageService {
	private final Logger LOG = LogManager.getLogger(this.getClass());

	@Autowired
	private IndexpageMapper indexpageDao;
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
	public String find(Indexpage value) {
		//TODO这里可以做通过Assist做添加查询
		List<Indexpage> result = indexpageDao.selectIndexpage(null);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行获取Indexpage数据集-->结果:", result);
		}
		return resultFormat(C200, result);
	}

    @Override
    public Indexpage find() {
        return  indexpageDao.selectIndexpage(null).get(0);
    }

    @Override
	public String findOne(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Indexpage的id获得Indexpage对象-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		Indexpage result = indexpageDao.selectIndexpageById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Indexpage的id获得Indexpage对象-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	@Override
	public String saveNotNull(Indexpage value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行将Indexpage中属性值不为null的数据保存到数据库-->失败:对象不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = indexpageDao.insertNotNullIndexpage(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行将Indexpage中属性值不为null的数据保存到数据库-->结果:", result);
		}
		return resultFormat(C200, result);
	}
	@Override
	public String updateNotNullById(Indexpage value) {
		if (value == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Indexpage的id更新Indexpage中属性不为null的数据-->失败:对象为null");
			}
			return resultFormat(C412, null);
		}
		int result = indexpageDao.updateNotNullIndexpageById(value);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Indexpage的id更新Indexpage中属性不为null的数据-->结果:", result);
		}
		return resultFormat(C200, result);
	}

	@Override
	public String deleteById(String id) {
		if (id == null) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("执行通过Indexpage的id删除Indexpage-->失败:id不能为空");
			}
			return resultFormat(C412, null);
		}
		int result = indexpageDao.deleteIndexpageById(id);
		if (LOG.isDebugEnabled()) {
			LOG.debug("执行通过Indexpage的id删除Indexpage-->结果:", result);
		}
		return resultFormat(C200, result);
	}


}