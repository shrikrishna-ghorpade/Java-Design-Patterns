package com.example.demo.structural.bridge;

interface Question {

	public void nextQuestion();

	public void previousQuestion();

	public void newQuestion(String q);

	public void deleteQuestion(String q);

	public void displayQuestion();

	public void displayAllQuestions();
}