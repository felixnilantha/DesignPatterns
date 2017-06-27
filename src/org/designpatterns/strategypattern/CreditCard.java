package org.designpatterns.strategypattern;

//Credit Card
class CreditCard implements PaymentStrategy {

	private String name;
	private String cardNumber;

	private String cvv;
	private String expiryDate;

	private CreditCard() {
	}

	public static final CreditCard creditCardPayment(String name, String cardNumber, String cvv, String expiryDate) {

		CreditCard creditCard = new CreditCard();
		if (name != null) {
			creditCard.setName(name);
		}
		if (cardNumber != null) {
			creditCard.setCardNumber(cardNumber);
		}
		if (cvv != null) {
			creditCard.setCvv(cvv);
		}
		if (expiryDate != null) {
			creditCard.setExpiryDate(expiryDate);

		}

		return creditCard;

	}

	public final void setName(String name) {
		this.name = name;
	}

	private final void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	private final void setCvv(String cvv) {
		this.cvv = cvv;
	}

	private final void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public void payBy(int amount) {
		
		System.out.println("Credit Card : " +  amount);
	}

	@Override
	public String toString() {
		return "CreditCard [name=" + name + ", cardNumber=" + cardNumber + ", cvv=" + cvv + ", expiryDate=" + expiryDate
				+ "]";
	}
	
	
	
	

}
