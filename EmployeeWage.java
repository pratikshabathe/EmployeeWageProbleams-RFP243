package com.blz.empwage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		
		System.out.println("Welcome to employee wage computation program");
		String attendanceString = EmployeeWage.checkAttendance();
		System.out.println(attendanceString);
		checkAttendance();
	}
		private static String checkAttendance() {
		Random random = new Random();
		boolean choice = random.nextBoolean();
		
		if(choice) 
			return "Employe is Present";
		else 
			return "Employee is Absent";
		}
		
}
