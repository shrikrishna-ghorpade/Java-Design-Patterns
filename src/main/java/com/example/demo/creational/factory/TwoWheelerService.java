package com.example.demo.creational.factory;

class TwoWheelerService implements VehicleService {

	@Override
	public String buildVehicle() {
		return "This is two wheeler";
	}
}
