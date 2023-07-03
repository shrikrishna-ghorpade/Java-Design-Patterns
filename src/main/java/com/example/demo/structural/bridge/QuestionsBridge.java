package com.example.demo.structural.bridge;

class QuestionsBridge {

	private Question q;
	private String catalog;

	public QuestionsBridge(String catalog, Question questions) {
		this.catalog = catalog;
		this.q = questions;
	}

	public void next() {
		q.nextQuestion();
	}

	public void previous() {
		q.previousQuestion();
	}

	public void newOne(String quest) {
		q.newQuestion(quest);
	}

	public void delete(String quest) {
		q.deleteQuestion(quest);
	}

	public void display() {
		q.displayQuestion();
	}

	public void displayAll() {
		System.out.println("Question Paper: " + catalog);
		q.displayAllQuestions();
	}
}
