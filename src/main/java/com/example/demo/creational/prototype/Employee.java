package com.example.demo.creational.prototype;

class Employee implements Cloneable {

	private String name;
	
	private EducationService educationService;
	
	public Employee(String name) {
		educationService = new EducationService();
		this.name = name; 
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EducationService getEducationService() {
		return educationService;
	}

	public void setEducationService(EducationService educationService) {
		this.educationService = educationService;
	}
}