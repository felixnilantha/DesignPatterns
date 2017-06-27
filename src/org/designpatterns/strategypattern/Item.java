package org.designpatterns.strategypattern;

public class Item {

	private String itemCode;
	private int price;

	private Item() {
	}

	public static final Item createItem(String itemCode, int price) {

		Item item = new Item();
		if (itemCode != null) {
			item.setItemCode(itemCode);
		}
		if (price > 0) {
			item.setPrice(price);
		}

		return item;

	}

	private final void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	private final void setPrice(int price) {
		this.price = price;
	}

	public final int getPrice() {
		return price;
	}

}
