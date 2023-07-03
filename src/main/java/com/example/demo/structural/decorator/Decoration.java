package com.example.demo.structural.decorator;

class Decoration implements IDecoration {

	@Override
	public String doDecoration() {
		System.out.println("Building stage");
		System.out.println("Attaching Banner");
		System.out.println("Doing Flowering");
		return "Event decoration done";
	}
}
