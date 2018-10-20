package com.ccit.dml;

import com.alibaba.fastjson.JSONObject;

/**
 * rbill实体类
 * 
 * @author 
 *
 */
public class Rbill {
	/**投资id*/
	private String rid; 
	/**投资人*/
	private String userid; 
	/**投资总金额*/
	private String summoney; 
	/**投资时间*/
	private String rtime; 
	/**结束时间*/
	private String endtime; 
	/**预计总收益*/
	private String ymoney; 
	/**已经收益*/
	private String amoney; 
	/**
	 * 实例化
	 */
	public Rbill() {
		super();
	}
	/**
	 * 实例化
	 * 
	 * @param obj
	 */
	public Rbill(JSONObject obj) {
		this();
		if (obj.get("rid") instanceof String) {
			this.setRid((String) obj.get("rid"));
		}
		if (obj.get("userid") instanceof String) {
			this.setUserid((String) obj.get("userid"));
		}
		if (obj.get("summoney") instanceof String) {
			this.setSummoney((String) obj.get("summoney"));
		}
		if (obj.get("rtime") instanceof String) {
			this.setRtime((String) obj.get("rtime"));
		}
		if (obj.get("endtime") instanceof String) {
			this.setEndtime((String) obj.get("endtime"));
		}
		if (obj.get("ymoney") instanceof String) {
			this.setYmoney((String) obj.get("ymoney"));
		}
		if (obj.get("amoney") instanceof String) {
			this.setAmoney((String) obj.get("amoney"));
		}
	}
	
	/**
	 * 将当前对象转换为JsonObject
	 * 
	 * @return
	 */
	public JSONObject toJson() {
		JSONObject result = new JSONObject();
		if (this.getRid() != null) {
			result.put("rid",this.getRid());
		}
		if (this.getUserid() != null) {
			result.put("userid",this.getUserid());
		}
		if (this.getSummoney() != null) {
			result.put("summoney",this.getSummoney());
		}
		if (this.getRtime() != null) {
			result.put("rtime",this.getRtime());
		}
		if (this.getEndtime() != null) {
			result.put("endtime",this.getEndtime());
		}
		if (this.getYmoney() != null) {
			result.put("ymoney",this.getYmoney());
		}
		if (this.getAmoney() != null) {
			result.put("amoney",this.getAmoney());
		}
		return result;
	}
	
	
	/**
	 * 获取rid
	 * 
	 * @return
	 */
	public String getRid() {
		return rid;
	}

	/**
	 * 设置rid
	 * 
	 * @param rid
	 */
	public void setRid(String rid) {
		this.rid = rid;
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
	 * 获取summoney
	 * 
	 * @return
	 */
	public String getSummoney() {
		return summoney;
	}

	/**
	 * 设置summoney
	 * 
	 * @param summoney
	 */
	public void setSummoney(String summoney) {
		this.summoney = summoney;
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
	 * 获取endtime
	 * 
	 * @return
	 */
	public String getEndtime() {
		return endtime;
	}

	/**
	 * 设置endtime
	 * 
	 * @param endtime
	 */
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	
	/**
	 * 获取ymoney
	 * 
	 * @return
	 */
	public String getYmoney() {
		return ymoney;
	}

	/**
	 * 设置ymoney
	 * 
	 * @param ymoney
	 */
	public void setYmoney(String ymoney) {
		this.ymoney = ymoney;
	}
	
	/**
	 * 获取amoney
	 * 
	 * @return
	 */
	public String getAmoney() {
		return amoney;
	}

	/**
	 * 设置amoney
	 * 
	 * @param amoney
	 */
	public void setAmoney(String amoney) {
		this.amoney = amoney;
	}

	@Override
	public String toString() {
		return "Rbill [rid=" + rid + " , userid=" + userid + " , summoney=" + summoney + " , rtime=" + rtime + " , endtime=" + endtime + " , ymoney=" + ymoney + " , amoney=" + amoney + "  ]";
	
	}
	
	
}
