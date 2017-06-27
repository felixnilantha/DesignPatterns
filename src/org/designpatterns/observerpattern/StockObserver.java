package org.designpatterns.observerpattern;

// Concrete observer class which will implement the observer interface
// In this example StockObserver is the concrete class and Observer is the interface
public class StockObserver implements Observer{

	

	private static int observerIdTracker = 0;

	private int observerId;
	
	private StockGrabber stockGrabber;

	// this is in way coupling to a concretion
	public StockObserver(StockGrabber stockGrabber) {

		this.stockGrabber = stockGrabber;

		this.observerId = ++observerIdTracker;

		System.out.println("New Observer " + this.observerId);
		stockGrabber.register(this);
	}

	@Override
	public void update() {
		
		double ibmPrice=this.stockGrabber.getIbmPrice();
		double aaplPricce=this.stockGrabber.getAaplPricce();
		double googPrice=this.stockGrabber.getGoogPrice();
		System.out.println(observerId + "\nIBM: " + ibmPrice + "\nAAPL: " + aaplPricce + "\nGOOG :" + googPrice + "\n");

	}


	
	

}
