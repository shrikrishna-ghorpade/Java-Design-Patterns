package com.example.demo.creational.factory;

class FourWheelerService implements VehicleService {

	public FourWheelerService() {
		super();
	}

	@Override
	public String buildVehicle() {
		return "This is four wheeler";
	}
}
