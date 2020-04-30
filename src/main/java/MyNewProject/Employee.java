package MyNewProject;

import java.util.Random;
import java.util.Scanner;	
class Employee 
{
	static int emphours=0;
	static int value = 0;
	static int working_Hours_Per_Month=0;
	static int monthlySalary=0;

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
			emphours=1;
		}
	}
	public static void calculate_salary(int wages_PerHour,int workingDays)
	{
		int days = 0;
		int hours = 0;
		Random result = new Random();
		while(hours<=wages_PerHour && days<=workingDays)
		{
			days++;
			value=result.nextInt(3);
			get_Working_Hours();
			hours=hours+emphours;
			monthlySalary=monthlySalary+(120*emphours);
		}
		System.out.println("Employee Monthly Wages : "+monthlySalary);
	}
	public static void main(String arg[])
	{
		Random result = new Random();
		Scanner d = new Scanner(System.in);
		System.out.println("Enter no of compaanies");
		int numberOfCompany=d.nextInt();
		int i = 0;
		while(numberOfCompany>i)
		{
			i++;
			Scanner di = new Scanner(System.in);
			System.out.print("Enter name of company : ");
			String company = di.nextLine();
			int wage_perHour= result.nextInt(10)+20;
			int working_Days = result.nextInt(15)+5;
			System.out.println(company);
			calculate_salary(wage_perHour,working_Days);
			System.out.println("Wages per Hours : "+wage_perHour);
			System.out.println("Working Days :"+working_Days);
			working_Hours_Per_Month = wage_perHour*working_Days;
		}
	}
}