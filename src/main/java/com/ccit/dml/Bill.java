package com.ccit.dml;

import com.alibaba.fastjson.JSONObject;

/**
 * bill实体类
 * 
 * @author 
 *
 */
public class Bill {
	/**标识*/
	private String id; 
	/**借款信息id*/
	private String borrowId; 
	/**用户id*/
	private String userid; 
	/**借款金额*/
	private String bmoney; 
	/**还款金额*/
	private String rmoney; 
	/**剩余金额*/
	private String smoney; 
	/**借款时间*/
	private String btime; 
	/**还款时间*/
	private String rtime; 
	/**
	 * 实例化
	 */
	public Bill() {
		super();
	}
	/**
	 * 实例化
	 * 
	 * @param obj
	 */
	public Bill(JSONObject obj) {
		this();
		if (obj.get("id") instanceof String) {
			this.setId((String) obj.get("id"));
		}
		if (obj.get("borrowId") instanceof String) {
			this.setBorrowId((String) obj.get("borrowId"));
		}
		if (obj.get("userid") instanceof String) {
			this.setUserid((String) obj.get("userid"));
		}
		if (obj.get("bmoney") instanceof String) {
			this.setBmoney((String) obj.get("bmoney"));
		}
		if (obj.get("rmoney") instanceof String) {
			this.setRmoney((String) obj.get("rmoney"));
		}
		if (obj.get("smoney") instanceof String) {
			this.setSmoney((String) obj.get("smoney"));
		}
		if (obj.get("btime") instanceof String) {
			this.setBtime((String) obj.get("btime"));
		}
		if (obj.get("rtime") instanceof String) {
			this.setRtime((String) obj.get("rtime"));
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
		if (this.getBorrowId() != null) {
			result.put("borrowId",this.getBorrowId());
		}
		if (this.getUserid() != null) {
			result.put("userid",this.getUserid());
		}
		if (this.getBmoney() != null) {
			result.put("bmoney",this.getBmoney());
		}
		if (this.getRmoney() != null) {
			result.put("rmoney",this.getRmoney());
		}
		if (this.getSmoney() != null) {
			result.put("smoney",this.getSmoney());
		}
		if (this.getBtime() != null) {
			result.put("btime",this.getBtime());
		}
		if (this.getRtime() != null) {
			result.put("rtime",this.getRtime());
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
	 * 获取borrowId
	 * 
	 * @return
	 */
	public String getBorrowId() {
		return borrowId;
	}

	/**
	 * 设置borrowId
	 * 
	 * @param borrowId
	 */
	public void setBorrowId(String borrowId) {
		this.borrowId = borrowId;
	}
	
	/**
	 * 获取userid
	 * 
	 * @return
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * 设置userid
	 * 
	 * @param userid
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取bmoney
	 * 
	 * @return
	 */
	public String getBmoney() {
		return bmoney;
	}

	/**
	 * 设置bmoney
	 * 
	 * @param bmoney
	 */
	public void setBmoney(String bmoney) {
		this.bmoney = bmoney;
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
	 * 获取smoney
	 * 
	 * @return
	 */
	public String getSmoney() {
		return smoney;
	}

	/**
	 * 设置smoney
	 * 
	 * @param smoney
	 */
	public void setSmoney(String smoney) {
		this.smoney = smoney;
	}
	
	/**
	 * 获取btime
	 * 
	 * @return
	 */
	public String getBtime() {
		return btime;
	}

	/**
	 * 设置btime
	 * 
	 * @param btime
	 */
	public void setBtime(String btime) {
		this.btime = btime;
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

	@Override
	public String toString() {
		return "Bill [id=" + id + " , borrowId=" + borrowId + " , userid=" + userid + " , bmoney=" + bmoney + " , rmoney=" + rmoney + " , smoney=" + smoney + " , btime=" + btime + " , rtime=" + rtime + "  ]";
	
	}
	
	
}
