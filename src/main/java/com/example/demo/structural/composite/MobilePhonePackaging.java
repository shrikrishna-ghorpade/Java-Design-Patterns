package com.example.demo.structural.composite;

import java.util.ArrayList;
import java.util.List;

class MobilePhonePackaging implements Packaging {

	private String mobilePhone;

	private String packageId;

	private List<Packaging> packaging;

	public MobilePhonePackaging(String mobilePhone, String packageId) {
		super();
		this.mobilePhone = mobilePhone;
		this.packageId = packageId;
		this.packaging = new ArrayList<>();
	}

	public void addSubPackaging(Packaging subPackaging) {
		this.packaging.add(subPackaging);
	}

	@Override
	public String toString() {
		return "MobilePhonePackaging [mobilePhone=" + mobilePhone + ", packageId=" + packageId + ", packaging="
				+ packaging + "]";
	}

	@Override
	public String doPackaging() {
		return "Doing mobilePhone packaging";
	}

	@Override
	public String doWrapping() {
		return "Doing mobilePhone wrapping";
	}

	@Override
	public String doStamping() {
		return "Doing mobilePhone Stamping";
	}
}
