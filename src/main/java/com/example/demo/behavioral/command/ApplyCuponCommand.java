package com.example.demo.behavioral.command;

class ApplyCuponCommand implements OrderCommandInterface {

	private Order order;

	public ApplyCuponCommand(Order order) {
		super();
		this.order = order;
	}

	@Override
	public void execute() {
		order.applyCupon();
	}
}
