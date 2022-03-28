package com.Bike;

public class Bike 
{
	private String Brand;
	private String Model;
	private String Color;
	private int Price;
	private int Mileage;
	public Bike(String brand, String model, String color, int price, int mileage) {
		super();
		Brand = brand;
		Model = model;
		this.Color = color;
		this.Price = price;
		Mileage = mileage;
	}
	@Override
	public String toString() {
		return "Bike [Brand=" + Brand + ", Model=" + Model + ", Color=" + Color + ", Price=" + Price + ", Mileage="
				+ Mileage + "]";
	}
	
	
}
