package com.example.demo.creational.abstractfactory;

class TwoWheelerFactory implements VehicleFactory {

	@Override
	public VehicleService buildVehicleService() {
		return new TwoWheelerService();
	}
}