package com.example.demo.structural.facade;

class FacadeTest {

	public static void main(String[] args) {

		AdmissionFacade admissionFacade = new AdmissionFacade(new Admission());
		System.out.println(admissionFacade.doAdminssion());
	}
}
