package com.example.demo.behavioral.observer_deprecated;

import java.util.Observable;

class EventHandler implements Observer{

	@Override
	public void eventHandler(Observable observable) {
		System.out.println("Event occured ");
	}
}
