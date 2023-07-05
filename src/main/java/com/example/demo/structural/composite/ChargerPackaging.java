package com.example.demo.structural.composite;

class ChargerPackaging implements Packaging {

	private String chargerName;

	private String chargerSize;

	public ChargerPackaging(String chargerName, String chargerSize) {
		super();
		this.chargerName = chargerName;
		this.chargerSize = chargerSize;
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
		return "ChargerPackaging [chargerName=" + chargerName + ", chargerSize=" + chargerSize + "]";
	}
}
