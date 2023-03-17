package com.greatlearning.department.admindepartment;

import com.greatlearning.department.superdepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
