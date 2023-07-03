package com.example.demo.structural.flyweight;

class EBookImpl implements EBook {

	private String bookName;
	
	private String author;
	
	public EBookImpl(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}

	@Override
	public void subscribeBook() {
		System.out.println("Book subscribed " + bookName + " of " + author);
	}

	@Override
	public void unsubcribeBook() {
		System.out.println("Book unsubscribed " + bookName + " of " + author);
	}

	@Override
	public String toString() {
		return "EBookImpl [bookName=" + bookName + ", author=" + author + "] Hashcode : " + super.hashCode();
	}
}
