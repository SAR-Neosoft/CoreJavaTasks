package com.bankApp;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class Bank {
	Map<String, User> userMap = new HashMap<String, User>();
	ArrayList<String> transactions = new ArrayList<String>(5);
	// Map<Integer, String> transactions = new HashMap<Integer, String>(5);
	// Map<String, ArrayList<String>> transactions = new HashMap<String,
	// ArrayList<String>>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username, password, payee;
		User user;
		Bank bank = new Bank();
		ObjectOutputStream oos = null;
		String outputFile = "resource/Bank.txt";
		ObjectInputStream ois = null;
		String inputFile = "resource/Bank.txt";
		String trInputFile = "resource/Transactions.txt";
		File f = new File(outputFile);

		double amount;

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
				// -------------------------------------------------------

				try {
					ois = new ObjectInputStream(new FileInputStream(inputFile));
					if (f.length() != 0) {

						bank.userMap = (Map<String, User>) ois.readObject();
					}

				} catch (EOFException e) {
					System.out.println("its end of the record");
				}

				catch (Exception e) {
					e.printStackTrace();

				} finally {
					if (ois != null)
						try {
							ois.close();
						} catch (IOException e) {
							System.out.println();
						}

				}
				// --------------------------------------------------------

				while (bank.userMap.containsKey(username)) {
					System.out.println("Username already exists. Set again : ");
					username = sc.next();
				}
				System.out.println(
						"Set a password (minimum 8 chars; minimum 1 digit, 1 lowercase, 1 uppercase, 1 special character[!@#$%^&*_]) :");
				password = sc.next();
				sc.nextLine();
				while (!password.matches((("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*_]).{8,}")))) {
					System.out.println("Invalid password . Set again :");
					password = sc.next();
				}
				System.out.println("Enter initial deposit :10000 ");
				amount = sc.nextDouble();
//				while (!sc.hasNextDouble()) {
//					System.out.println("Invalid amount. Enter again :");
//					amount=sc.nextDouble();
//				}

//				sc.nextLine();
				user = new User(name, address, phone, username, password, amount, new Date());
				try {
					oos = new ObjectOutputStream(new FileOutputStream(outputFile));
//					if(f.length()==0)
					bank.userMap.put(username, user);
					for (Entry<String, User> entry : bank.userMap.entrySet())
						oos.writeObject(bank.userMap);
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (oos != null)
						try {
							oos.close();
						} catch (IOException e) {
							System.out.println();
						}

				}

				break;
			case 2:
				System.out.println("Enter username : ");
				username = sc.next();
				sc.nextLine();
				System.out.println("Enter password : ");
				password = sc.next();
				sc.nextLine();

				try {
					ois = new ObjectInputStream(new FileInputStream(inputFile));

					while (true) {
						bank.userMap = (Map<String, User>) ois.readObject();
						System.out.println(bank.userMap);
						// System.out.println(bank.userMap);
						if (bank.userMap.containsKey(username)) {
							user = bank.userMap.get(username);
							if (bank.userMap.get(username).getPassword().equals(password)) {
//							System.out.println("hi");
								while (true) {

									System.out.println("\n---------------------------------");
									System.out.println("W  E  L  C  O  M  E, " + username.toUpperCase());
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
//									while (!sc.hasNextDouble()) {
//										System.out.println("Invalid amount. Enter again :");
//										sc.nextLine();
//									}
										amount = sc.nextDouble();
										sc.nextLine();
										System.out.println(amount);

										deposit(amount, new Date(), bank, username, user, payee = null);
										break;
									case 2:
										System.out.print("Enter payee username : ");
										payee = sc.next();
										sc.nextLine();
										System.out.println("Enter amount : ");
//									while (!sc.hasNextDouble()) {
//										System.out.println("Invalid amount. Enter again :");
//										sc.nextLine();
//									}
										amount = sc.nextDouble();
										sc.nextLine();
//									if (amount > 300000) {
//										System.out.println("Transfer limit exceeded. Contact bank manager.");
//										break;
//									}
										// --------------------------------------------------------------------------------
										try {
											ois = new ObjectInputStream(new FileInputStream(inputFile));

//									 while(true) {
											bank.userMap = (Map<String, User>) ois.readObject();
//										System.out.println("whil");
//										System.out.println(bank.userMap);
//										System.out.println(bank.userMap.get(username).getPassword().equals(password));
											if (bank.userMap.containsKey(payee)) {
												withdraw(amount, new Date(), bank, username, user);
												deposit(amount, new Date(), bank, username, bank.userMap.get(payee),
														payee);

											} else {
												System.out.println("Username doesn't exist.");
											}
										} catch (EOFException e) {
											System.out.println("its end of the record");
										}

										catch (Exception e) {
											e.printStackTrace();

										} finally {
											if (ois != null)
												try {
													ois.close();
												} catch (IOException e) {
													System.out.println();
												}

										}
										break;
									case 3:
										try {
											ois = new ObjectInputStream(new FileInputStream(trInputFile));

											while (true) {
												bank.transactions = (ArrayList<String>) ois.readObject();
												for (String tr : bank.transactions)
													if (tr.contains(username))
														System.out.println(tr);

											}
										} catch (EOFException e) {
											System.out.println("its end of the record");
										}

										catch (Exception e) {
											e.printStackTrace();

										} finally {
											if (ois != null)
												try {
													ois.close();
												} catch (IOException e) {
													System.out.println();
												}

										}

//									Set set = bank.transactions.entrySet();
//							        Iterator iterator = set.iterator();
//							  
//							        while (iterator.hasNext()) {
//							            Map.Entry entry = (Map.Entry)iterator.next();
//							            System.out.println();
//							        }
//									for (String transactions : user.transactions) {
//										System.out.println(transactions);
//									}
										break;
									case 4:
										System.out.println("Accountholder name : " + user.getName());
										System.out.println("Accountholder address : " + user.getAddress());
										System.out.println("Accountholder contact : " + user.getPhone());
										break;
									case 5:
										continue dashbord;
									default:
										System.out.println("Wrong choice !");
									}

								}

							} else {
								System.out.println("wrong password");

							}
						} else {
							System.out.println("user name dosnt exist");
						}

					}
				} catch (OptionalDataException e) {
					System.out.println();
				} catch (EOFException e) {
					System.out.println();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (oos != null)
						try {
							oos.close();
						} catch (IOException e) {
							System.out.println();
						}

				}

				break;
			case 3:
				System.out.println("Enter username : ");
				username = sc.next();
				user = bank.userMap.get(username);
				if (bank.userMap.containsKey(username)) {
					bank.userMap.replace(username, new User(user.getName(), user.getAddress(), user.getPhone(),
							user.getName(), user.getPassword(), user.getAmount(), new Date()));
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

	private static void deposit(double amount, Date date, Bank bank, String username, User user, String payee) {
		if (payee != null) {
			double preamount = (bank.userMap.get(payee).getAmount());
			double transferingAmount = (bank.userMap.get(username).getAmount());
			if (amount > transferingAmount) {
				System.out.println("Insufficient balance.");

			} else {
				preamount = preamount + amount;

				bank.userMap.get(payee).setAmount(preamount);

				// -----------------------------------------------------------------
				ObjectOutputStream oos = null;
				String outputFile = "resource/Bank.txt";

				try {
					oos = new ObjectOutputStream(new FileOutputStream(outputFile));

					bank.userMap.replace(payee, new User(user.getName(), user.getAddress(), user.getPhone(), payee,
							user.getPassword(), preamount, user.getDate()));
					System.out.println("user ye payee  : " + user);

					for (Entry<String, User> entry : bank.userMap.entrySet())
						oos.writeObject(bank.userMap);
					oos.close();
				} catch (OptionalDataException e) {
					System.out.println();
				}

				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (oos != null)
						try {
							oos.close();
						} catch (IOException e) {
							System.out.println();
						}

				}

				depositAmount(String.format(payee + ", amount " + amount + " credited to your account. Balance - "
						+ preamount + " as on " + "%1$tD" + " at paye " + "%1$tT.", date), bank, payee);
			}
		}
		// -------------------------------------------------------------------
		else {

			double preamount = (bank.userMap.get(username).getAmount());
			preamount = preamount + amount;

			bank.userMap.get(username).setAmount(preamount);

			ObjectOutputStream oos = null;
			String outputFile = "resource/Bank.txt";

			try {
				oos = new ObjectOutputStream(new FileOutputStream(outputFile));

				bank.userMap.replace(username, new User(user.getName(), user.getAddress(), user.getPhone(), username,
						user.getPassword(), preamount, user.getDate()));

				for (Entry<String, User> entry : bank.userMap.entrySet())
					oos.writeObject(bank.userMap);
				oos.close();
			} catch (OptionalDataException e) {
				System.out.println();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (oos != null)
					try {
						oos.close();
					} catch (IOException e) {
						System.out.println();
					}

			}

			depositAmount(String.format(username + ", amount " + amount + " credited to your account. Balance - "
					+ preamount + " as on " + "%1$tD" + " at user " + "%1$tT.", date), bank, username);

		}

	}

	public static void withdraw(double amount, Date date, Bank bank, String username, User user) {
		// TODO Auto-generated method stub
		double preamount = (bank.userMap.get(username).getAmount());
		if (amount > preamount) {
			System.out.println("Insufficient balance.");

		} else {
			preamount = preamount - amount;
			bank.userMap.get(username).setAmount(preamount);

			// -----------------------------------------------------------------
			ObjectOutputStream oos = null;
			String outputFile = "resource/Bank.txt";

			try {
				oos = new ObjectOutputStream(new FileOutputStream(outputFile));

//		System.out.println("user ye  : "+user);
				bank.userMap.replace(username, new User(user.getName(), user.getAddress(), user.getPhone(), username,
						user.getPassword(), preamount, user.getDate()));
//	    System.out.println("user u "+user);

				for (Entry<String, User> entry : bank.userMap.entrySet())
					oos.writeObject(bank.userMap);
				oos.close();
			} catch (OptionalDataException e) {
				System.out.println();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (oos != null)
					try {
						oos.close();
					} catch (IOException e) {
						System.out.println();
					}
			}
			depositAmount(String.format(username + ", amount " + amount + " debited from your account. Balance - "
					+ preamount + " as on " + "%1$tD" + " at with " + "%1$tT.", date), bank, username);
		}

		// -------------------------------------------------------------------

	}

	private static void depositAmount(String format, Bank bank, String username) {
		// TODO Auto-generated method stub

		ObjectOutputStream oos = null;
		String outputFile = "resource/Transactions.txt";

		try {
			oos = new ObjectOutputStream(new FileOutputStream(outputFile));
			bank.transactions.add(0, format);

//			for (String t:bank.transactions)
			oos.writeObject(bank.transactions);
			oos.close();
			System.out.println("serilization is done");
		}

		catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (oos != null)
				try {
					oos.close();
				} catch (IOException e) {
					System.out.println();
				}

		}

	}

}
