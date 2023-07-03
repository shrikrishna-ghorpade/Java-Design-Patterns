package com.example.demo.structural.facade;

class Admission implements IAdmission {

	@Override
	public String purchaseProspectus() {
		return "Purchasing prospectus";
	}

	@Override
	public String fillForm() {
		return "Filling form";
	}

	@Override
	public String submitDocuments() {
		return "Documents submited";
	}

}
