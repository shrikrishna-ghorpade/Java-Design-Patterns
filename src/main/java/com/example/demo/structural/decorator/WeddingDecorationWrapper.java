package com.example.demo.structural.decorator;

class WeddingDecorationWrapper extends Decoration {

	@Override
	public String doDecoration() {
		System.out.println(super.doDecoration());
		System.out.println("Added bridge groom names");
		return "Wedding decoration done";
	}
}
