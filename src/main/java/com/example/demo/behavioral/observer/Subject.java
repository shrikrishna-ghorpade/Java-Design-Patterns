/**
 * 
 */
package com.example.demo.behavioral.observer;

/**
 * @author Shrikrishna Ghorpade
 *
 */
interface Subject {

	public void registerObserver(Observer observer);

	public void deregisterObserver(Observer observer);

	public void doSomething();

	public void notifyObservers();

	public String getUpdate(Observer observer);
}
