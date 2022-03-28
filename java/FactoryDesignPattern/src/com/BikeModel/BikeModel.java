package com.BikeModel;

public class BikeModel 
{
	public Model getInstance(String str)
	{
		if(str.equals("TVS"))
			return new TVS();
		else if(str.equals("BAJAJ"))
			return new Bajaj();
		else
			return new KTM();
	}
}
