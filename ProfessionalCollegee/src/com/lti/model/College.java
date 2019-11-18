package com.lti.model;

public class College {
	private int cid;
	private String cname;
	private String ctype;
	private String city;
	private int fees;
	private int pin;

	
	public College() {
		super();
	}


	public College(int cid, String cname, String ctype, String city, int fees, int pin) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ctype = ctype;
		this.city = city;
		this.fees = fees;
		this.pin = pin;
	}
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	

}





