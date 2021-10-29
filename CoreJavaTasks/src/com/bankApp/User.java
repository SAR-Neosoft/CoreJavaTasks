package com.bankApp;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;




class User implements Serializable{
	
	private String name;
	private String address;
	private String phone;
	private String username;
	private String password;
	private double amount;
	private Date date ;

	public User(String name, String address, String phone, String username, String password, double amount, Date date) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.amount = amount;
		this.date = date;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public  double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", phone=" + phone + ", username=" + username
				+ ", password=" + password + ", amount=" + amount + ", date=" + date + "]";
	}
	

	
}