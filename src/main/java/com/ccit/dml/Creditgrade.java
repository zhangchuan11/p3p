package com.ccit.dml;

import com.alibaba.fastjson.JSONObject;

/**
 * creditgrade实体类
 * 
 * @author 
 *
 */
public class Creditgrade {
	/***/
	private String id; 
	/***/
	private String name; 
	/***/
	private String integral; 
	/***/
	private String loanAmounts; 
	/**
	 * 实例化
	 */
	public Creditgrade() {
		super();
	}
	/**
	 * 实例化
	 * 
	 * @param obj
	 */
	public Creditgrade(JSONObject obj) {
		this();
		if (obj.get("id") instanceof String) {
			this.setId((String) obj.get("id"));
		}
		if (obj.get("name") instanceof String) {
			this.setName((String) obj.get("name"));
		}
		if (obj.get("integral") instanceof String) {
			this.setIntegral((String) obj.get("integral"));
		}
		if (obj.get("loanAmounts") instanceof String) {
			this.setLoanAmounts((String) obj.get("loanAmounts"));
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
		if (this.getName() != null) {
			result.put("name",this.getName());
		}
		if (this.getIntegral() != null) {
			result.put("integral",this.getIntegral());
		}
		if (this.getLoanAmounts() != null) {
			result.put("loanAmounts",this.getLoanAmounts());
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
	 * 获取name
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 获取integral
	 * 
	 * @return
	 */
	public String getIntegral() {
		return integral;
	}

	/**
	 * 设置integral
	 * 
	 * @param integral
	 */
	public void setIntegral(String integral) {
		this.integral = integral;
	}
	
	/**
	 * 获取loanAmounts
	 * 
	 * @return
	 */
	public String getLoanAmounts() {
		return loanAmounts;
	}

	/**
	 * 设置loanAmounts
	 * 
	 * @param loanAmounts
	 */
	public void setLoanAmounts(String loanAmounts) {
		this.loanAmounts = loanAmounts;
	}

	@Override
	public String toString() {
		return "Creditgrade [id=" + id + " , name=" + name + " , integral=" + integral + " , loanAmounts=" + loanAmounts + "  ]";
	
	}
	
	
}
