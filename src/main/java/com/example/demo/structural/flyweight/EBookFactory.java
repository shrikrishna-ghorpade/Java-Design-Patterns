package com.example.demo.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class EBookFactory {

	Map<String, EBookImpl> ebookMap = new HashMap<>();
	
	public EBook getEBook(String bookName, String authorName) {
		
		if(!ebookMap.containsKey(bookName+authorName)) {
			ebookMap.put(bookName+authorName, new EBookImpl(bookName, authorName));
		}
		return ebookMap.get(bookName+authorName);
	}
	
}
