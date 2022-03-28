package com.Bike;

public class BikeMain
{
	public static void main(String[] args)
	{
		Bike b=new BikeBuilder()
				.setBrand("TVS")
				.setColor("Blue")
				.setMileage(40)
				.setModel("Apache RTR 200")
				.setPrice(180000)
				.getBike();
		System.out.println(b);
		
		Bike c=new BikeBuilder()
				.setBrand("BAJAJ")
				.setColor("Blue")
				.setMileage(40)
				.setModel("NS 200")
				.setPrice(180000)
				.getBike();
		System.out.println(c);
		
		Bike d=new BikeBuilder()
				.setBrand("KTM")
				.setColor("orange")
				.setMileage(40)
				.setModel("RC 200")
				.setPrice(240000)
				.getBike();
		System.out.println(d);
	}
}
