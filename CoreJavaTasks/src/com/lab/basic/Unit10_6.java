package com.lab.basic;

public class Unit10_6 {

	private double acc_balance = 0;

	public Unit10_6(double acc_balance) {
		super();
		this.acc_balance = acc_balance;
	}

	void withdraw(int amount) {
		try {
			if (amount > acc_balance) {
				throw new WithdrawException("Insufficient balance");
			} else {
				System.out.println("withdraw amount success");
			}
		} catch (WithdrawException we) {
			System.out.println(we);
		}

	}

	void showBalance() {
		System.out.println("Balance :5000 ");
	}

	public static void main(String[] args) {
		Unit10_6 ac = new Unit10_6(25000);// initial balance set
		ac.withdraw(30000); // handle exception --> Insufficient balance
		ac.withdraw(20000); // fine
		ac.showBalance(); // Balance: 5000
		ac.withdraw(100000); // handle exception --> Insufficient balance
		ac.showBalance(); // Balance: 5000
	}

}

class WithdrawException extends Exception {

	String msg;

	public WithdrawException(String msg) {
		super(msg);
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Withdrawl Exception : " + msg;
	}
}
