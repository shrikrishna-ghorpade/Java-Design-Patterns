package com.example.demo.creational.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

class VehicalFactory {

	public static VehicleService buildVehicleService(Integer numberOfWheels) {

		if (numberOfWheels == 2) {
			return new TwoWheelerService();
		} else {
			return new FourWheelerService();
		}
	}
	
	public static Optional<VehicleService> buildVehicleServiceByClassName(Class<?> classs) {
		try {
			Constructor<?> cons = classs.getConstructor();
			Object object = cons.newInstance();		
			return Optional.of((VehicleService) object);
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return Optional.empty();
	}
}
