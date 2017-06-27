package org.designpatterns.observerpattern;


/// this is the observable or this that can be observed 
// this is the thing that under go chan ges 
public interface Subject {
	// adding observes to observable or to subject
	public void register(Observer o);
	
	// removing observers from observable or from subject
	public void unregister(Observer o);
	
	// broadcaster
	public void notifyObserver();

}
