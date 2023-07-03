package com.example.demo.creational.abstractfactory;

class TwoWheelerService implements VehicleService {

	@Override
	public String buildVehicle() {
		return "This is two wheeler";
	}
}