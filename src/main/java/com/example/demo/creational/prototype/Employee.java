package com.example.demo.creational.prototype;

class Employee implements Cloneable {

	private String name;

	private EmpTrainingService educationService;

	public Employee(String name) {
		educationService = new EmpTrainingService();
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

	public EmpTrainingService getEducationService() {
		return educationService;
	}

	public void setEducationService(EmpTrainingService educationService) {
		this.educationService = educationService;
	}
}