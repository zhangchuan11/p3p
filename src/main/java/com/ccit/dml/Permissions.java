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
	private String text;
	/**初始状态*/
	private String state;
	/**图标*/
	private String iconCls;
	/**父ID*/
	private String pid;
	/**控制器*/
	private String controller;
	/**页面元素id*/
	private String resourceid;
	/**权限类型权限类别 1：菜单   2：页面元素*/
	private String authtype;
	/***/
	private String iframe;
	/**控制器名称*/
	private String modulecn;
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
		if (obj.get("text") instanceof String) {
			this.setText((String) obj.get("text"));
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
		if (obj.get("resourceid") instanceof String) {
			this.setResourceid((String) obj.get("resourceid"));
		}
		if (obj.get("authtype") instanceof String) {
			this.setAuthtype((String) obj.get("authtype"));
		}
		if (obj.get("iframe") instanceof String) {
			this.setIframe((String) obj.get("iframe"));
		}
		if (obj.get("modulecn") instanceof String) {
			this.setModulecn((String) obj.get("modulecn"));
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
		if (this.getText() != null) {
			result.put("text",this.getText());
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
		if (this.getResourceid() != null) {
			result.put("resourceid",this.getResourceid());
		}
		if (this.getAuthtype() != null) {
			result.put("authtype",this.getAuthtype());
		}
		if (this.getIframe() != null) {
			result.put("iframe",this.getIframe());
		}
		if (this.getModulecn() != null) {
			result.put("modulecn",this.getModulecn());
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
	 * 获取text
	 *
	 * @return
	 */
	public String getText() {
		return text;
	}

	/**
	 * 设置text
	 *
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
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

	/**
	 * 获取resourceid
	 *
	 * @return
	 */
	public String getResourceid() {
		return resourceid;
	}

	/**
	 * 设置resourceid
	 *
	 * @param resourceid
	 */
	public void setResourceid(String resourceid) {
		this.resourceid = resourceid;
	}

	/**
	 * 获取authtype
	 *
	 * @return
	 */
	public String getAuthtype() {
		return authtype;
	}

	/**
	 * 设置authtype
	 *
	 * @param authtype
	 */
	public void setAuthtype(String authtype) {
		this.authtype = authtype;
	}

	/**
	 * 获取iframe
	 *
	 * @return
	 */
	public String getIframe() {
		return iframe;
	}

	/**
	 * 设置iframe
	 *
	 * @param iframe
	 */
	public void setIframe(String iframe) {
		this.iframe = iframe;
	}

	/**
	 * 获取modulecn
	 *
	 * @return
	 */
	public String getModulecn() {
		return modulecn;
	}

	/**
	 * 设置modulecn
	 *
	 * @param modulecn
	 */
	public void setModulecn(String modulecn) {
		this.modulecn = modulecn;
	}

	@Override
	public String toString() {
		return "Permissions [iD=" + iD + " , text=" + text + " , state=" + state + " , iconCls=" + iconCls + " , pid=" + pid + " , controller=" + controller + " , resourceid=" + resourceid + " , authtype=" + authtype + " , iframe=" + iframe + " , modulecn=" + modulecn + "  ]";
	
	}
	
	
}
