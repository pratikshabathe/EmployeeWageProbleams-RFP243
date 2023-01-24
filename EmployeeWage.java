package com.bridgelabz.employee_wage;

import java.util.Random;

public class EmployeeWage {

	private static final int WAGE_PER_HOUR = 0;
	private String company;
	private int daysPerMonth;
	private int wagePerHr;
	private int workHrPerMonth;

	public EmployeeWage(String company, int WAGE_PER_HOUR, int TOTAL_WORKING_DAYS, int WORKING_HOURS) {
		
		this.company = company;
		this.wagePerHr = WAGE_PER_HOUR;
		this.daysPerMonth =  TOTAL_WORKING_DAYS;
		this.workHrPerMonth = WORKING_HOURS;
	}

	static void calculateWage() {
		
		int FULL_DAY_HOUR = 8;
		int DAILY_WAGE = 0;
		int PART_TIME_HOUR = 4;
		int MONTHLY_SALARY = 0;
		int TOTAL_WORKING_DAYS = 1;
		int WORKING_HOURS = 0;
		int WAGE_PER_HOUR = 0;
		
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
	     System.out.println("Day: "+TOTAL_WORKING_DAYS+" Wage: "+DAILY_WAGE+" Work Hours: "+WORKING_HOURS);
		}
		 System.out.println("Monthly Salary: "+ MONTHLY_SALARY);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to employee wage computation program");
		EmployeeWage amazon = new EmployeeWage("Amazon", 20, 4, 10);
		EmployeeWage meesho = new EmployeeWage("Meesho", 10, 2, 20);
		EmployeeWage reliance = new EmployeeWage("Reliance", 30, 5, 10);
		EmployeeWage flipcart= new EmployeeWage("Flipcart", 10, 7, 30);
		
		amazon.calculateWage();
		System.out.println(amazon);
		meesho .calculateWage();
		System.out.println(meesho );
		reliance.calculateWage();
		System.out.println(reliance);
		flipcart.calculateWage();
		System.out.println( flipcart);
	}
}
