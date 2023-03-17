package com.greatlearning.department.app;

import com.greatlearning.department.admindepartment.AdminDepartment;
import com.greatlearning.department.hrdepartment.HrDepartment;
import com.greatlearning.department.techdepartment.TechDepartment;

public class Main {
	public static void main(String[] args) {
		AdminDepartment admin = new AdminDepartment();
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());

		HrDepartment hr = new HrDepartment();
		System.out.println("\nWelcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());

		TechDepartment tech = new TechDepartment();
		System.out.println("\nWelcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
	}
}
