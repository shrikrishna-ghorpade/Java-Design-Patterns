package com.example.demo.behavioral.command;

class ApplyTaxCommand implements OrderCommandInterface {

	private Order order;

	public ApplyTaxCommand(Order order) {
		super();
		this.order = order;
	}

	@Override
	public void execute() {
		order.applyTax();
	}
}
