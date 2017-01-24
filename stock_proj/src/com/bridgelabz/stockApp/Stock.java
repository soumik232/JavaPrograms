package com.bridgelabz.stockApp;
import java.io.Serializable;

public class Stock implements Serializable 
{
	private String name;
	private int noOfShare;
	private double price;
	public Stock(String name, int noOfShare, double price) 
	{
		this.name = name;
		this.noOfShare = noOfShare;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public int getNoOfShare() {
		return noOfShare;
	}

	public double getPrice() {
		return price;
	}

	public String toString() 
	{
		return "Name :"+name+", no.of share :"+price+", price"+price;
	}
	
	
}
