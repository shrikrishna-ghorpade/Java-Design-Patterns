package com.example.demo.behavioral.memento;

class MementoPatternDemo {

	public static void main(String[] args) {

		TextDocument textDocument = new TextDocument();
		CareTaker careTaker = new CareTaker();
		
		careTaker.add(textDocument.saveText("ABC"));
		System.out.println(textDocument.getText());
		
		careTaker.add(textDocument.saveText("D"));
		System.out.println(textDocument.getText());
		careTaker.add(textDocument.appendText("EFG"));
		System.out.println(textDocument.getText());
		careTaker.add(textDocument.deleteText());
		System.out.println(textDocument.getText());
		
		textDocument.undoText(careTaker.undoText().getMemetoText());
		System.out.println(textDocument.getText());
		textDocument.saveText(careTaker.undoText().getMemetoText());
		System.out.println(textDocument.getText());
		textDocument.saveText(careTaker.undoText().getMemetoText());
		System.out.println(textDocument.getText());
		textDocument.saveText(careTaker.undoText().getMemetoText());
		System.out.println(textDocument.getText());
	}
}
