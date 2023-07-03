package com.example.demo.creational.abstractfactory;

class FourWheelerService implements VehicleService {

	@Override
	public String buildVehicle() {
		return "This is four wheeler";
	}
}
