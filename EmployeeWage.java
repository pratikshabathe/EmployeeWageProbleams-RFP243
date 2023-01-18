package com.bridgelabz.employee_wage;

import java.util.Random;

public class EmployeeWage {

	static void calculateWage() {
		//create calculate wage method
		
		int WAGE_PER_HOUR = 20;
		int FULL_DAY_HOUR = 8;
		int DAILY_WAGE = 0;
		int PART_TIME_HOUR = 4;
		int MONTHLY_SALARY = 0;
		int TOTAL_WORKING_DAYS = 20;
		int WORKING_HOURS = 0;
		
		Random random = new Random();
		while(WORKING_HOURS!=100 && TOTAL_WORKING_DAYS!=20 ) {
			
			int randomNum = random.nextInt(3);
		
		switch(randomNum) {
		case 1 :
			System.out.println("Full Time");
			DAILY_WAGE = FULL_DAY_HOUR * WAGE_PER_HOUR;
			break;
		case 2 :
			System.out.println("Part Time");
			DAILY_WAGE = PART_TIME_HOUR  * WAGE_PER_HOUR;
			break;
		default: System.out.println("Employee is absent");
		}
		TOTAL_WORKING_DAYS++;
		 MONTHLY_SALARY = MONTHLY_SALARY + DAILY_WAGE;
	     System.out.println("Day: "+TOTAL_WORKING_DAYS+" Wage: "+DAILY_WAGE+"Work Hours: "+WORKING_HOURS);
		}
		 System.out.println("Monthly Salary: "+ MONTHLY_SALARY);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to employee wage computation program");
		calculateWage();
	}
}
