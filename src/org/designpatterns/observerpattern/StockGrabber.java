package org.designpatterns.observerpattern;

import java.util.ArrayList;

// Concrete observable class will implements the interface Observable or the subject
// In this example StockGrabber is the concrete class implementing the Observable interface subject
public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPricce;
	private double googPrice;

	public StockGrabber() {

		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);

	}

	@Override
	public void unregister(Observer deleteObserver) {

		int observerIndex = observers.indexOf(observers);
		System.out.println("Observer :" + (observerIndex + 1) + "delete");
		observers.remove(observerIndex);
	}

	// this is the heart of the observer pattern, this is iterate over the
	//  <collection> of observers and call the update method
	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update();
		}

	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public void setAaplPricce(double aaplPricce) {
		this.aaplPricce = aaplPricce;
		notifyObserver();
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}

	public  double getIbmPrice() {
		return ibmPrice;
	}

	public  double getAaplPricce() {
		return aaplPricce;
	}

	public double getGoogPrice() {
		return googPrice;
	}
	
	

}
