package com.example.demo.creational.builder;

class MobileSimpleMethodChaining {

	private String name;
	
	private String brand;
	
	private String keypad;
	
	private String screen;
	
	private String camera;
	
	private String fingerPrint;
	
	private String battery;
	
	private String mic;

	public MobileSimpleMethodChaining build() {
		return this;
	}

	public MobileSimpleMethodChaining setName(String name) {
		this.name = name;
		return this;
	}

	public MobileSimpleMethodChaining setBrand(String brand) {
		this.brand = brand;
		return this;
	}

	public MobileSimpleMethodChaining setKeypad(String keypad) {
		this.keypad = keypad;
		return this;
	}

	public MobileSimpleMethodChaining setScreen(String screen) {
		this.screen = screen;
		return this;
	}

	public MobileSimpleMethodChaining setCamera(String camera) {
		this.camera = camera;
		return this;
	}

	public MobileSimpleMethodChaining setFingerPrint(String fingerPrint) {
		this.fingerPrint = fingerPrint;
		return this;
	}

	public MobileSimpleMethodChaining setBattery(String battery) {
		this.battery = battery;
		return this;
	}

	public MobileSimpleMethodChaining setMic(String mic) {
		this.mic = mic;
		return this;
	}

	@Override
	public String toString() {
		return "MobileSimpleMethodChaining [name=" + name + ", brand=" + brand + ", keypad=" + keypad + ", screen="
				+ screen + ", camera=" + camera + ", fingerPrint=" + fingerPrint + ", battery=" + battery + ", mic="
				+ mic + "]";
	}
}
