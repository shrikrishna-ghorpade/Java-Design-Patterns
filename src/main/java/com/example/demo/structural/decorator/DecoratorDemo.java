package com.example.demo.structural.decorator;

class DecoratorDemo {

	public static void main(String[] args) {

		/** Event decoration */
		IDecoration decoration = new Decoration();
		System.out.println(decoration.doDecoration());

		/** Wedding decoration */
		IDecoration weddingDecoration = new WeddingDecorationWrapper();
		System.out.println(weddingDecoration.doDecoration());
		
		/** Birthday decoration */
		IDecoration birthdayDecoration = new BirthdayDecorationWrapper();
		System.out.println(birthdayDecoration.doDecoration());
	}
}
