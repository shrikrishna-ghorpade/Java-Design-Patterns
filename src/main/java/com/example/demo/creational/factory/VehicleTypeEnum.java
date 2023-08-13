/**
 * @author Shrikrishna
 *
 */
package com.example.demo.creational.factory;

public enum VehicleTypeEnum {

	TWO_WHEELER(2, TwoWheelerService.class), THREE_WHEELER(3, ThreeWheelerService.class),
	FOUR_WHEELER(4, FourWheelerService.class);

	private int numberOfWheels;
	private Class<?> classs;

	/**
	 * @param numberOfWheels, class
	 */
	VehicleTypeEnum(int numberOfWheels, Class<?> classs) {
		this.numberOfWheels = numberOfWheels;
		this.classs = classs;
	}

	public static VehicleTypeEnum getVehicleTypeEnum(int numberOfWheels) {
		for (VehicleTypeEnum e : values()) {
			if (e.numberOfWheels == numberOfWheels) {
				return e;
			}
		}
		return TWO_WHEELER;
	}

	public Class<?> getVehicleService() {
		return this.classs;
	}
}
