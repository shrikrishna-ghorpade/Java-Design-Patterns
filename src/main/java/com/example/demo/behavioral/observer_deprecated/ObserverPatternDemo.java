/**
 * 
 */
package com.example.demo.behavioral.observer_deprecated;

/**
 * @author Shrikrishna Ghorpade
 *
 */
class ObserverPatternDemo {

	public static void main(String[] args) {

		MyTopic topic = new MyTopic("Topic 1");

		Observer observer1 = new Subscriber("One");
		Observer observer2 = new Subscriber("Two");

		topic.registerObserver(observer1);
		topic.registerObserver(observer2);

		observer1.setSubject(topic);
		observer2.setSubject(topic);

		topic.doSomething();
	}
}
