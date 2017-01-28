package com.bridgeLabz.programs;

import java.io.Serializable;

public class Customer implements Serializable
{
	private String name;
	private int accNo;
	private double amt;
	
	public Customer(String name) 
	{
		this.name = name;
	}
	
	public int getAccNo() 
	{
		return accNo;
	}

	public void setAccNo(int accNo) 
	{
		this.accNo = accNo;
	}
	public double getAmt()
	{
		return amt;
	}
	public void setAmt(double amt) 
	{
		this.amt = amt;
	}
	@Override
	public String toString()
	{
		return "Customer [name=" + name + ", amt=" + amt + "]";
	}
	
}
