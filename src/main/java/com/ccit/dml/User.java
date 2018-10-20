package com.ccit.dml;

import com.alibaba.fastjson.JSONObject;

/**
 * user实体类
 * 
 * @author 
 *
 */
public class User {
	/***/
	private String id; 
	/***/
	private String loginName; 
	/***/
	private String passWord; 
	/**״̬*/
	private String loc; 
	/***/
	private String userdateId; 
	/***/
	private String repaymentId; 
	/***/
	private String borrowingId; 
	/***/
	private String roleId; 
	/***/
	private String capitalId; 
	/**
	 * 实例化
	 */
	public User() {
		super();
	}
	/**
	 * 实例化
	 * 
	 * @param obj
	 */
	public User(JSONObject obj) {
		this();
		if (obj.get("id") instanceof String) {
			this.setId((String) obj.get("id"));
		}
		if (obj.get("loginName") instanceof String) {
			this.setLoginName((String) obj.get("loginName"));
		}
		if (obj.get("passWord") instanceof String) {
			this.setPassWord((String) obj.get("passWord"));
		}
		if (obj.get("loc") instanceof String) {
			this.setLoc((String) obj.get("loc"));
		}
		if (obj.get("userdateId") instanceof String) {
			this.setUserdateId((String) obj.get("userdateId"));
		}
		if (obj.get("repaymentId") instanceof String) {
			this.setRepaymentId((String) obj.get("repaymentId"));
		}
		if (obj.get("borrowingId") instanceof String) {
			this.setBorrowingId((String) obj.get("borrowingId"));
		}
		if (obj.get("roleId") instanceof String) {
			this.setRoleId((String) obj.get("roleId"));
		}
		if (obj.get("capitalId") instanceof String) {
			this.setCapitalId((String) obj.get("capitalId"));
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
		if (this.getLoginName() != null) {
			result.put("loginName",this.getLoginName());
		}
		if (this.getPassWord() != null) {
			result.put("passWord",this.getPassWord());
		}
		if (this.getLoc() != null) {
			result.put("loc",this.getLoc());
		}
		if (this.getUserdateId() != null) {
			result.put("userdateId",this.getUserdateId());
		}
		if (this.getRepaymentId() != null) {
			result.put("repaymentId",this.getRepaymentId());
		}
		if (this.getBorrowingId() != null) {
			result.put("borrowingId",this.getBorrowingId());
		}
		if (this.getRoleId() != null) {
			result.put("roleId",this.getRoleId());
		}
		if (this.getCapitalId() != null) {
			result.put("capitalId",this.getCapitalId());
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
	 * 获取loginName
	 * 
	 * @return
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * 设置loginName
	 * 
	 * @param loginName
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	/**
	 * 获取passWord
	 * 
	 * @return
	 */
	public String getPassWord() {
		return passWord;
	}

	/**
	 * 设置passWord
	 * 
	 * @param passWord
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	/**
	 * 获取loc
	 * 
	 * @return
	 */
	public String getLoc() {
		return loc;
	}

	/**
	 * 设置loc
	 * 
	 * @param loc
	 */
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	/**
	 * 获取userdateId
	 * 
	 * @return
	 */
	public String getUserdateId() {
		return userdateId;
	}

	/**
	 * 设置userdateId
	 * 
	 * @param userdateId
	 */
	public void setUserdateId(String userdateId) {
		this.userdateId = userdateId;
	}
	
	/**
	 * 获取repaymentId
	 * 
	 * @return
	 */
	public String getRepaymentId() {
		return repaymentId;
	}

	/**
	 * 设置repaymentId
	 * 
	 * @param repaymentId
	 */
	public void setRepaymentId(String repaymentId) {
		this.repaymentId = repaymentId;
	}
	
	/**
	 * 获取borrowingId
	 * 
	 * @return
	 */
	public String getBorrowingId() {
		return borrowingId;
	}

	/**
	 * 设置borrowingId
	 * 
	 * @param borrowingId
	 */
	public void setBorrowingId(String borrowingId) {
		this.borrowingId = borrowingId;
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
	 * 获取capitalId
	 * 
	 * @return
	 */
	public String getCapitalId() {
		return capitalId;
	}

	/**
	 * 设置capitalId
	 * 
	 * @param capitalId
	 */
	public void setCapitalId(String capitalId) {
		this.capitalId = capitalId;
	}

	@Override
	public String toString() {
		return "User [id=" + id + " , loginName=" + loginName + " , passWord=" + passWord + " , loc=" + loc + " , userdateId=" + userdateId + " , repaymentId=" + repaymentId + " , borrowingId=" + borrowingId + " , roleId=" + roleId + " , capitalId=" + capitalId + "  ]";
	
	}
	
	
}
