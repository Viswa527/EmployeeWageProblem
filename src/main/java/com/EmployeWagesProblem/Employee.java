package com.EmployeWagesProblem;

import java.util.Random;
public class Employee {
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
			hours=hours+emphours;
			monthlySalary=monthlySalary+(120*emphours);
		}
		System.out.println("Emloyee Monthly Wages : "+monthlySalary);
	}
}
