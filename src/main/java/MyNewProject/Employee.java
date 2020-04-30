package MyNewProject;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;	
class Employee 
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of Companies  : ");
		int numberOfCompany = scan.nextInt();
		ArrayList<CompanyEmpWage> arrayList =new ArrayList<CompanyEmpWage>();
		int index = 0;
		while(numberOfCompany>0)
		{
			System.out.println("Enter name of Company :");
			numberOfCompany--;
			String company = scan.nextLine();
			company=scan.next();
			System.out.println("Enter Daily Wage Per Hour of Company : ");
			int daily_Wage_PerHour=scan.nextInt();
			System.out.println("Enter days in month of Company : ");
			int days_PerMonth=scan.nextInt();
			arrayList.add(new CompanyEmpWage(company,daily_Wage_PerHour,days_PerMonth));
			index++;
		}
	}
	
}
class CompanyEmpWage
{
	static int emphours;
	public CompanyEmpWage(String company, int daily_Wage_PerHour, int days_PerMonth) {
		  Random result = new Random();
		  int value;
			   int days=0;
			   int monthlySalary = 0;
			   while(days<days_PerMonth )
			   {
				   days++;
				   value = result.nextInt(3);
				   get_Working_Hours();
				   monthlySalary =monthlySalary+(daily_Wage_PerHour*emphours);
			   }
			   System.out.println(company +" Monthly salary : "+monthlySalary);
			   
	}

	public static void get_Working_Hours()
	{
		Random result =new Random();
		int value = result.nextInt(3);
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
}