/**
 * 
 */
package com.example.demo.behavioral.observer_deprecated;

/**
 * @author Shrikrishna Ghorpade
 *
 */
public interface Subject {

	public void registerObserver(Observer observer);

	public void deregisterObserver(Observer observer);

	public void doSomething();

	public void notifyObservers();

	public String getUpdate(Observer observer);
}
