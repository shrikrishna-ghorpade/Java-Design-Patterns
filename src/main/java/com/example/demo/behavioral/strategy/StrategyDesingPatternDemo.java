package com.example.demo.behavioral.strategy;

public class StrategyDesingPatternDemo {

	public static void main(String[] args) {
		
		Context context = new Context(new JavaProgrammer());
		context.doProgramming();
		
		context = new Context(new DotNetProgrammer());
		context.doProgramming();
		
		context = new Context(new JsProgrammer());
		context.doProgramming();
	}
}
