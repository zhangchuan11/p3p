package com.ccit.dml;

import com.alibaba.fastjson.JSONObject;

/**
 * permissions实体类
 * 
 * @author 
 *
 */
public class Permissions {
	/**标识*/
	private String iD; 
	/**权限名称*/
	private String authName; 
	/**初始状态*/
	private String state; 
	/**图标*/
	private String iconCls; 
	/**父ID*/
	private String pid; 
	/**控制器*/
	private String controller; 
	/**
	 * 实例化
	 */
	public Permissions() {
		super();
	}
	/**
	 * 实例化
	 * 
	 * @param obj
	 */
	public Permissions(JSONObject obj) {
		this();
		if (obj.get("iD") instanceof String) {
			this.setID((String) obj.get("iD"));
		}
		if (obj.get("authName") instanceof String) {
			this.setAuthName((String) obj.get("authName"));
		}
		if (obj.get("state") instanceof String) {
			this.setState((String) obj.get("state"));
		}
		if (obj.get("iconCls") instanceof String) {
			this.setIconCls((String) obj.get("iconCls"));
		}
		if (obj.get("pid") instanceof String) {
			this.setPid((String) obj.get("pid"));
		}
		if (obj.get("controller") instanceof String) {
			this.setController((String) obj.get("controller"));
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
		if (this.getAuthName() != null) {
			result.put("authName",this.getAuthName());
		}
		if (this.getState() != null) {
			result.put("state",this.getState());
		}
		if (this.getIconCls() != null) {
			result.put("iconCls",this.getIconCls());
		}
		if (this.getPid() != null) {
			result.put("pid",this.getPid());
		}
		if (this.getController() != null) {
			result.put("controller",this.getController());
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
	 * 获取authName
	 * 
	 * @return
	 */
	public String getAuthName() {
		return authName;
	}

	/**
	 * 设置authName
	 * 
	 * @param authName
	 */
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	
	/**
	 * 获取state
	 * 
	 * @return
	 */
	public String getState() {
		return state;
	}

	/**
	 * 设置state
	 * 
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * 获取iconCls
	 * 
	 * @return
	 */
	public String getIconCls() {
		return iconCls;
	}

	/**
	 * 设置iconCls
	 * 
	 * @param iconCls
	 */
	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}
	
	/**
	 * 获取pid
	 * 
	 * @return
	 */
	public String getPid() {
		return pid;
	}

	/**
	 * 设置pid
	 * 
	 * @param pid
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}
	
	/**
	 * 获取controller
	 * 
	 * @return
	 */
	public String getController() {
		return controller;
	}

	/**
	 * 设置controller
	 * 
	 * @param controller
	 */
	public void setController(String controller) {
		this.controller = controller;
	}

	@Override
	public String toString() {
		return "Permissions [iD=" + iD + " , authName=" + authName + " , state=" + state + " , iconCls=" + iconCls + " , pid=" + pid + " , controller=" + controller + "  ]";
	
	}
	
	
}
