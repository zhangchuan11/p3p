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
	/**借款人姓名*/
	private String name; 
	/**借款金额*/
	private String  money;
	/**借款日期*/
	private String deadline; 
	/**还款日期*/
	private String startDate; 
	/**电话号码*/
	private String  phoneNumber;
	/**担保方式*/
	private String guaranteeType; 
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
	/**借款产品*/
	private String productId; 
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
		if (obj.get("name") instanceof String) {
			this.setName((String) obj.get("name"));
		}
		if (obj.get("money") instanceof String) {
			this.setMoney((String) obj.get("money"));
		}
		if (obj.get("deadline") instanceof String) {
			this.setDeadline((String) obj.get("deadline"));
		}
		if (obj.get("startDate") instanceof String) {
			this.setStartDate((String) obj.get("startDate"));
		}
		if (obj.get("phoneNumber") instanceof String) {
			this.setPhoneNumber((String) obj.get("phoneNumber"));
		}
		if (obj.get("guaranteeType") instanceof String) {
			this.setGuaranteeType((String) obj.get("guaranteeType"));
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
		if (obj.get("productId") instanceof String) {
			this.setProductId((String) obj.get("productId"));
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
		if (this.getName() != null) {
			result.put("name",this.getName());
		}
		if (this.getMoney() != null) {
			result.put("money",this.getMoney());
		}
		if (this.getDeadline() != null) {
			result.put("deadline",this.getDeadline());
		}
		if (this.getStartDate() != null) {
			result.put("startDate",this.getStartDate());
		}
		if (this.getPhoneNumber() != null) {
			result.put("phoneNumber",this.getPhoneNumber());
		}
		if (this.getGuaranteeType() != null) {
			result.put("guaranteeType",this.getGuaranteeType());
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
		if (this.getProductId() != null) {
			result.put("productId",this.getProductId());
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
	 * 获取deadline
	 * 
	 * @return
	 */
	public String getDeadline() {
		return deadline;
	}

	/**
	 * 设置deadline
	 * 
	 * @param deadline
	 */
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	
	/**
	 * 获取startDate
	 * 
	 * @return
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * 设置startDate
	 * 
	 * @param startDate
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
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
	public void setPhoneNumber(String  phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * 获取guaranteeType
	 * 
	 * @return
	 */
	public String getGuaranteeType() {
		return guaranteeType;
	}

	/**
	 * 设置guaranteeType
	 * 
	 * @param guaranteeType
	 */
	public void setGuaranteeType(String guaranteeType) {
		this.guaranteeType = guaranteeType;
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
	 * 获取productId
	 * 
	 * @return
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * 设置productId
	 * 
	 * @param productId
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "Borrowing [iD=" + iD + " , name=" + name + " , money=" + money + " , deadline=" + deadline + " , startDate=" + startDate + " , phoneNumber=" + phoneNumber + " , guaranteeType=" + guaranteeType + " , amountGuarantee=" + amountGuarantee + " , purpose=" + purpose + " , describ=" + describ + " , conditio=" + conditio + " , state=" + state + " , productId=" + productId + "  ]";
	
	}
	
	
}
