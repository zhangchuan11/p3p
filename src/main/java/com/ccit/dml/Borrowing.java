package com.ccit.dml;

import com.alibaba.fastjson.JSONObject;

/**
 * borrowing实体类
 * 
 * @author 
 *
 */
public class Borrowing {
	/**标识*/
	private String iD; 
	/**借款人id*/
	private String nameId; 
	/**借款金额*/
	private String money; 
	/**发布日期*/
	private String beginTime; 
	/**结束日期*/
	private String end; 
	/**电话号码*/
	private String phoneNumber; 
	/**担保证明*/
	private String guarantee; 
	/**总价值*/
	private String amountGuarantee; 
	/**借款用途*/
	private String purpose; 
	/**借款描述*/
	private String describ; 
	/**借款情况*/
	private String conditio; 
	/**状态*/
	private String state; 
	/**保障机构*/
	private String guarantors; 
	/**信用等级条件*/
	private String credit; 
	/**利率*/
	private String reta; 
	/**期限*/
	private String deadTime; 
	/**还款方式*/
	private String rmoneytype; 
	/**借款类型*/
	private String product; 
	/**
	 * 实例化
	 */
	public Borrowing() {
		super();
	}
	/**
	 * 实例化
	 * 
	 * @param obj
	 */
	public Borrowing(JSONObject obj) {
		this();
		if (obj.get("iD") instanceof String) {
			this.setID((String) obj.get("iD"));
		}
		if (obj.get("nameId") instanceof String) {
			this.setNameId((String) obj.get("nameId"));
		}
		if (obj.get("money") instanceof String) {
			this.setMoney((String) obj.get("money"));
		}
		if (obj.get("beginTime") instanceof String) {
			this.setBeginTime((String) obj.get("beginTime"));
		}
		if (obj.get("end") instanceof String) {
			this.setEnd((String) obj.get("end"));
		}
		if (obj.get("phoneNumber") instanceof String) {
			this.setPhoneNumber((String) obj.get("phoneNumber"));
		}
		if (obj.get("guarantee") instanceof String) {
			this.setGuarantee((String) obj.get("guarantee"));
		}
		if (obj.get("amountGuarantee") instanceof String) {
			this.setAmountGuarantee((String) obj.get("amountGuarantee"));
		}
		if (obj.get("purpose") instanceof String) {
			this.setPurpose((String) obj.get("purpose"));
		}
		if (obj.get("describ") instanceof String) {
			this.setDescrib((String) obj.get("describ"));
		}
		if (obj.get("conditio") instanceof String) {
			this.setConditio((String) obj.get("conditio"));
		}
		if (obj.get("state") instanceof String) {
			this.setState((String) obj.get("state"));
		}
		if (obj.get("guarantors") instanceof String) {
			this.setGuarantors((String) obj.get("guarantors"));
		}
		if (obj.get("credit") instanceof String) {
			this.setCredit((String) obj.get("credit"));
		}
		if (obj.get("reta") instanceof String) {
			this.setReta((String) obj.get("reta"));
		}
		if (obj.get("deadTime") instanceof String) {
			this.setDeadTime((String) obj.get("deadTime"));
		}
		if (obj.get("rmoneytype") instanceof String) {
			this.setRmoneytype((String) obj.get("rmoneytype"));
		}
		if (obj.get("product") instanceof String) {
			this.setProduct((String) obj.get("product"));
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
		if (this.getNameId() != null) {
			result.put("nameId",this.getNameId());
		}
		if (this.getMoney() != null) {
			result.put("money",this.getMoney());
		}
		if (this.getBeginTime() != null) {
			result.put("beginTime",this.getBeginTime());
		}
		if (this.getEnd() != null) {
			result.put("end",this.getEnd());
		}
		if (this.getPhoneNumber() != null) {
			result.put("phoneNumber",this.getPhoneNumber());
		}
		if (this.getGuarantee() != null) {
			result.put("guarantee",this.getGuarantee());
		}
		if (this.getAmountGuarantee() != null) {
			result.put("amountGuarantee",this.getAmountGuarantee());
		}
		if (this.getPurpose() != null) {
			result.put("purpose",this.getPurpose());
		}
		if (this.getDescrib() != null) {
			result.put("describ",this.getDescrib());
		}
		if (this.getConditio() != null) {
			result.put("conditio",this.getConditio());
		}
		if (this.getState() != null) {
			result.put("state",this.getState());
		}
		if (this.getGuarantors() != null) {
			result.put("guarantors",this.getGuarantors());
		}
		if (this.getCredit() != null) {
			result.put("credit",this.getCredit());
		}
		if (this.getReta() != null) {
			result.put("reta",this.getReta());
		}
		if (this.getDeadTime() != null) {
			result.put("deadTime",this.getDeadTime());
		}
		if (this.getRmoneytype() != null) {
			result.put("rmoneytype",this.getRmoneytype());
		}
		if (this.getProduct() != null) {
			result.put("product",this.getProduct());
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
	 * 获取nameId
	 * 
	 * @return
	 */
	public String getNameId() {
		return nameId;
	}

	/**
	 * 设置nameId
	 * 
	 * @param nameId
	 */
	public void setNameId(String nameId) {
		this.nameId = nameId;
	}
	
	/**
	 * 获取money
	 * 
	 * @return
	 */
	public String getMoney() {
		return money;
	}

	/**
	 * 设置money
	 * 
	 * @param money
	 */
	public void setMoney(String money) {
		this.money = money;
	}
	
	/**
	 * 获取beginTime
	 * 
	 * @return
	 */
	public String getBeginTime() {
		return beginTime;
	}

	/**
	 * 设置beginTime
	 * 
	 * @param beginTime
	 */
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	
	/**
	 * 获取end
	 * 
	 * @return
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * 设置end
	 * 
	 * @param end
	 */
	public void setEnd(String end) {
		this.end = end;
	}
	
	/**
	 * 获取phoneNumber
	 * 
	 * @return
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * 设置phoneNumber
	 * 
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * 获取guarantee
	 * 
	 * @return
	 */
	public String getGuarantee() {
		return guarantee;
	}

	/**
	 * 设置guarantee
	 * 
	 * @param guarantee
	 */
	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}
	
	/**
	 * 获取amountGuarantee
	 * 
	 * @return
	 */
	public String getAmountGuarantee() {
		return amountGuarantee;
	}

	/**
	 * 设置amountGuarantee
	 * 
	 * @param amountGuarantee
	 */
	public void setAmountGuarantee(String amountGuarantee) {
		this.amountGuarantee = amountGuarantee;
	}
	
	/**
	 * 获取purpose
	 * 
	 * @return
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * 设置purpose
	 * 
	 * @param purpose
	 */
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	/**
	 * 获取describ
	 * 
	 * @return
	 */
	public String getDescrib() {
		return describ;
	}

	/**
	 * 设置describ
	 * 
	 * @param describ
	 */
	public void setDescrib(String describ) {
		this.describ = describ;
	}
	
	/**
	 * 获取conditio
	 * 
	 * @return
	 */
	public String getConditio() {
		return conditio;
	}

	/**
	 * 设置conditio
	 * 
	 * @param conditio
	 */
	public void setConditio(String conditio) {
		this.conditio = conditio;
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
	 * 获取guarantors
	 * 
	 * @return
	 */
	public String getGuarantors() {
		return guarantors;
	}

	/**
	 * 设置guarantors
	 * 
	 * @param guarantors
	 */
	public void setGuarantors(String guarantors) {
		this.guarantors = guarantors;
	}
	
	/**
	 * 获取credit
	 * 
	 * @return
	 */
	public String getCredit() {
		return credit;
	}

	/**
	 * 设置credit
	 * 
	 * @param credit
	 */
	public void setCredit(String credit) {
		this.credit = credit;
	}
	
	/**
	 * 获取reta
	 * 
	 * @return
	 */
	public String getReta() {
		return reta;
	}

	/**
	 * 设置reta
	 * 
	 * @param reta
	 */
	public void setReta(String reta) {
		this.reta = reta;
	}
	
	/**
	 * 获取deadTime
	 * 
	 * @return
	 */
	public String getDeadTime() {
		return deadTime;
	}

	/**
	 * 设置deadTime
	 * 
	 * @param deadTime
	 */
	public void setDeadTime(String deadTime) {
		this.deadTime = deadTime;
	}
	
	/**
	 * 获取rmoneytype
	 * 
	 * @return
	 */
	public String getRmoneytype() {
		return rmoneytype;
	}

	/**
	 * 设置rmoneytype
	 * 
	 * @param rmoneytype
	 */
	public void setRmoneytype(String rmoneytype) {
		this.rmoneytype = rmoneytype;
	}
	
	/**
	 * 获取product
	 * 
	 * @return
	 */
	public String getProduct() {
		return product;
	}

	/**
	 * 设置product
	 * 
	 * @param product
	 */
	public void setProduct(String product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Borrowing [iD=" + iD + " , nameId=" + nameId + " , money=" + money + " , beginTime=" + beginTime + " , end=" + end + " , phoneNumber=" + phoneNumber + " , guarantee=" + guarantee + " , amountGuarantee=" + amountGuarantee + " , purpose=" + purpose + " , describ=" + describ + " , conditio=" + conditio + " , state=" + state + " , guarantors=" + guarantors + " , credit=" + credit + " , reta=" + reta + " , deadTime=" + deadTime + " , rmoneytype=" + rmoneytype + " , product=" + product + "  ]";
	
	}
	
	
}
