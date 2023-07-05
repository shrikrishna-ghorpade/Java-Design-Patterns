package com.example.demo.creational.factory;

class VehicalFactory {

	public static VehicleService buildVehicleService(Integer numberOfWheels) {

		if (numberOfWheels == 2) {
			return new TwoWheelerService();
		} else {
			return new FourWheelerService();
		}
	}
}
