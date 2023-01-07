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
		int randomNum = random.nextInt(2);
		
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
		
			System.out.println("Employee total daily Wage is: " +dailyWage);
		
		}
}
