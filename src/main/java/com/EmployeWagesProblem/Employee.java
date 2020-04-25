package com.EmployeWagesProblem;

import java.util.Random;
public class Employee {
	public static void main(String arg[])
	{
		if(EmployeeAttendence())
		{
		System.out.println("Employee Present");
		}
		else
		{
			System.out.println("Employee Absent");
		}
	}
	public static boolean EmployeeAttendence()
	{
		Random result = new Random();
		return result.nextBoolean();
	}

}
