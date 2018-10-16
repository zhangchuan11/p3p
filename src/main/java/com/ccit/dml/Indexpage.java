package com.ccit.dml;

import com.alibaba.fastjson.JSONObject;

/**
 * indexpage实体类
 * 
 * @author 
 *
 */
public class Indexpage {
	/**标识*/
	private String iD; 
	/**联系电话*/
	private String number; 
	/**商标*/
	private String trademark; 
	/**广告牌*/
	private String advertising; 
	/**公告*/
	private String notice; 
	/**
	 * 实例化
	 */
	public Indexpage() {
		super();
	}
	/**
	 * 实例化
	 * 
	 * @param obj
	 */
	public Indexpage(JSONObject obj) {
		this();
		if (obj.get("iD") instanceof String) {
			this.setID((String) obj.get("iD"));
		}
		if (obj.get("number") instanceof String) {
			this.setNumber((String) obj.get("number"));
		}
		if (obj.get("trademark") instanceof String) {
			this.setTrademark((String) obj.get("trademark"));
		}
		if (obj.get("advertising") instanceof String) {
			this.setAdvertising((String) obj.get("advertising"));
		}
		if (obj.get("notice") instanceof String) {
			this.setNotice((String) obj.get("notice"));
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
		if (this.getNumber() != null) {
			result.put("number",this.getNumber());
		}
		if (this.getTrademark() != null) {
			result.put("trademark",this.getTrademark());
		}
		if (this.getAdvertising() != null) {
			result.put("advertising",this.getAdvertising());
		}
		if (this.getNotice() != null) {
			result.put("notice",this.getNotice());
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
	 * 获取number
	 * 
	 * @return
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * 设置number
	 * 
	 * @param number
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	
	/**
	 * 获取trademark
	 * 
	 * @return
	 */
	public String getTrademark() {
		return trademark;
	}

	/**
	 * 设置trademark
	 * 
	 * @param trademark
	 */
	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}
	
	/**
	 * 获取advertising
	 * 
	 * @return
	 */
	public String getAdvertising() {
		return advertising;
	}

	/**
	 * 设置advertising
	 * 
	 * @param advertising
	 */
	public void setAdvertising(String advertising) {
		this.advertising = advertising;
	}
	
	/**
	 * 获取notice
	 * 
	 * @return
	 */
	public String getNotice() {
		return notice;
	}

	/**
	 * 设置notice
	 * 
	 * @param notice
	 */
	public void setNotice(String notice) {
		this.notice = notice;
	}

	@Override
	public String toString() {
		return "Indexpage [iD=" + iD + " , number=" + number + " , trademark=" + trademark + " , advertising=" + advertising + " , notice=" + notice + "  ]";
	
	}
	
	
}
