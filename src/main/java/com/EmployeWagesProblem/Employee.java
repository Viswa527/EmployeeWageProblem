package com.EmployeWagesProblem;

import java.util.Random;
public class Employee {
	static int emphours=0;
	static int value = 0;
	public static void get_Working_Hours()
	{
		if(value==1)
		{
			emphours=8;
		}
		else if(value==2)
		{
			emphours=4;
		}
		else
		{
			emphours=0;
		}
	}
	public static void main(String arg[])
	{
		Random result = new Random();
		int monthlySalary=0;
		int hours=0,days=0;
		
		while(hours<=100 && days<=20)
		{
			int emphours=0;
			days++;
			int value=result.nextInt(3);
			get_Working_Hours();
			hours=hours+emphours;
			monthlySalary=monthlySalary+(120*emphours);
		}
		System.out.println("Emloyee Monthly Wages : "+monthlySalary);
	}
}
