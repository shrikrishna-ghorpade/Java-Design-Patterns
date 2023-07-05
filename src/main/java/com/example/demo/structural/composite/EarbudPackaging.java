package com.example.demo.structural.composite;

class EarbudPackaging implements Packaging {

	private String size;

	public EarbudPackaging(String size) {
		super();
		this.size = size;
	}

	@Override
	public String doPackaging() {
		return "Doing charger packaging";
	}

	@Override
	public String doWrapping() {
		return "Doing charger wrapping";
	}

	@Override
	public String doStamping() {
		return "Doing charger Stamping";
	}

	@Override
	public String toString() {
		return "EarbudPackaging [size=" + size + "]";
	}
}
