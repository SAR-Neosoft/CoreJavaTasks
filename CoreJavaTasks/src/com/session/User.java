package com.session;

import java.util.ArrayList;
import java.util.Date;

interface Account {
	final double  limit = 10000, limit1 = 200;

	void deposit(double n, Date d);

	void withdraw(double n, Date d);
}

class User implements Account {
	String username, password, name, address, phone;
	double balance;
	ArrayList<String> transactions;

	User(String username, String password, String name, String address, String phone, double balance, Date date) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.balance = balance;
		transactions = new ArrayList<String>(5);
		addAmount(String.format("Initial deposit - " + balance
				+ " as on " + "%1$tD" + " at " + "%1$tT.", date));
	}

	void update(Date date) {
		if (balance >= 10000) {
			balance +=  balance;
		} else {
			balance -= (int) (balance / 100.0);
		}
		addAmount(String.format("Account updated. Balance - " +balance
				+ " as on " + "%1$tD" + " at " + "%1$tT.", date));
	}

	@Override
	public void deposit(double amount, Date date) {
		balance += amount;
		addAmount(String.format(username+" "+
				amount + " credited to your account. Balance - "
						+ balance+ " as on " + "%1$tD" + " at " + "%1$tT.",
				date));
	}

	@Override
	public void withdraw(double amount, Date date) {
		if (amount > (balance - 200)) {
			System.out.println("Insufficient balance.");
			return;
		}
		balance -= amount;
		addAmount(String.format(username+" "+
				amount + " debited from your account. Balance - "
						+balance + " as on " + "%1$tD" + " at " + "%1$tT.",
				date));
	}

	private void addAmount(String message) {
		transactions.add(0, message);
		if (transactions.size() > 5) {
			transactions.remove(5);
			transactions.trimToSize();
		}
	}
}
