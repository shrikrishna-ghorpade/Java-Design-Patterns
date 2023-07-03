package com.example.demo.creational.singleton;

class RegistrationService {

	private String registrationName;
	
	/** Eager initialization */
	private static RegistrationService registrationService = new RegistrationService("Registration Service");
	
	private RegistrationService(String registrationName) {
		this.registrationName = registrationName;
	}

	public static RegistrationService getRegistrationService() {
		return registrationService;
	}
	
	public boolean doRegistration() {
		System.out.println(registrationName + " doing Registration. Thanks");
		return true;
	}
}
