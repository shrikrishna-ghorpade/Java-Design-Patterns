package com.example.demo.creational.factory;

class TwoWheelerService implements VehicleService {

	public TwoWheelerService() {
		super();
	}

	@Override
	public String buildVehicle() {
		return "This is two wheeler";
	}
}
