package com.example.demo.structural.decorator;

class BirthdayDecoration extends Decoration {

	@Override
	public String doDecoration() {
		System.out.println(super.doDecoration());
		System.out.println("Added birthday banner");
		return "Birthday decoration done";
	}
}
