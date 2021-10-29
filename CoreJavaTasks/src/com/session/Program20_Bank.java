package com.session;
import java.util.*;
import java.text.*;


class Program20_Bank {
	Map<String, User> userMap;

	Program20_Bank() {
		userMap = new HashMap<String, User>();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user;
		String username, password;
		double amount;
		Program20_Bank bank = new Program20_Bank();
		int choice;
		dashbord: while (true) {
			System.out.println("\n-------------------");
			System.out.println("BANK    OF     MyBank");
			System.out.println("-------------------\n");
			System.out.println("1. Register account.");
			System.out.println("2. Login.");
			System.out.println("3. Update accounts.");
			System.out.println("4. Exit.");
			System.out.print("\nEnter your choice : ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.print("Enter name : ");
				String name = sc.nextLine();
				System.out.print("Enter address : ");
				String address = sc.nextLine();
				System.out.print("Enter contact number : ");
				String phone = sc.nextLine();
				System.out.println("Set username : ");
				username = sc.next();
				while (bank.userMap.containsKey(username)) {
					System.out.println("Username already exists. Set again : ");
					username = sc.next();
				}
				System.out.println(
						"Set a password (minimum 8 chars; minimum 1 digit, 1 lowercase, 1 uppercase, 1 special character[!@#$%^&*_]) :");
				password = sc.next();
				sc.nextLine();
				while (!password.matches((("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*_]).{8,}")))) {
					System.out.println("Invalid password condition. Set again :");
					password = sc.next();
				}
				System.out.println("Enter initial deposit :10000 ");
				sc.nextLine();
				while (!sc.hasNextDouble()) {
					System.out.println("Invalid amount. Enter again :");
					sc.nextLine();
				}
				amount = sc.nextDouble();
				sc.nextLine();
				user = new User(username, password, name, address, phone, amount, new Date());
				bank.userMap.put(username, user);
				break;
			case 2:
				System.out.println("Enter username : ");
				username = sc.next();
				sc.nextLine();
				System.out.println("Enter password : ");
				password = sc.next();
				sc.nextLine();
				if (bank.userMap.containsKey(username)) {
					user = bank.userMap.get(username);
					if (user.password.equals(password)) {
						while (true) {
							System.out.println("\n---------------------------------");
							System.out.println("W  E  L  C  O  M  E, "+username.toUpperCase());
							System.out.println("-----------------------------------\n");
							System.out.println("1. Deposit.");
							System.out.println("2. Transfer.");
							System.out.println("3. Last 5 transactions.");
							System.out.println("4. User information.");
							System.out.println("5. Log out.");
							System.out.print("\nEnter your choice : ");
							choice = sc.nextInt();
							sc.nextLine();
							switch (choice) {
							case 1:
								System.out.print("Enter amount : ");
								while (!sc.hasNextDouble()) {
									System.out.println("Invalid amount. Enter again :");
									sc.nextLine();
								}
								amount = sc.nextDouble();
								sc.nextLine();
								user.deposit(amount, new Date());
								break;
							case 2:
								System.out.print("Enter payee username : ");
								username = sc.next();
								sc.nextLine();
								System.out.println("Enter amount : ");
								while (!sc.hasNextDouble()) {
									System.out.println("Invalid amount. Enter again :");
									sc.nextLine();
								}
								amount = sc.nextDouble();
								sc.nextLine();
								if (amount > 300000) {
									System.out.println("Transfer limit exceeded. Contact bank manager.");
									break;
								}
								if (bank.userMap.containsKey(username)) {
									User payee = bank.userMap.get(username);
									payee.deposit(amount, new Date());
									user.withdraw(amount, new Date());
								} else {
									System.out.println("Username doesn't exist.");
								}
								break;
							case 3:
								for (String transactions : user.transactions) {
									System.out.println(transactions);
//									if(transactions.contains(username)) {
//										System.out.println(transactions);
//									}
									
								}
								
								break;
							case 4:
								System.out.println("Accountholder name : " + user.name);
								System.out.println("Accountholder address : " + user.address);
								System.out.println("Accountholder contact : " + user.phone);
								break;
							case 5:
								continue dashbord;
							default:
								System.out.println("Wrong choice !");
							}
						}
					} else {
						System.out.println("Wrong username/password.");
					}
				} else {
					System.out.println("Wrong username/password.");
				}
				break;
			case 3:
				System.out.println("Enter username : ");
				username = sc.next();
				if (bank.userMap.containsKey(username)) {
					bank.userMap.get(username).update(new Date());
				} else {
					System.out.println("Username doesn't exist.");
				}
				break;
			case 4:
				System.out.println("\nThank you for choosing Bank Of MyBank.");
				System.exit(1);
				break;
			default:
				System.out.println("Wrong choice !");
			}
		}
	}
}