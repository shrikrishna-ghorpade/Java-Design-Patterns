package com.example.demo.structural.flyweight;

class FlyweightDemo {

	public static void main(String[] args) {

		/** Creating new e-book object */
		EBookFactory factory = new EBookFactory();
		System.out.println(factory.getEBook("Head First Java", "HFJ"));
		System.out.println(factory.getEBook("Head First Desing Patterns", "HFJ"));
		System.out.println(factory.getEBook("Clean code", "HFJ"));
		System.out.println(factory.getEBook("Clean code", "HFJ"));
		System.out.println(factory.getEBook("Clean coder", "HFJ"));
		System.out.println(factory.getEBook("Head First Java", "HFJ"));
		System.out.println(factory.getEBook("Head First Java", "HFJ"));
	}
}
