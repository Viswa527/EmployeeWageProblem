package MyNewProject;

import java.util.Random;
import java.util.Scanner;	
class Employee 
{
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
	public static int employeeWageBuilder(int daily_Wages_PerHour,int days_In_Month)
	{
		   Random result = new Random();
		   value = result.nextInt(3);
		   int days=0;
		   int monthlySalary = 0;
		   while(days<days_In_Month )
		   {
			   days++;
			   value = result.nextInt(3);
			   get_Working_Hours();
			   monthlySalary =monthlySalary+(daily_Wages_PerHour*emphours);
		   }
		   return monthlySalary;
	}
	public static void main(String arg[])
	{
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
			System.out.print("Enter wages per hour of company : ");
			int daily_Wages_PerHour = d.nextInt();
			System.out.print("Enter daily hours in one-day company : ");
			int days_In_Month= d.nextInt();
			System.out.println(company+" Monthly Salary : "+employeeWageBuilder(daily_Wages_PerHour,days_In_Month));
			
		}
	}
}