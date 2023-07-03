package com.example.demo.creational.singleton;

class SingletonTest {

	public static void main(String[] args) {
		//SpringApplication.run(DesingPatternsApplication.class, args);
		
		RegistrationService registrationService = RegistrationService.getRegistrationService();
		registrationService.doRegistration();
		System.out.println(registrationService.hashCode());
		
		RegistrationService registrationService2 = RegistrationService.getRegistrationService();
		registrationService.doRegistration();
		System.out.println(registrationService2.hashCode());

		RegistrationService registrationService3 = RegistrationService.getRegistrationService();
		registrationService.doRegistration();
		System.out.println(registrationService3.hashCode());

	}
}
