package org.designpatterns.strategypattern;

public class ShoppingCartTest {

	public static void main(String[] args) {
		Item item1 =Item.createItem("001", 35);
		Item item2 =Item.createItem("002", 25);
		
		Item item3 =Item.createItem("001", 10);
		Item item4 =Item.createItem("002", 12);
		

		ShoppingCart cart1 = new ShoppingCart();
		cart1.addItem(item1);
		cart1.addItem(item2);
		cart1.pay(CreditCard.creditCardPayment("Nilantha", "1234 5678 0987 6543", "123", "12-12-1999"));
		
		ShoppingCart cart2 = new ShoppingCart();
		cart2.addItem(item3);
		cart2.addItem(item4);
		cart2.pay(Paypal.paypalPayment("felixnilantha@gmail.com", "password"));

	}

}
