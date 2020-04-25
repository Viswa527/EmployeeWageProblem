package com.EmployeWagesProblem;

import java.util.Random;
public class Employee {
	public static void main(String arg[])
	{
		Random result = new Random();
		int value= result.nextInt(3);
		if(value==1)
		{
			System.out.println("Part Time Wages is :"+(int)(4*120));
		}
		else if(value==2)
		{
			System.out.println("Full Time Wages is "+(int)(8*120));
		}
		else
		{
			System.out.println("NO JOB--NO WAGES");
		}
	}
}
