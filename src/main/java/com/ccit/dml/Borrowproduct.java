package com.ccit.dml;

import com.alibaba.fastjson.JSONObject;

/**
 * borrowproduct实体类
 * 
 * @author 
 *
 */
public class Borrowproduct {
	/**标识*/
	private String id; 
	/**类型*/
	private String type; 
	/**期限*/
	private String deadline; 
	/**信用等级条件*/
	private String conditio; 
	/**年利率*/
	private Double reta; 
	/**
	 * 实例化
	 */
	public Borrowproduct() {
		super();
	}
	/**
	 * 实例化
	 * 
	 * @param obj
	 */
	public Borrowproduct(JSONObject obj) {
		this();
		if (obj.get("id") instanceof String) {
			this.setId((String) obj.get("id"));
		}
		if (obj.get("type") instanceof String) {
			this.setType((String) obj.get("type"));
		}
		if (obj.get("deadline") instanceof String) {
			this.setDeadline((String) obj.get("deadline"));
		}
		if (obj.get("conditio") instanceof String) {
			this.setConditio((String) obj.get("conditio"));
		}
		if (obj.get("reta") instanceof Number) {
			this.setReta(((Number) obj.get("reta")).doubleValue());
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
		if (this.getType() != null) {
			result.put("type",this.getType());
		}
		if (this.getDeadline() != null) {
			result.put("deadline",this.getDeadline());
		}
		if (this.getConditio() != null) {
			result.put("conditio",this.getConditio());
		}
		if (this.getReta() != null) {
			result.put("reta",this.getReta());
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
	 * 获取type
	 * 
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * 设置type
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
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
	 * 获取reta
	 * 
	 * @return
	 */
	public Double getReta() {
		return reta;
	}

	/**
	 * 设置reta
	 * 
	 * @param reta
	 */
	public void setReta(Double reta) {
		this.reta = reta;
	}

	@Override
	public String toString() {
		return "Borrowproduct [id=" + id + " , type=" + type + " , deadline=" + deadline + " , conditio=" + conditio + " , reta=" + reta + "  ]";
	
	}
	
	
}
