package com.example.demo.creational.builder;

class BuilderPatternDemo {

	public static void main(String[] args) {

		MobileSimpleMethodChaining asusMobile = new MobileSimpleMethodChaining().setBattery("5000")
				.setBrand("ASUS").setCamera("SONY").setFingerPrint("YES")
				.setKeypad("QWERTY").setMic("YES").build();
		
		MobileInnerBuilderClass motoMobile = MobileInnerBuilderClass.Builder.newInstance()
				.setName("New Mobile").setBrand("MOTO")
				.setBattery("5000").setFingerPrint("YES")
				.setKeypad("QWERTY").setMic("YES").build();
		
		System.out.println("Asus Mobile : " + asusMobile);
		System.out.println("Moto Mobile : " + motoMobile);
	}
}
