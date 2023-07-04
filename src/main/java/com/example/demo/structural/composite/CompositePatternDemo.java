package com.example.demo.structural.composite;

public class CompositePatternDemo {

	public static void main(String[] args) {

		MobilePhonePackaging mobilePhonePackage = new MobilePhonePackaging("ASUS", "p_id");

		HandsetPackaing handsetPackage = new HandsetPackaing("ASUS", "ZENPHONE");
		ChargerPackaging chargingPackage = new ChargerPackaging("ZTE", "15");

		HeadphonePackaging headphonePackage = new HeadphonePackaging("SONY");
		EarbudPackaging earbudSmall = new EarbudPackaging("Small");
		EarbudPackaging earbudMed = new EarbudPackaging("Med");
		EarbudPackaging earbudBig = new EarbudPackaging("Big");

		mobilePhonePackage.addSubPackaging(handsetPackage);
		mobilePhonePackage.addSubPackaging(chargingPackage);

		headphonePackage.addEarbuds(earbudSmall);
		headphonePackage.addEarbuds(earbudMed);
		headphonePackage.addEarbuds(earbudBig);

		mobilePhonePackage.addSubPackaging(headphonePackage);

		System.out.println("Show components : "+ mobilePhonePackage);
	}
}
