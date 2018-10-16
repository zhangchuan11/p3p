package com.ccit.dml;

import com.alibaba.fastjson.JSONObject;

/**
 * capital实体类
 * 
 * @author 
 *
 */
public class Capital {
	/**标识*/
	private String iD; 
	/**余额*/
	private Double balance; 
	/**冻结余额*/
	private Double blockedBalances; 
	/**
	 * 实例化
	 */
	public Capital() {
		super();
	}
	/**
	 * 实例化
	 * 
	 * @param obj
	 */
	public Capital(JSONObject obj) {
		this();
		if (obj.get("iD") instanceof String) {
			this.setID((String) obj.get("iD"));
		}
		if (obj.get("balance") instanceof Number) {
			this.setBalance(((Number) obj.get("balance")).doubleValue());
		}
		if (obj.get("blockedBalances") instanceof Number) {
			this.setBlockedBalances(((Number) obj.get("blockedBalances")).doubleValue());
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
		if (this.getBalance() != null) {
			result.put("balance",this.getBalance());
		}
		if (this.getBlockedBalances() != null) {
			result.put("blockedBalances",this.getBlockedBalances());
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
	 * 获取balance
	 * 
	 * @return
	 */
	public Double getBalance() {
		return balance;
	}

	/**
	 * 设置balance
	 * 
	 * @param balance
	 */
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	/**
	 * 获取blockedBalances
	 * 
	 * @return
	 */
	public Double getBlockedBalances() {
		return blockedBalances;
	}

	/**
	 * 设置blockedBalances
	 * 
	 * @param blockedBalances
	 */
	public void setBlockedBalances(Double blockedBalances) {
		this.blockedBalances = blockedBalances;
	}

	@Override
	public String toString() {
		return "Capital [iD=" + iD + " , balance=" + balance + " , blockedBalances=" + blockedBalances + "  ]";
	
	}
	
	
}
