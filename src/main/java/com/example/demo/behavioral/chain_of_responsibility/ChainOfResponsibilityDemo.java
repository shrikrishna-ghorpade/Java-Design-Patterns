package com.example.demo.behavioral.chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

class ChainOfResponsibilityDemo {
	
	public static void main(String[] args) {

		List<String> fullList = new ArrayList<>();
		fullList.addAll(List.of("FIRST", "ABC", "PQR", " ", "123", "0", "@", "#", "jkasdhioeuru", "sjdiljdenchhbdei"));
		
		FilterClass filterClass = new FilterClass(new FilterClass(new FilterClass(new FilterClass(fullList), "SMALL"), "BIG"), "REMOVE_FIRST");
		
		System.out.println(filterClass.filter());
	}
}
