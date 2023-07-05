package com.example.demo.structural.bridge;

class QuestionFormat extends QuestionsBridge {

	public QuestionFormat(String catalog, Question questions) {
		super(catalog, questions);
	}

	public void displayAll() {
		super.displayAll();
	}
}
