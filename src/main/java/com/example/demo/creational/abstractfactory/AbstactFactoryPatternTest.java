package com.example.demo.creational.abstractfactory;

class AbstactFactoryPatternTest {

	public static void main(String[] args) {

		VehicleService fourWheerService = AbstractVehicleFactory.buildVehicleService(new FourWheelerFactory());
		System.out.println(fourWheerService.buildVehicle());

		VehicleService twoWheerService = AbstractVehicleFactory.buildVehicleService(new TwoWheelerFactory());
		System.out.println(twoWheerService.buildVehicle());
	}
}
