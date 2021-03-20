package com.crx.wpy;

public class Customer {
	String id;
	String name;
	float amount;
	String phonenumber;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", amount=" + amount + ", phonenumber=" + phonenumber + "]";
	}
	public Customer() {
		super();
	}
	public Customer(String id, String name, float amount, String phonenumber) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.phonenumber = phonenumber;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


}
