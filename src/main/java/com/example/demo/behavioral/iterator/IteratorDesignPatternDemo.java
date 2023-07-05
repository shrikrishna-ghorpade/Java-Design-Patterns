package com.example.demo.behavioral.iterator;

class IteratorDesignPatternDemo {

	public static void main(String[] args) {

		String[] arr = { "ABC", "PQR", "XYZ", "LMN" };

		IterableObject iterableObject = new IterableObject(arr);

		for (Iterator iter = iterableObject.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}
}
