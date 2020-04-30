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
		System.out.println("Enter Name of the company to find Employee Wages");
		String nameOfCompany=scan.nextLine();
		nameOfCompany=scan.nextLine();
		for(CompanyEmpWage data:arrayList)
		{
			if(data.company.equals(nameOfCompany))
			{
				data.empWageOfCompany();
				index = 0;
				break;
			}
		}
		if(index!=0)
		{
			System.out.println("Data Not Found");
		}
	}
	
}
class CompanyEmpWage
{
	static int emphours;
	String company;
	int daily_Wage_PerHour; 
	int days_PerMonth;
	public CompanyEmpWage(String company, int daily_Wage_PerHour, int days_PerMonth) {
		this.company=company;
		this.daily_Wage_PerHour=daily_Wage_PerHour;
		this.days_PerMonth=days_PerMonth;
	}

	public void empWageOfCompany() {
		  Random result = new Random();
		  int value;
			   int day=0;
			   int monthlySalary = 0;
			   int daily_Wage[]=new int[days_PerMonth];
			   while(day<days_PerMonth )
			   {
				   
				   value = result.nextInt(3);
				   get_Working_Hours();
				   daily_Wage[day]=daily_Wage_PerHour*emphours;
				   monthlySalary =monthlySalary+(daily_Wage_PerHour*emphours);
				   day++;
			   }
			   int index=1;
			   System.out.println("----------Daily Wages------------ ");
			   for(int data:daily_Wage)
			   {
				   System.out.println("Day-"+index+" --> "+data);
				   index++;
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