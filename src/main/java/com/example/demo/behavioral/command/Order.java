package com.example.demo.behavioral.command;

import java.util.List;

class Order {

	private String orderName;

	private List<String> items;

	private Integer price;

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public void applyTax() {
		System.out.println("Tax applied");
	}

	public void applyCupon() {
		System.out.println("Cupon applied");
	}
}
