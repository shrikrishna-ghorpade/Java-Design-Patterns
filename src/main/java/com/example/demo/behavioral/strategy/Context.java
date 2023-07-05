package com.example.demo.behavioral.strategy;

class Context {

	private Programmer programmer;

	public Context(Programmer programmer) {
		this.programmer = programmer;
	}

	public void doProgramming() {
		System.out.println(programmer.doProgramming());
	}
}
