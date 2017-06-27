package org.designpatterns.observerpattern;

import java.util.Observable;

public class GrabStock {

	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();
		StockObserver observer1 = new StockObserver(stockGrabber);
		stockGrabber.setIbmPrice(245.34);
		stockGrabber.setAaplPricce(700.24);
		stockGrabber.setGoogPrice(679.30);;
	}

}
