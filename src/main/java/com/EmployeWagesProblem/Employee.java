package com.EmployeWagesProblem;

import java.util.Random;
public class Employee {
	public static void main(String arg[])
	{
		Random result = new Random();
		int value= result.nextInt(3);
		switch(value)
		{
			case 1:
			{
				System.out.println("Part Time Wages is :"+(int)(4*120));
				break;
			}
			case 2:
			{
				System.out.println("Full Time Wages is "+(int)(8*120));
				break;
			}
			default:
			{
				System.out.println("NO JOB--NO WAGES");
			}
		}
	}
}
