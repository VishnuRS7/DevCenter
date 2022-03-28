package com.Bike;

public class BikeBuilder 
{
	private String Brand;
	private String Model;
	private String Color;
	private int Price;
	private int Mileage;
	
	public BikeBuilder setBrand(String brand) {
		Brand = brand;
		return this;
	}
	public BikeBuilder setModel(String model) {
		Model = model;
		return this;
	}
	public BikeBuilder setColor(String color) {
		this.Color = color;
		return this;
	}
	public BikeBuilder setPrice(int price) {
		this.Price = price;
		return this;
	}
	public BikeBuilder setMileage(int mileage) {
		Mileage = mileage;
		return this;
	}
	
	public Bike getBike()
	{
		return new Bike(Brand,Model,Color,Price,Mileage);
	}
	
}
