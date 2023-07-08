package com.example.demo.creational.factory;

import java.util.Optional;

class FactoryPatternTest {

	public static void main(String[] args) {

		VehicleService vehicleService = VehicalFactory.buildVehicleService(2);
		System.out.println(vehicleService.buildVehicle());

		VehicleService vehicleService2 = VehicalFactory.buildVehicleService(4);
		System.out.println(vehicleService2.buildVehicle());

		Optional<VehicleService> vehicleService3 = VehicalFactory.buildVehicleServiceByClassName(TwoWheelerService.class);
		System.out.println(vehicleService3.get().buildVehicle());
		
		Optional<VehicleService> vehicleService4 = VehicalFactory.buildVehicleServiceByClassName(FourWheelerService.class);
		System.out.println(vehicleService4.get().buildVehicle());
	}
}
