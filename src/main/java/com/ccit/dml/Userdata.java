package com.ccit.dml;

import com.alibaba.fastjson.JSONObject;

/**
 * userdata实体类
 * 
 * @author 
 *
 */
public class Userdata {
	/***/
	private String id; 
	/**姓名*/
	private String name; 
	/**电话*/
	private Integer phoneNumber; 
	/**身份证号码*/
	private Integer idNumber; 
	/**地址*/
	private String address; 
	/**银行卡*/
	private Integer bankCard; 
	/**信用积分*/
	private Integer creditIntegral; 
	/**信用等级*/
	private String creditGrade; 
	/**
	 * 实例化
	 */
	public Userdata() {
		super();
	}
	/**
	 * 实例化
	 * 
	 * @param obj
	 */
	public Userdata(JSONObject obj) {
		this();
		if (obj.get("id") instanceof String) {
			this.setId((String) obj.get("id"));
		}
		if (obj.get("name") instanceof String) {
			this.setName((String) obj.get("name"));
		}
		if (obj.get("phoneNumber") instanceof Number) {
			this.setPhoneNumber(((Number) obj.get("phoneNumber")).intValue());
		}
		if (obj.get("idNumber") instanceof Number) {
			this.setIdNumber(((Number) obj.get("idNumber")).intValue());
		}
		if (obj.get("address") instanceof String) {
			this.setAddress((String) obj.get("address"));
		}
		if (obj.get("bankCard") instanceof Number) {
			this.setBankCard(((Number) obj.get("bankCard")).intValue());
		}
		if (obj.get("creditIntegral") instanceof Number) {
			this.setCreditIntegral(((Number) obj.get("creditIntegral")).intValue());
		}
		if (obj.get("creditGrade") instanceof String) {
			this.setCreditGrade((String) obj.get("creditGrade"));
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
		if (this.getPhoneNumber() != null) {
			result.put("phoneNumber",this.getPhoneNumber());
		}
		if (this.getIdNumber() != null) {
			result.put("idNumber",this.getIdNumber());
		}
		if (this.getAddress() != null) {
			result.put("address",this.getAddress());
		}
		if (this.getBankCard() != null) {
			result.put("bankCard",this.getBankCard());
		}
		if (this.getCreditIntegral() != null) {
			result.put("creditIntegral",this.getCreditIntegral());
		}
		if (this.getCreditGrade() != null) {
			result.put("creditGrade",this.getCreditGrade());
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
	 * 获取phoneNumber
	 * 
	 * @return
	 */
	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * 设置phoneNumber
	 * 
	 * @param phoneNumber
	 */
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * 获取idNumber
	 * 
	 * @return
	 */
	public Integer getIdNumber() {
		return idNumber;
	}

	/**
	 * 设置idNumber
	 * 
	 * @param idNumber
	 */
	public void setIdNumber(Integer idNumber) {
		this.idNumber = idNumber;
	}
	
	/**
	 * 获取address
	 * 
	 * @return
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 设置address
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * 获取bankCard
	 * 
	 * @return
	 */
	public Integer getBankCard() {
		return bankCard;
	}

	/**
	 * 设置bankCard
	 * 
	 * @param bankCard
	 */
	public void setBankCard(Integer bankCard) {
		this.bankCard = bankCard;
	}
	
	/**
	 * 获取creditIntegral
	 * 
	 * @return
	 */
	public Integer getCreditIntegral() {
		return creditIntegral;
	}

	/**
	 * 设置creditIntegral
	 * 
	 * @param creditIntegral
	 */
	public void setCreditIntegral(Integer creditIntegral) {
		this.creditIntegral = creditIntegral;
	}
	
	/**
	 * 获取creditGrade
	 * 
	 * @return
	 */
	public String getCreditGrade() {
		return creditGrade;
	}

	/**
	 * 设置creditGrade
	 * 
	 * @param creditGrade
	 */
	public void setCreditGrade(String creditGrade) {
		this.creditGrade = creditGrade;
	}

	@Override
	public String toString() {
		return "Userdata [id=" + id + " , name=" + name + " , phoneNumber=" + phoneNumber + " , idNumber=" + idNumber + " , address=" + address + " , bankCard=" + bankCard + " , creditIntegral=" + creditIntegral + " , creditGrade=" + creditGrade + "  ]";
	
	}
	
	
}
