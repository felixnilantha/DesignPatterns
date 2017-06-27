package org.designpatterns.strategypattern;

//There could be many methonds of payments
//1. Cash
//2. Credit Card
//3. Paypal
//3. Bank Transfer

public interface PaymentStrategy {

	void payBy(int amount);

}






