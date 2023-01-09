package com.jsp.inheritance;

// composition type of Association

class Engine
{
	int num;
	String brand;
	public Engine(int num, String brand)
	{
		this.num=num;
		this.brand=brand;
		
	}
	public void EngineDetails() 
	{
		System.out.println(num);
		System.out.println(brand);
		
	}
	public String toString()
	{
		return"num="+num+"brand="+brand;
	}
	
}
class CarExtierior
{
	Engine e;
	String colour;
	String brand;
	double price;
	
	public CarExtierior(Engine e,String colour, String brand, double price) 
	{
		this.e=e;
		this.colour=colour;
		this.brand=brand;
		this.price=price;
		
	}
	
	public void CarDetails() 
	{
		System.out.println("Engine details");
		System.out.println(e);
		System.out.println("Car details");
		System.out.println(colour);
		System.out.println(price);
		System.out.println(brand);
	}
}
public class Car {
	public static void main(String[] args) 
	{
		CarExtierior c	=new CarExtierior(new Engine(234,"Tata"),"Black","Range Rover", 5000000);
	    c.CarDetails();
	}
	

}
