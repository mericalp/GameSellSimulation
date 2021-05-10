package Entities;

import Abstract.Entity;

public class Campaign implements Entity{
	private String name;
	private int discount;
	private int id;
	
	public Campaign(String name, int discount, int id) {
		super();
		this.name = name;
		this.discount = discount;
		this.id = id;
	}
	
		public Campaign() {
			
		}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
