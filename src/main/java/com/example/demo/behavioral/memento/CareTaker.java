package com.example.demo.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

class CareTaker {

	private List<Memento> mementoList = new ArrayList<>();
	
	public void add(Memento memento) {
		mementoList.add(memento);
	}
	
	public Memento getMemento(int index) {
		/** Need to handle array out of bound exception */
		return mementoList.get(index);
	}
	
	public Memento undoText() {
		/** Need to handle array out of bound exception */
		return mementoList.remove(mementoList.size()-1);
	}
}
