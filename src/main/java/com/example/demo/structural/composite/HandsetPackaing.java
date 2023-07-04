package com.example.demo.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class HandsetPackaing implements Packaging {

	private String mobileName;

	private String mobileInfo;

	private List<Packaging> subPackages;

	public HandsetPackaing(String mobileName, String mobileInfo) {
		super();
		this.mobileName = mobileName;
		this.mobileInfo = mobileInfo;
		this.subPackages = new ArrayList<>();
	}

	@Override
	public String doPackaging() {
		return "Doing mobile packaging";
	}

	@Override
	public String doWrapping() {
		return "Doing mobile wrapping";
	}

	@Override
	public String doStamping() {
		return "Doing mobile Stamping";
	}

	@Override
	public String toString() {
		return "HandsetPackaing [mobileName=" + mobileName + ", mobileInfo=" + mobileInfo + ", subPackages="
				+ subPackages + "]";
	}

	public void addSubpackaging(Packaging subPackaging) {
		subPackages.add(subPackaging);
	}
}
