/**
 * Author:		Andrew Lane
 * Date:		11/11/22
 * File:        BankApplication.java
 * Description: (replace w/ description of program)
 */

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);		
		
		CheckingAccount account = new CheckingAccount();
		
		// Asks user for unique account ID
		System.out.print("Enter unique account ID: ");
		account.setUniqueID(keyboard.nextLine());
		
		while(account.getUniqueID().length() < 4) {
			System.out.print("ERROR: ID must contain at least 4 characters.\nEnter unique account ID: ");
			account.setUniqueID(keyboard.nextLine());
		}
		
		// Asks user for account balance in $
		System.out.print("Enter initial account balance: $");
		account.setAcctBalance(keyboard.nextDouble());
	
		while(account.getAcctBalance() < 500) {
			System.out.print("ERROR. Account must contain at least $500.\nEnter initial account balance: $");
			account.setAcctBalance(keyboard.nextDouble());
		}
		
		// Asks user for annual interest rate
		System.out.print("Enter annual interest rate %: ");
		account.setAnnualInterestRate(keyboard.nextDouble());
		
		// Option selection do-while loop
		int	choice = 0;
		do {
			optionsBanner();
		
			// Asks user to select an option
			System.out.print(
				"1. Deposit\n"
			  + "2. View Daily Interest Rate\n"
			  + "3. View Account Details\n"
			  + "4. Exit\n");
			line();
		
			// Accepts user's option then validates it
			System.out.print("Enter your choice: ");
			choice = keyboard.nextInt();	
		
			while(choice != 1 && choice != 2 && choice != 3 && choice != 4) {
				System.out.print("ERROR. Choice must be 1, 2, 3 or 4\n" + "Re-Enter choice: ");
				choice = keyboard.nextInt();
			}
			// switch for each of the options given to the user
			switch(choice) {
				case 1: {
					System.out.print("Enter deposit ammount: $");
					double deposit = keyboard.nextDouble();
					while(deposit <= 0) {
						System.out.print("ERROR. Deposit ammount must be greater than $0\nEnter deposit ammount: $");
					}
					account.depositCash(deposit);
					System.out.printf("New balance is $" + "%.2f", account.getAcctBalance());
					System.out.println("\n");
					break;
				}
				case 2:{
					System.out.printf("Your daily intrest is: $ %.2f" , account.getDailyIntRate(account.getAnnualInterestRate()));
					break;
				}
				case 3:{
					System.out.println(account);
					break;
				}		
			}		
		}while(choice != 4);
		
		System.out.println("\nExiting program...");
	}	
	
	// method for creating the ever so fancy line
	public static void line() {
		int x = 34;
		for(int i = 1; i <= x; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	// prints the options banner 
	public static void optionsBanner() {
	int x = 34;	
		System.out.println();
		line();
		System.out.printf("=" + "%24s","Available Options");
		System.out.printf("%10s", "=\n");
		line();
	}
	
}
