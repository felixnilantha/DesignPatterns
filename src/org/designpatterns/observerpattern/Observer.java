package org.designpatterns.observerpattern;

// thing that can observe
// this is the thing that has interest on the changes 
// Once subject could be having zero to many (0,*) observers
public interface Observer {

	public void update();

}
