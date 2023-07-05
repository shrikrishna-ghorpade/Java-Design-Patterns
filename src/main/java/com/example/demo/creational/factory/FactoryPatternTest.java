package com.example.demo.creational.factory;

class FactoryPatternTest {

	public static void main(String[] args) {

		VehicleService vehicleService = VehicalFactory.buildVehicleService(2);
		System.out.println(vehicleService.buildVehicle());

		VehicleService vehicleService2 = VehicalFactory.buildVehicleService(4);
		System.out.println(vehicleService2.buildVehicle());

	}
}
