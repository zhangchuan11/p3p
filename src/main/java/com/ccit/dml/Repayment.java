package com.ccit.dml;

import com.alibaba.fastjson.JSONObject;

/**
 * repayment实体类
 * 
 * @author 
 *
 */
public class Repayment {
	/***/
	private String id; 
	/**还款人*/
	private String rName; 
	/**还款金额*/
	private Double rMoney; 
	/**还款总金额*/
	private Double rAllmoney; 
	/**剩余还款金额*/
	private Double rResiduemoney; 
	/**还款时间*/
	private String rTime; 
	/**还款方式*/
	private String rWay; 
	/**状态(0：还款中1：逾期中)*/
	private String rState; 
	/**产品类型*/
	private String rProductId; 
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
		if (obj.get("rName") instanceof String) {
			this.setRName((String) obj.get("rName"));
		}
		if (obj.get("rMoney") instanceof Number) {
			this.setRMoney(((Number) obj.get("rMoney")).doubleValue());
		}
		if (obj.get("rAllmoney") instanceof Number) {
			this.setRAllmoney(((Number) obj.get("rAllmoney")).doubleValue());
		}
		if (obj.get("rResiduemoney") instanceof Number) {
			this.setRResiduemoney(((Number) obj.get("rResiduemoney")).doubleValue());
		}
		if (obj.get("rTime") instanceof String) {
			this.setRTime((String) obj.get("rTime"));
		}
		if (obj.get("rWay") instanceof String) {
			this.setRWay((String) obj.get("rWay"));
		}
		if (obj.get("rState") instanceof String) {
			this.setRState((String) obj.get("rState"));
		}
		if (obj.get("rProductId") instanceof String) {
			this.setRProductId((String) obj.get("rProductId"));
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
		if (this.getRName() != null) {
			result.put("rName",this.getRName());
		}
		if (this.getRMoney() != null) {
			result.put("rMoney",this.getRMoney());
		}
		if (this.getRAllmoney() != null) {
			result.put("rAllmoney",this.getRAllmoney());
		}
		if (this.getRResiduemoney() != null) {
			result.put("rResiduemoney",this.getRResiduemoney());
		}
		if (this.getRTime() != null) {
			result.put("rTime",this.getRTime());
		}
		if (this.getRWay() != null) {
			result.put("rWay",this.getRWay());
		}
		if (this.getRState() != null) {
			result.put("rState",this.getRState());
		}
		if (this.getRProductId() != null) {
			result.put("rProductId",this.getRProductId());
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
	 * 获取rName
	 * 
	 * @return
	 */
	public String getRName() {
		return rName;
	}

	/**
	 * 设置rName
	 * 
	 * @param rName
	 */
	public void setRName(String rName) {
		this.rName = rName;
	}
	
	/**
	 * 获取rMoney
	 * 
	 * @return
	 */
	public Double getRMoney() {
		return rMoney;
	}

	/**
	 * 设置rMoney
	 * 
	 * @param rMoney
	 */
	public void setRMoney(Double rMoney) {
		this.rMoney = rMoney;
	}
	
	/**
	 * 获取rAllmoney
	 * 
	 * @return
	 */
	public Double getRAllmoney() {
		return rAllmoney;
	}

	/**
	 * 设置rAllmoney
	 * 
	 * @param rAllmoney
	 */
	public void setRAllmoney(Double rAllmoney) {
		this.rAllmoney = rAllmoney;
	}
	
	/**
	 * 获取rResiduemoney
	 * 
	 * @return
	 */
	public Double getRResiduemoney() {
		return rResiduemoney;
	}

	/**
	 * 设置rResiduemoney
	 * 
	 * @param rResiduemoney
	 */
	public void setRResiduemoney(Double rResiduemoney) {
		this.rResiduemoney = rResiduemoney;
	}
	
	/**
	 * 获取rTime
	 * 
	 * @return
	 */
	public String getRTime() {
		return rTime;
	}

	/**
	 * 设置rTime
	 * 
	 * @param rTime
	 */
	public void setRTime(String rTime) {
		this.rTime = rTime;
	}
	
	/**
	 * 获取rWay
	 * 
	 * @return
	 */
	public String getRWay() {
		return rWay;
	}

	/**
	 * 设置rWay
	 * 
	 * @param rWay
	 */
	public void setRWay(String rWay) {
		this.rWay = rWay;
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
	 * 获取rProductId
	 * 
	 * @return
	 */
	public String getRProductId() {
		return rProductId;
	}

	/**
	 * 设置rProductId
	 * 
	 * @param rProductId
	 */
	public void setRProductId(String rProductId) {
		this.rProductId = rProductId;
	}

	@Override
	public String toString() {
		return "Repayment [id=" + id + " , rName=" + rName + " , rMoney=" + rMoney + " , rAllmoney=" + rAllmoney + " , rResiduemoney=" + rResiduemoney + " , rTime=" + rTime + " , rWay=" + rWay + " , rState=" + rState + " , rProductId=" + rProductId + "  ]";
	
	}
	
	
}
