package com.example.demo.creational.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

class VehicalFactory {

	/**
	 * This is basic method where service created using provided arguments. All
	 * control to factory it self.
	 */
	public static VehicleService buildVehicleService(Integer numberOfWheels) {

		if (numberOfWheels == 2) {
			return new TwoWheelerService();
		} else if (numberOfWheels == 3) {
			return new ThreeWheelerService();
		} else {
			return new FourWheelerService();
		}
	}

	/**
	 * This is the method where service created using provided arguments. Arguments
	 * transfered to Enum which holds the mapping. Now control is shifted to Enum.
	 */
	public static VehicleService buildVehicleServiceEnumBased(Integer numberOfWheels) {

		VehicleTypeEnum vehicleTypeEnum = VehicleTypeEnum.getVehicleTypeEnum(numberOfWheels);

		try {
			Class<?> vehicleService = vehicleTypeEnum.getVehicleService();
			return (VehicleService) vehicleService.getDeclaredConstructor().newInstance();
		} catch (IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException
				| InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * This is the method where service created using provided class name. All
	 * control to the client and factory only creates the object of the class
	 * provided by the client.
	 */
	public static Optional<VehicleService> buildVehicleServiceByClassName(Class<?> classs) {
		try {
			Constructor<?> cons = classs.getConstructor();
			Object object = cons.newInstance();
			return Optional.of((VehicleService) object);
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return Optional.empty();
	}
}
