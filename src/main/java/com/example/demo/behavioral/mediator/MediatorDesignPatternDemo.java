package com.example.demo.behavioral.mediator;

public class MediatorDesignPatternDemo {

	public static void main(String[] args) {
		User krishna = new User("Krishna");
		User neha = new User("Neha");

		krishna.sendMessage("Hi! Neha!");
		neha.sendMessage("Hello! Dhani!");
	}
}
