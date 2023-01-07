package com.blz.empwage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		
		System.out.println("Welcome to employee wage computation program");
		
		Random random = new Random();
		
		int wagePerHour = 20;
		int fullDayHour = 8;
		int dailyWage =0;
		int partTimeHour = 4;
		int monthlySalary = 0;
		int totalWorkingDays = 20;
		int workingHours = 0;
		
		while(workingHours!=100 && totalWorkingDays!=20 ) {
			
			int randomNum = random.nextInt(3);
		
		switch(randomNum) {
		case 1 :
			System.out.println("Full Time");
			dailyWage = fullDayHour * wagePerHour;
			break;
		case 2 :
			System.out.println("Part Time");
			dailyWage = partTimeHour * wagePerHour;
			break;
		default: System.out.println("Employee is absent");
		}
		 totalWorkingDays++;
	     monthlySalary = monthlySalary + dailyWage;
	     System.out.println("Day: "+totalWorkingDays+" Wage: "+dailyWage+" Work Hours: "+workingHours);
		}
		 System.out.println("Monthly Salary: "+monthlySalary);

	}
}
