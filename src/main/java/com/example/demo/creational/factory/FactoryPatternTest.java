package com.example.demo.creational.factory;

import java.util.Optional;

class FactoryPatternTest {

	public static void main(String[] args) {

		/** Type 1: parameter based conditional method */
		VehicleService vehicleService = VehicalFactory.buildVehicleService(2);
		System.out.println(vehicleService.buildVehicle());

		VehicleService vehicleService2 = VehicalFactory.buildVehicleService(3);
		System.out.println(vehicleService2.buildVehicle());

		VehicleService vehicleService3 = VehicalFactory.buildVehicleService(4);
		System.out.println(vehicleService3.buildVehicle());

		/** Type 2: parameter based, Enum driven method */
		VehicleService vehicleService4 = VehicalFactory.buildVehicleService(2);
		System.out.println(vehicleService4.buildVehicle());

		VehicleService vehicleService5 = VehicalFactory.buildVehicleService(3);
		System.out.println(vehicleService5.buildVehicle());

		VehicleService vehicleService6 = VehicalFactory.buildVehicleService(4);
		System.out.println(vehicleService6.buildVehicle());

		/** Type 3: class name provided method (more control to client) */
		Optional<VehicleService> vehicleService7 = VehicalFactory
				.buildVehicleServiceByClassName(TwoWheelerService.class);
		System.out.println(vehicleService7.get().buildVehicle());

		Optional<VehicleService> vehicleService8 = VehicalFactory
				.buildVehicleServiceByClassName(FourWheelerService.class);
		System.out.println(vehicleService8.get().buildVehicle());
	}
}
