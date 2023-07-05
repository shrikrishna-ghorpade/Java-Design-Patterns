package com.example.demo.structural.composite;

import java.util.ArrayList;
import java.util.List;

class HeadphonePackaging implements Packaging {

	private String headphoneName;
	
	private List<Packaging> earbuds;

	public HeadphonePackaging(String headphoneName) {
		super();
		this.headphoneName = headphoneName;
		this.earbuds = new ArrayList<>();  
	}

	@Override
	public String doPackaging() {
		return "Doing headphone packaging";
	}

	@Override
	public String doWrapping() {
		return "Doing headphone wrapping";
	}

	@Override
	public String doStamping() {
		return "Doing headphone Stamping";
	}

	@Override
	public String toString() {
		return "HeadphonePackaging [headphoneName=" + headphoneName + ", earbuds=" + earbuds + "]";
	}

	public void addEarbuds(Packaging earbud) {
		earbuds.add(earbud);
	}
}
