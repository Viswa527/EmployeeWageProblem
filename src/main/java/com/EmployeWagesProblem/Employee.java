package com.EmployeWagesProblem;

import java.util.Random;
public class Employee {
	public static void main(String arg[])
	{
		Random result = new Random();
		int monthlySalary=0;
		for(int i=1;i<=20;i++)
		{
			int hours=0;
			int value= result.nextInt(2);
			if(value==1)
			{
				hours=8;
			}
			else if(value==2)
			{
				hours=4;
			}
			else
			{
				hours=0;
			}
			monthlySalary=monthlySalary+(120*hours);
		}
		System.out.println("Monthly Salary is :"+monthlySalary);
	}
}
