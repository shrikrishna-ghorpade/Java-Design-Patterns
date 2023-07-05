package com.example.demo.behavioral.template;

public abstract class EmployeeTemplate {

	protected String empId;

	protected String empName;

	public final void empRegistration() {

		System.out.println("All emp common registration ");
	}

	public abstract void interviewProcess();
}
