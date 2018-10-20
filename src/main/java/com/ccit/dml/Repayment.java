package com.ccit.dml;

import com.alibaba.fastjson.JSONObject;

/**
 * repayment实体类
 * 
 * @author 
 *
 */
public class Repayment {
	/**标识*/
	private String id; 
	/**投资人*/
	private String rname; 
	/**投资金额*/
	private String rmoney; 
	/**状态(0：收益中1：收益完成)*/
	private String rState; 
	/**投资时间*/
	private String rtime; 
	/**项目id*/
	private String bid; 
	/**
	 * 实例化
	 */
	public Repayment() {
		super();
	}
	/**
	 * 实例化
	 * 
	 * @param obj
	 */
	public Repayment(JSONObject obj) {
		this();
		if (obj.get("id") instanceof String) {
			this.setId((String) obj.get("id"));
		}
		if (obj.get("rname") instanceof String) {
			this.setRname((String) obj.get("rname"));
		}
		if (obj.get("rmoney") instanceof String) {
			this.setRmoney((String) obj.get("rmoney"));
		}
		if (obj.get("rState") instanceof String) {
			this.setRState((String) obj.get("rState"));
		}
		if (obj.get("rtime") instanceof String) {
			this.setRtime((String) obj.get("rtime"));
		}
		if (obj.get("bid") instanceof String) {
			this.setBid((String) obj.get("bid"));
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
		if (this.getRname() != null) {
			result.put("rname",this.getRname());
		}
		if (this.getRmoney() != null) {
			result.put("rmoney",this.getRmoney());
		}
		if (this.getRState() != null) {
			result.put("rState",this.getRState());
		}
		if (this.getRtime() != null) {
			result.put("rtime",this.getRtime());
		}
		if (this.getBid() != null) {
			result.put("bid",this.getBid());
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
	 * 获取rname
	 * 
	 * @return
	 */
	public String getRname() {
		return rname;
	}

	/**
	 * 设置rname
	 * 
	 * @param rname
	 */
	public void setRname(String rname) {
		this.rname = rname;
	}
	
	/**
	 * 获取rmoney
	 * 
	 * @return
	 */
	public String getRmoney() {
		return rmoney;
	}

	/**
	 * 设置rmoney
	 * 
	 * @param rmoney
	 */
	public void setRmoney(String rmoney) {
		this.rmoney = rmoney;
	}
	
	/**
	 * 获取rState
	 * 
	 * @return
	 */
	public String getRState() {
		return rState;
	}

	/**
	 * 设置rState
	 * 
	 * @param rState
	 */
	public void setRState(String rState) {
		this.rState = rState;
	}
	
	/**
	 * 获取rtime
	 * 
	 * @return
	 */
	public String getRtime() {
		return rtime;
	}

	/**
	 * 设置rtime
	 * 
	 * @param rtime
	 */
	public void setRtime(String rtime) {
		this.rtime = rtime;
	}
	
	/**
	 * 获取bid
	 * 
	 * @return
	 */
	public String getBid() {
		return bid;
	}

	/**
	 * 设置bid
	 * 
	 * @param bid
	 */
	public void setBid(String bid) {
		this.bid = bid;
	}

	@Override
	public String toString() {
		return "Repayment [id=" + id + " , rname=" + rname + " , rmoney=" + rmoney + " , rState=" + rState + " , rtime=" + rtime + " , bid=" + bid + "  ]";
	
	}
	
	
}
