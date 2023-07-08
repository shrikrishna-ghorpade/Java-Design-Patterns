/**
 * 
 */
package com.example.demo.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shrikrishna Ghorpade
 *
 */
class MyTopic implements Subject {

	private List<Observer> observers = new ArrayList<>();
	private String message;

	public MyTopic(String message) {
		super();
		this.message = message;
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void deregisterObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void doSomething() {

		System.out.println("Doing something");
		System.out.println("Done, now notifying oberver");
		notifyObservers();
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate(Observer observer) {
		return this.message;
	}
}
