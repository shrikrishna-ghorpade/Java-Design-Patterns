package com.example.demo.creational.abstractfactory;

class AbstractVehicleFactory {

	public static VehicleService buildVehicleService(VehicleFactory vehicleFactory) {
		return vehicleFactory.buildVehicleService();
	}
}