package com.example.demo.creational.prototype;

class PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee emp = new Employee("Emp");
		Employee emp2 = (Employee) emp.clone();

		System.out.println("Emp : " + emp.hashCode());
		System.out.println("Emp edu  : " + emp.getEducationService().hashCode());
		System.out.println("Emp name  : " + emp.getName().hashCode());

		System.out.println("Emp2 : " + emp2.hashCode());
		System.out.println("Emp2 edu  : " + emp2.getEducationService().hashCode());
		System.out.println("Emp2 name  : " + emp2.getName().hashCode());
	}
}
