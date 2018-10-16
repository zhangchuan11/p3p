package com.ccit.dml;

import com.alibaba.fastjson.JSONObject;

/**
 * user_role实体类
 * 
 * @author 
 *
 */
public class UserRole {
	/**标识*/
	private String iD; 
	/**角色*/
	private String roleId; 
	/**用户*/
	private String userId; 
	/**
	 * 实例化
	 */
	public UserRole() {
		super();
	}
	/**
	 * 实例化
	 * 
	 * @param obj
	 */
	public UserRole(JSONObject obj) {
		this();
		if (obj.get("iD") instanceof String) {
			this.setID((String) obj.get("iD"));
		}
		if (obj.get("roleId") instanceof String) {
			this.setRoleId((String) obj.get("roleId"));
		}
		if (obj.get("userId") instanceof String) {
			this.setUserId((String) obj.get("userId"));
		}
	}
	
	/**
	 * 将当前对象转换为JsonObject
	 * 
	 * @return
	 */
	public JSONObject toJson() {
		JSONObject result = new JSONObject();
		if (this.getID() != null) {
			result.put("iD",this.getID());
		}
		if (this.getRoleId() != null) {
			result.put("roleId",this.getRoleId());
		}
		if (this.getUserId() != null) {
			result.put("userId",this.getUserId());
		}
		return result;
	}
	
	
	/**
	 * 获取iD
	 * 
	 * @return
	 */
	public String getID() {
		return iD;
	}

	/**
	 * 设置iD
	 * 
	 * @param iD
	 */
	public void setID(String iD) {
		this.iD = iD;
	}
	
	/**
	 * 获取roleId
	 * 
	 * @return
	 */
	public String getRoleId() {
		return roleId;
	}

	/**
	 * 设置roleId
	 * 
	 * @param roleId
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
	/**
	 * 获取userId
	 * 
	 * @return
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 设置userId
	 * 
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserRole [iD=" + iD + " , roleId=" + roleId + " , userId=" + userId + "  ]";
	
	}
	
	
}
