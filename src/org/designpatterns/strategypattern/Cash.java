package org.designpatterns.strategypattern;

class Cash implements PaymentStrategy {

	private String name;
	private String id;

	private Cash() {
	}

	public static final Cash cashPayment(String name, String id) {

		Cash cash = new Cash();
		if (name != null) {
			cash.setName(name);
		}
		if (id != null) {
			cash.setId(id);
		}

		return cash;
	}

	private final void setName(String name) {
		this.name = name;
	}

	private final void setId(String id) {
		this.id = id;
	}

	@Override
	public void payBy(int amount) {
		System.out.println("Cash " + amount);
	}

}
