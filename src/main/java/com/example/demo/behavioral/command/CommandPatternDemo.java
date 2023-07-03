package com.example.demo.behavioral.command;

class CommandPatternDemo {
	public static void main(String[] args) {

		Order order = new Order();
		ApplyCuponCommand applyCuponCommand = new ApplyCuponCommand(order);
		ApplyTaxCommand applyTaxCommand = new ApplyTaxCommand(order);
		
		applyCuponCommand.execute();
		applyTaxCommand.execute();
	}
}
