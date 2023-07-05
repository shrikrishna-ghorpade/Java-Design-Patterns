package com.example.demo.behavioral.memento;

class TextDocument {

	private String text;

	public Memento saveText(String text) {
		Memento saveStateMemento = this.saveStateMemento();
		this.text = text;
		return saveStateMemento;
	}

	public void undoText(String text) {
		this.text = text;
	}

	public Memento appendText(String text) {
		Memento saveStateMemento = this.saveStateMemento();
		this.text += text;
		return saveStateMemento;
	}

	public Memento deleteText() {
		Memento saveStateMemento = this.saveStateMemento();
		this.text = null;
		return saveStateMemento;
	}

	private Memento saveStateMemento() {
		return new Memento(text);
	}

	public String getText() {
		return text;
	}
}
