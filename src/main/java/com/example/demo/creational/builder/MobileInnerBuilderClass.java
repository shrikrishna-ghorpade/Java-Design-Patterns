package com.example.demo.creational.builder;

class MobileInnerBuilderClass {

	private MobileInnerBuilderClass(Builder builder) {
		this.name = builder.name;
		this.battery = builder.battery;
		this.brand = builder.brand;
		this.camera = builder.camera;
		this.fingerPrint = builder.fingerPrint;
		this.keypad = builder.keypad;
		this.mic = builder.mic;
		this.screen = builder.screen;
	}

	private String name;
	
	private String brand;
	
	private String keypad;
	
	private String screen;
	
	private String camera;
	
	private String fingerPrint;
	
	private String battery;
	
	private String mic;
	
	public static class Builder {
		
		private String name;
		
		private String brand;
		
		private String keypad;
		
		private String screen;
		
		private String camera;
		
		private String fingerPrint;
		
		private String battery;
		
		private String mic;
		
		public static Builder newInstance() {
			return new Builder();
		}
		
		private Builder() {}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder setBrand(String brand) {
			this.brand = brand;
			return this;
		}

		public Builder setKeypad(String keypad) {
			this.keypad = keypad;
			return this;
		}

		public Builder setScreen(String screen) {
			this.screen = screen;
			return this;
		}

		public Builder setCamera(String camera) {
			this.camera = camera;
			return this;
		}

		public Builder setFingerPrint(String fingerPrint) {
			this.fingerPrint = fingerPrint;
			return this;
		}

		public Builder setBattery(String battery) {
			this.battery = battery;
			return this;
		}

		public Builder setMic(String mic) {
			this.mic = mic;
			return this;
		}
		
		public MobileInnerBuilderClass build() {
			return new MobileInnerBuilderClass(this);
		}
	}

	@Override
	public String toString() {
		return "MobileInnerBuilderClass [name=" + name + ", brand=" + brand + ", keypad=" + keypad + ", screen="
				+ screen + ", camera=" + camera + ", fingerPrint=" + fingerPrint + ", battery=" + battery + ", mic="
				+ mic + "]";
	}
}
