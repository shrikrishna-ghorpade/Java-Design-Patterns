package com.example.demo.creational.factory;

class FourWheelerService implements VehicleService {

	@Override
	public String buildVehicle() {
		return "This is four wheeler";
	}
}
