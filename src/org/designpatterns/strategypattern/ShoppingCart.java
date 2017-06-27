package org.designpatterns.strategypattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	List<Item> items;
	
	public ShoppingCart(){ this.items = new ArrayList<Item>();}
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public void removeItems(Item item){
		this.items.remove(item);
	}
	
	private int calculateItems(){
		
		int sum =0;
		for(Item item: items){
			sum+=item.getPrice();
		}
		
		return sum;
	}
	
	public void pay(PaymentStrategy paymentStrategy){
		paymentStrategy.payBy(calculateItems());
	}

}
