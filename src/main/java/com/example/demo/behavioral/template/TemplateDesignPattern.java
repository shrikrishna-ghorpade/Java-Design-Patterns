package com.example.demo.behavioral.template;

public class TemplateDesignPattern {

	public static void main(String[] args) {
		
		EmployeeTemplate javaDeveloper = new Developer();
		javaDeveloper.empRegistration();
		javaDeveloper.interviewProcess();
		
		EmployeeTemplate devOps = new DevOps();
		devOps.empRegistration();
		devOps.interviewProcess();

		EmployeeTemplate qa = new QA();
		qa.empRegistration();
		qa.interviewProcess();
	}
}
