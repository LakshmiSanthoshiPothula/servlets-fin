package com.training.entity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

public class BankAccount {
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	int id;
	String customerName;
	double balance;
	Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", customerName=" + customerName
				+ ", balance=" + balance + "]";
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setDate1(String str ) {
		
		SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
		Date d1;
		try {
			d1 = format.parse(str);
			this.date=d1;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
