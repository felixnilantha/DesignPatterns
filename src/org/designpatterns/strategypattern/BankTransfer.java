package org.designpatterns.strategypattern;

//Bank transfer
class BankTransfer implements PaymentStrategy {

	private String accountName;
	private String bsb;
	private String accountNumber;

	private BankTransfer() {
	}

	public static final BankTransfer bankTransfer(String accountName, String bsb, String accountNumber) {

		BankTransfer bankTransfer = new BankTransfer();
		if (accountName != null) {
			bankTransfer.setAccountName(accountName);
		}
		if (bsb != null) {
			bankTransfer.setBsb(bsb);

		}
		if (accountNumber != null) {
			bankTransfer.setAccountNumber(accountNumber);
		}
		return bankTransfer;
	}

	private final void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	private final void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	private final void setBsb(String bsb) {
		this.bsb = bsb;
	}

	@Override
	public void payBy(int amount) {
		System.out.println("Bank Transfer " + amount);
	}

}