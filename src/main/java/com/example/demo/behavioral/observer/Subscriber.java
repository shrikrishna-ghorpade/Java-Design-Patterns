/**
 * 
 */
package com.example.demo.behavioral.observer;

/**
 * @author Shrikrishna Ghorpade
 *
 */
class Subscriber implements Observer {

	private Subject subject;
	private String name;

	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("This subscriber executed " + name);
		String updatedString = subject.getUpdate(this);
		System.out.println("Message received : " + updatedString);
	}

	@Override
	public void setSubject(Subject sub) {
		this.subject = sub;
	}
}
