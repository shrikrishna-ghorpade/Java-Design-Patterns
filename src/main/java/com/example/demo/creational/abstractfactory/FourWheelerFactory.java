package com.example.demo.creational.abstractfactory;

class FourWheelerFactory implements VehicleFactory {

	@Override
	public VehicleService buildVehicleService() {
		return new FourWheelerService();
	}
}