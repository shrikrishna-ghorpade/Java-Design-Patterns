package com.example.demo.behavioral.memento;

class Memento {

	private String mementoText;

	public Memento(String mementoText) {
		super();
		this.mementoText = mementoText;
	}
	
	public String getMemetoText() {
		return mementoText;
	}
}
