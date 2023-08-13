package com.example.demo.creational.factory;

class ThreeWheelerService implements VehicleService {

	public ThreeWheelerService() {
		super();
	}

	@Override
	public String buildVehicle() {
		return "This is three wheeler";
	}
}
