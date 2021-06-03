package Entities;

import Abstract.Entity;

public class User implements Entity {
	private int saleId;
	private String type;
	private String saleDate;
	
	public User(int saleId, String type, String saleDate) {
		super();
		this.saleId = saleId;
		this.type = type;
		this.saleDate = saleDate;
	}
	public User() {
		
	}

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
	}
	
	
	
	
	
}
