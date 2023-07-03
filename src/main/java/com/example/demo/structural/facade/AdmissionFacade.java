package com.example.demo.structural.facade;

class AdmissionFacade {

	private IAdmission iAdmission; 
	
	public AdmissionFacade(IAdmission iAdmission) {
		super();
		this.iAdmission = iAdmission;
	}

	public String doAdminssion() {
		System.out.println(iAdmission.purchaseProspectus());
		System.out.println(iAdmission.fillForm());
		System.out.println(iAdmission.submitDocuments());
		return "Admission done";
	}
}
