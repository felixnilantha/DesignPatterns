package org.designpatterns.strategypattern;

//Paypal
class Paypal implements PaymentStrategy {

	private String email;
	private String password;

	private Paypal() {
	}

	public static final Paypal paypalPayment(String email, String password) {

		Paypal payPal = new Paypal();
		if (email != null) {
			payPal.setEmail(email);
		}
		if (password != null) {
			payPal.setPassword(password);
		}

		return payPal;
	}

	private final void setEmail(String email) {
		this.email = email;
	}

	private final void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void payBy(int amount) {
		System.out.println("Paypal " + amount);
	}

}
