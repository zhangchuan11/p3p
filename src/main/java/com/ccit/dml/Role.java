package com.ccit.dml;

import com.alibaba.fastjson.JSONObject;

/**
 * role实体类
 * 
 * @author 
 *
 */
public class Role {
	/**标识*/
	private String id; 
	/**角色*/
	private String roleId; 
	/**权限id*/
	private String permissionsID; 
	/**权限控制器*/
	private String permissionsController; 
	/**
	 * 实例化
	 */
	public Role() {
		super();
	}
	/**
	 * 实例化
	 * 
	 * @param obj
	 */
	public Role(JSONObject obj) {
		this();
		if (obj.get("id") instanceof String) {
			this.setId((String) obj.get("id"));
		}
		if (obj.get("roleId") instanceof String) {
			this.setRoleId((String) obj.get("roleId"));
		}
		if (obj.get("permissionsID") instanceof String) {
			this.setPermissionsID((String) obj.get("permissionsID"));
		}
		if (obj.get("permissionsController") instanceof String) {
			this.setPermissionsController((String) obj.get("permissionsController"));
		}
	}
	
	/**
	 * 将当前对象转换为JsonObject
	 * 
	 * @return
	 */
	public JSONObject toJson() {
		JSONObject result = new JSONObject();
		if (this.getId() != null) {
			result.put("id",this.getId());
		}
		if (this.getRoleId() != null) {
			result.put("roleId",this.getRoleId());
		}
		if (this.getPermissionsID() != null) {
			result.put("permissionsID",this.getPermissionsID());
		}
		if (this.getPermissionsController() != null) {
			result.put("permissionsController",this.getPermissionsController());
		}
		return result;
	}
	
	
	/**
	 * 获取id
	 * 
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置id
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
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
	 * 获取permissionsID
	 * 
	 * @return
	 */
	public String getPermissionsID() {
		return permissionsID;
	}

	/**
	 * 设置permissionsID
	 * 
	 * @param permissionsID
	 */
	public void setPermissionsID(String permissionsID) {
		this.permissionsID = permissionsID;
	}
	
	/**
	 * 获取permissionsController
	 * 
	 * @return
	 */
	public String getPermissionsController() {
		return permissionsController;
	}

	/**
	 * 设置permissionsController
	 * 
	 * @param permissionsController
	 */
	public void setPermissionsController(String permissionsController) {
		this.permissionsController = permissionsController;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + " , roleId=" + roleId + " , permissionsID=" + permissionsID + " , permissionsController=" + permissionsController + "  ]";
	
	}
	
	
}
